package mel_spring.core;

import mel_spring.factory.BeanFactory;

public class ApplicationContext {

    private final BeanFactory beanFactory = new BeanFactory();

    public ApplicationContext(String basePackage) {
        System.out.println("****** Context is under construction ******");

        beanFactory.instantiate(basePackage);
        beanFactory.populateProperties();
        beanFactory.injectBeanNames();
        beanFactory.addPostProcessor(new CustomPostProcessor());
        beanFactory.initializeBeans();
    }

    public <T> T getBean(Class<T> beanClass) {
        return this.beanFactory.getBean(beanClass);
    }

}
