package pattern.behavioral.chain_of_responsibility;

public class Dollar5Dispenser extends DispenserMain {

    public Dollar5Dispenser(DispenseChain chain) {
        super.chain = chain;
    }

    @Override
    public int getNote() {
        return 5;
    }

}
