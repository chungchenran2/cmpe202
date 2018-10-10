public class FiveGuysReceipt {
    public static void main(String[] args) {
    	Composite order = new Composite("Order");
    	CustomBurger customBurger = new CustomBurger("LBB", 1);
    	Burger b = new Burger("LBB");
    	b.addBurger(1);
    	customBurger.setDecorator(b);
    	//customBurger.addChild(b);
    	order.addChild(customBurger);
    	order.addChild(new Leaf("LTL CAJ", 1, 2.79));
    	order.printItemReceipt();
    }
}