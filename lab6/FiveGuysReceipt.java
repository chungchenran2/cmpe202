public class FiveGuysReceipt {
    public static void main(String[] args) {
    	Composite order = new Composite("Order");
    	order.addChild(new Leaf("LTL CAJ", 2.79));
    	order.printItem();
    }
}