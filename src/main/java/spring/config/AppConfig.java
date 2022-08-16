package spring.config;

import org.springframework.context.annotation.*;
import spring.service.beanfactory.MobileServiceFactoryBean;

@Configuration
@ComponentScan("spring")
@Profile("!test")
public class AppConfig {

}
