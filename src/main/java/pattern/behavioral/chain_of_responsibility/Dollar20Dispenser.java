package pattern.behavioral.chain_of_responsibility;

public class Dollar20Dispenser extends DispenserMain {

    public Dollar20Dispenser(DispenseChain chain) {
        super.chain = chain;
    }

    @Override
    public int getNote() {
        return 20;
    }

}
