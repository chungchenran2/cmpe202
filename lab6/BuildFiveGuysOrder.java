
public class BuildFiveGuysOrder
{
    public static Component getSampleOrder()
    {
        Composite order = new Composite("Order");
    	CustomBurger customBurger = new CustomBurger("LBB", 1, 5.59);
    	BottomBunToppings bbt = new BottomBunToppings("BottomBun");
    	String [] bbo = {"BACON"};
    	bbt.addToppings(bbo);
    	TopBunToppings tbt = new TopBunToppings("TopBun");
    	String [] tbo = {"LETTUCE", "TOMATO"};
    	tbt.addToppings(tbo);
    	MeatToppings mt = new MeatToppings("Meat");
    	String [] mo = {"G ONION", "JALA Grilled"};
    	mt.addToppings(mo);
    	
    	customBurger.addChild(bbt);
    	customBurger.addChild(tbt);
    	customBurger.addChild(mt);
    	
    	customBurger.addChildPackaging(tbt);
    	customBurger.addChildPackaging(mt);
    	customBurger.addChildPackaging(bbt);
    	
    	order.addChild(customBurger);
    	order.addChildPackaging(customBurger);
    	order.addToTotalPrice(customBurger.getPrice());
    	
    	Leaf littleCajunFries = new Leaf("LTL CAJ", 1, 2.79);
    	order.addChild(littleCajunFries);
    	order.addChildPackaging(littleCajunFries);
    	order.addToTotalPrice(littleCajunFries.getPrice());
    	
    	return order;
    }
}
