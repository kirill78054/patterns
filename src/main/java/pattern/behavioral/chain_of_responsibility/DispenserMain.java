package pattern.behavioral.chain_of_responsibility;

/*
Цепочка обязанностей(Chain of Responsibility)

Позволяет передавать запросы последовательно по цепочке
обработчиков. Каждый последующий обработчик решает,
может ли он обработать запрос сам и стоит ли передавать
запрос дальше по цепи.
*/
public class DispenserMain implements DispenseChain {

    protected DispenseChain chain;

    protected int getNote(){
        return 1;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= getNote()) {
            int num = cur.getAmount() / getNote();
            int remainder = cur.getAmount() % getNote();
            System.out.println("Dispensing " + num + " " + getNote() + "$ note");
            if (remainder != 0) chain.dispense(new Currency(remainder));
        } else {
            chain.dispense(cur);
        }
    }

}
