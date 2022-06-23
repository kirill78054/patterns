package pattern.behavioral.chain_of_responsibility;

public class Dollar50Dispenser extends DispenserMain {

    public Dollar50Dispenser(DispenseChain chain) {
        super.chain = chain;
    }

    @Override
    public int getNote() {
        return 50;
    }

}
