
public class HasTwoQuartersState implements State {
    GumballMachine gumballMachine;
    
    public HasTwoQuartersState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    public void insertCoin(int coin) {
        System.out.println("You can't insert another quarter");
    }
 
    public void ejectCoin() {
        System.out.println("Quarter returned");
        gumballMachine.coinAmount -= 25;
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
