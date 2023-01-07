package spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.config.AppConfigTest;
import spring.service.CustomerService;

@ActiveProfiles("test")
@SpringJUnitConfig(AppConfigTest.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AspectTest {

    @Autowired
    private CustomerService customerService;

    @Test
    public void oneTest() {
        customerService.printName("Kirill");
    }

}
