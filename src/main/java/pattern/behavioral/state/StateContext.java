package pattern.behavioral.state;

/*
Состояние(State)

Позволяет объектам менять поведение в зависимости от своего
состояния. Извне создаётся впечатление, что изменился класс
объекта.
*/
public class StateContext {

    private State state = new SolidState();

    public void freeze() {
        System.out.println("Freezing " + state.getName() + " substance...");
        state.freeze(this);
    }

    public void heat() {
        System.out.println("Heating " + state.getName() + " substance...");
        state.heat(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        System.out.println("Changing state to " + state.getName() + "...");
        this.state = state;
    }

}
