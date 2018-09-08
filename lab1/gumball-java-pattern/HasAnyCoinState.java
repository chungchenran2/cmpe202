
public class HasAnyCoinState implements State {
    GumballMachine gumballMachine;
    
    public HasAnyCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int coin) {
        System.out.println("You inserted a coin");
        gumballMachine.coinAmount += coin;
    }
 
    public void ejectCoin() {
        System.out.println("All coins returned");
        gumballMachine.coinAmount = 0;
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        if (gumballMachine.coinAmount == 50)
            gumballMachine.setState(gumballMachine.getSoldState());
    }
 
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "sold out";
    }
}
