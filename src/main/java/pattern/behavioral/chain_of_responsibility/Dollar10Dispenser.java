package pattern.behavioral.chain_of_responsibility;

public class Dollar10Dispenser extends DispenserMain {

    public Dollar10Dispenser(DispenseChain chain) {
        super.chain = chain;
    }

    @Override
    public int getNote() {
        return 10;
    }

}
