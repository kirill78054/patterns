package spring.config.bpp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test_bpp")
@EnableAspectJAutoProxy
@ComponentScan({"spring.bpp", "spring.service.beanfactory"})
public class AppConfigBPPTest {
    

}
