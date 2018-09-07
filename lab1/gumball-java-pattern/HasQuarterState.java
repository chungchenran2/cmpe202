

import java.util.Random;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;
 
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertQuarter() {
        if (gumballMachine.getMachineType() == 1)
            System.out.println("You can't insert another quarter");
        else if (gumballMachine.getMachineType() == 2)
        {
            System.out.println("You inserted a second quarter");
            gumballMachine.setState(gumballMachine.getHasTwoQuartersState());
        }
    }
 
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        if (gumballMachine.getMachineType() == 1)
            gumballMachine.setState(gumballMachine.getSoldState());
        else if (gumballMachine.getMachineType() == 2)
            System.out.println("Still needs another quarter");
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
