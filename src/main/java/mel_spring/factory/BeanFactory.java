package mel_spring.factory;

import lombok.SneakyThrows;
import mel_spring.annotation.Autowired;
import mel_spring.annotation.Component;
import mel_spring.core.BeanNameAware;
import mel_spring.core.BeanPostProcessor;
import mel_spring.core.InitializingBean;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.util.Assert;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.*;

public class BeanFactory {

    private final Map<String, Object> singletons = new HashMap<>();
    private final List<BeanPostProcessor> postProcessors = new ArrayList<>();

    public <T> T getBean(Class<T> beanClass) {
        Assert.notNull(beanClass, "Required type must not be null");
        String beanName = beanClass.getSimpleName().substring(0, 1).toLowerCase() + beanClass.getSimpleName().substring(1);
        Object resolved = singletons.get(beanName);
        if (resolved == null) {
            throw new NoSuchBeanDefinitionException(beanClass);
        } else {
            return (T) resolved;
        }
    }

    @SneakyThrows
    public void instantiate(String basePackage) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        String path = basePackage.replace('.', '/');
        Enumeration<URL> resources = classLoader.getResources(path);
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();

            File file = new File(resource.toURI());
            for (File classFile : Objects.requireNonNull(file.listFiles())) {
                String fileName = classFile.getName();//ProductService.class
                if (fileName.endsWith(".class")) {
                    String className = fileName.substring(0, fileName.lastIndexOf("."));
                    Class<?> classObject = Class.forName(basePackage + "." + className);
                    if (classObject.isAnnotationPresent(Component.class)) {
                        System.out.println("Component: " + classObject);
                        Object instance = classObject.newInstance();
                        String beanName = className.substring(0, 1).toLowerCase() + className.substring(1);
                        singletons.put(beanName, instance);
                    }
                }
            }
        }
    }

    @SneakyThrows
    public void populateProperties() {
        System.out.println("==populateProperties==");
        for (Object object : singletons.values()) {
            for (Field field : object.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(Autowired.class)) {
                    for (Object dependency : singletons.values()) {
                        if (dependency.getClass().equals(field.getType())) {
                            String setterName = "set" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
                            Method setter = object.getClass().getMethod(setterName, dependency.getClass());
                            setter.invoke(object, dependency);
                            System.out.println("Dependency setter " + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1));
                        }
                    }
                }
            }
        }
    }

    public void injectBeanNames() {
        for (String name : singletons.keySet()) {
            Object bean = singletons.get(name);
            if (bean instanceof BeanNameAware) {
                ((BeanNameAware) bean).setBeanName(name);
                System.out.println("setBeanName = " + name);
            }
        }
    }

    public void initializeBeans() {
        for (String name : singletons.keySet()) {
            Object bean = singletons.get(name);
            for (BeanPostProcessor postProcessor : postProcessors) {
                postProcessor.postProcessBeforeInitialization(bean, name);
            }
            if (bean instanceof InitializingBean) {
                ((InitializingBean) bean).afterPropertiesSet(); //@PostConstruct
                System.out.println("afterPropertiesSet = " + bean.getClass().getSimpleName());
            }
            for (BeanPostProcessor postProcessor : postProcessors) {
                postProcessor.postProcessAfterInitialization(bean, name);
            }
        }
    }


    public void addPostProcessor(BeanPostProcessor postProcessor) {
        postProcessors.add(postProcessor);
    }

}
