package spring.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class BeanFactoryPostProcessorImpl implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor postProcessBeanFactory");
        Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();
        beanNamesIterator.forEachRemaining(System.out::println);
        System.out.println();
    }

}
