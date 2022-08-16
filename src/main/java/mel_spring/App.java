package mel_spring;

import mel_spring.core.ApplicationContext;
import mel_spring.service.ProductService;
import mel_spring.service.PromotionsService;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext("mel_spring.service");
        ProductService productService = applicationContext.getBean(ProductService.class);
        PromotionsService promotionsService = productService.getPromotionsService();
    }

}
