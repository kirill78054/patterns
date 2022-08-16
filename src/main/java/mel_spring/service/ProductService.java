package mel_spring.service;

import mel_spring.annotation.Autowired;
import mel_spring.annotation.Component;
import mel_spring.core.BeanNameAware;
import mel_spring.core.InitializingBean;

@Component
public class ProductService implements InitializingBean {

    @Autowired
    private PromotionsService promotionsService;

    public PromotionsService getPromotionsService() {
        return promotionsService;
    }

    public void setPromotionsService(PromotionsService promotionsService) {
        this.promotionsService = promotionsService;
    }

    @Override
    public void afterPropertiesSet() {

    }

}
