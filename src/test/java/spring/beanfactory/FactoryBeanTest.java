package spring.beanfactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.config.bpp.AppConfigBPPTest;
import spring.service.beanfactory.MobileService;

import static org.junit.Assert.assertEquals;

@ActiveProfiles("test_bpp")
@SpringJUnitConfig(AppConfigBPPTest.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class FactoryBeanTest {

    @Autowired
    private MobileService mobileService;

    @Test
    public void printNameTest() {
        assertEquals("Kirill", mobileService.getName());
    }

}
