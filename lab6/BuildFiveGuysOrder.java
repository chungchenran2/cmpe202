
public class BuildFiveGuysOrder
{
    public static Component getSampleOrder()
    {
        Composite order = new Composite("Order");
    	CustomBurger customBurger = new CustomBurger("LBB", 1);
    	customBurger.setBurgerPrice();
    	BottomBunToppings bbt = new BottomBunToppings("bacon");
    	bbt.addTopping("BACON");
    	TopBunToppings tbt1 = new TopBunToppings("lettuce");
    	tbt1.addTopping("LETTUCE");
    	tbt1.wrapDecorator(bbt);
    	TopBunToppings tbt2 = new TopBunToppings("tomato");
    	tbt2.addTopping("TOMATO");
    	tbt2.wrapDecorator(tbt1);
    	MeatToppings mt1 = new MeatToppings("grilled onions");
    	mt1.addTopping("G ONION");
    	mt1.wrapDecorator(tbt2);
    	MeatToppings mt2 = new MeatToppings("jalapeno peppers");
    	mt2.addTopping("JALA Grilled");
    	mt2.wrapDecorator(mt1);
    	
    	customBurger.addChild(bbt);
    	customBurger.addChild(tbt1);
    	customBurger.addChild(tbt2);
    	customBurger.addChild(mt1);
    	customBurger.addChild(mt2);
    	
    	order.addChild(customBurger);
    	order.addChild(new Leaf("LTL CAJ", 1, 2.79));
    	
    	return order;
    }
}
