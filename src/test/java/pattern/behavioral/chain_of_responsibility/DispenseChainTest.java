package pattern.behavioral.chain_of_responsibility;

import org.junit.Test;

public class DispenseChainTest {

    @Test
    public void dispenseTest() {
        DispenseChain c1 = new Dollar50Dispenser(
                new Dollar20Dispenser(
                        new Dollar10Dispenser(
                                new Dollar5Dispenser(new DispenserMain())
                        )
                )
        );

        System.out.println("Enter amount to dispense 530");
        c1.dispense(new Currency(530));
        System.out.println("Enter amount to dispense 100");
        c1.dispense(new Currency(100));
        System.out.println("Enter amount to dispense 120");
        c1.dispense(new Currency(120));
        System.out.println("Enter amount to dispense 7");
        c1.dispense(new Currency(7));
    }

}
