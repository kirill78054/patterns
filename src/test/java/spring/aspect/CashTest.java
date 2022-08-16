package spring.aspect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.config.AppConfigTest;
import spring.service.ClientCashService;

import static org.junit.Assert.assertEquals;

@ActiveProfiles("test")
@SpringJUnitConfig(AppConfigTest.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class CashTest {

    @Autowired
    private ClientCashService clientCashService;

    @Test
    public void cashTest() {
        assertEquals(0, clientCashService.getCount());
        assertEquals("Kirill", clientCashService.getNameAndCountPlus(0));
        assertEquals(1, clientCashService.getCount());
        assertEquals("Kirill", clientCashService.getNameAndCountPlus(0));
        assertEquals(1, clientCashService.getCount());
        assertEquals("Ivan", clientCashService.getNameAndCountPlus(1));
        assertEquals(2, clientCashService.getCount());
    }

}
