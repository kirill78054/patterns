package spring.service.beanfactory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MobileServiceFactoryBean implements FactoryBean<MobileService> {

    public MobileServiceFactoryBean() {
        System.out.println("Constructor MobileServiceFactoryBean");
    }

    @Override
    public MobileService getObject() {
        System.out.println("Init MobileService");
        MobileServiceImpl mobileService = new MobileServiceImpl();
        mobileService.setName("Kirill");
        return mobileService;
    }

    @Override
    public Class<?> getObjectType() {
        return MobileServiceImpl.class;
    }

}
