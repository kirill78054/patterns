package mel_spring.service;

import mel_spring.annotation.Component;
import mel_spring.core.BeanNameAware;
import mel_spring.core.InitializingBean;

@Component
public class PromotionsService implements BeanNameAware, InitializingBean {

    private String beanName;

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setBeanName(String name) {
        beanName = name;
    }

    @Override
    public void afterPropertiesSet() {

    }

}
