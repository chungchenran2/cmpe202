

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
        if (gumballMachine.machineType == 1 || gumballMachine.machineType == 2)
        {
            if (coin == 25)
            {
                System.out.println("You inserted a quarter");
                gumballMachine.coinAmount += coin;
                gumballMachine.setState(gumballMachine.getHasQuarterState());
            }
        }
        else if (gumballMachine.machineType == 3)
        {
            if (coin == 25)
            {
                System.out.println("You inserted a quarter");
                gumballMachine.coinAmount += 25;
                gumballMachine.setState(gumballMachine.getHasQuarterState());
            }
            else
            {
                System.out.println("You inserted a non-quarter coin");
                gumballMachine.coinAmount += coin;
                gumballMachine.setState(gumballMachine.getHasAnyCoinState());
            }
        }
    }
 
    public void ejectCoin() {
        System.out.println("You haven't inserted a coin");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no coin");
    }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        if ((gumballMachine.machineType == 1) || (gumballMachine.machineType == 2))
            return "waiting for quarter";
        else
            return "waiting for coin";
    }
}
