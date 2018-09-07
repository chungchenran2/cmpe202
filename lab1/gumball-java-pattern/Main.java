

public class Main {
    
    public static void main(String[] args) {
        GumballMachine gumballMachine1 = new GumballMachine(5, 1);
        GumballMachine gumballMachine2 = new GumballMachine(5, 2);

        System.out.println(gumballMachine1);

        gumballMachine1.insertQuarter();
        gumballMachine1.turnCrank();

        System.out.println(gumballMachine1);
        System.out.println(gumballMachine2);

        gumballMachine2.insertQuarter();
        gumballMachine2.turnCrank();
        gumballMachine2.insertQuarter();
        gumballMachine2.turnCrank();
        
        System.out.println(gumballMachine2);
    }
}
