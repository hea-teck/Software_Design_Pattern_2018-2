package hansung.designpatterns.state.gumballstate;

public class OutofState implements State {
    GumballMachine gumballMachine;

    public OutofState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }

    @Override
    public void refill(int gumballs) {
        System.out.println("refill ok");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public String toString() {
        return "out of gumballs";
    }
}
