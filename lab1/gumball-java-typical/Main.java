

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine1 = new GumballMachine(1, 5);
		GumballMachine gumballMachine2 = new GumballMachine(2, 5);
		//GumballMachine gumballMachine3 = new GumballMachine(1, 5);

		System.out.println(gumballMachine1);
		System.out.println("Type: " + gumballMachine1.showType());
                
		gumballMachine1.insertCoin(25);
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine2);
		System.out.println("Type: " + gumballMachine2.showType());
                
		gumballMachine2.insertCoin(25);
		gumballMachine2.insertCoin(25);
		gumballMachine2.turnCrank();
		
		//System.out.println(gumballMachine3);
		//System.out.println("Type: " + gumballMachine3.showType());
		
		//gumballMachine3.insertCoin(25);
		//gumballMachine3.turnCrank();
	}
}
