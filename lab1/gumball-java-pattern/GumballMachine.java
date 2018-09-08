

public class GumballMachine {
    
    int machineType;
    State soldOutState;
    State noCoinState;
    State hasQuarterState;
    State soldState;
    State hasTwoQuartersState;
    State hasAnyCoinState;
    
    State state = soldOutState;
    int count = 0;
    int coinAmount = 0;
    
    public GumballMachine(int numberGumballs, int type) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        hasTwoQuartersState = new HasTwoQuartersState(this);
        hasAnyCoinState = new HasAnyCoinState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noCoinState;
        }
        
        this.machineType = type;
    }
 
    public void insertCoin(int coin) {
        state.insertCoin(coin);
    }
 
    public void ejectCoin() {
        state.ejectCoin();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }
    
    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public State getHasTwoQuartersState() {
        return hasTwoQuartersState;
    }
    
    public State getHasAnyCoinState() {
        return hasAnyCoinState;
    }
    
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        if (this.machineType == 1)
            result.append("\nJava-enabled Standing Gumball Model #2004");
        else if (this.machineType == 2)
            result.append("\nJava-enabled Standing Gumball Model #2005");
        else if (this.machineType == 3)
            result.append("\nJava-enabled Standing Gumball Model #2006");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
