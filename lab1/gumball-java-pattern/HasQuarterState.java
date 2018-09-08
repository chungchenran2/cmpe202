

import java.util.Random;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;
 
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertCoin(int coin) {
        if (gumballMachine.machineType == 1)
            System.out.println("You can't insert another quarter");
        else if ((gumballMachine.machineType == 2) && (coin == 25))
        {
            System.out.println("You inserted a second quarter");
            gumballMachine.coinAmount += coin;
            gumballMachine.setState(gumballMachine.getHasTwoQuartersState());
        }
        else if (gumballMachine.machineType == 3)
        {
            System.out.println("You inserted a non-quarter");
            gumballMachine.coinAmount += coin;
            gumballMachine.setState(gumballMachine.getHasAnyCoinState());
        }
    }
 
    public void ejectCoin() {
        System.out.println("Quarter returned");
        gumballMachine.coinAmount = 0;
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        if (gumballMachine.machineType == 1)
            gumballMachine.setState(gumballMachine.getSoldState());
        else if (gumballMachine.machineType == 2)
            System.out.println("Still needs another quarter");
        else if (gumballMachine.machineType == 3)
            System.out.println("Still needs 25 more cents");
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
