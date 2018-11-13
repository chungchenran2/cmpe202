package composite;

public class BuildOrder {

	interface itemGenerator
	{
		Leaf createItem(String description, double price);
	}

	public static Composite buildBurger(String[] options, double[] prices, itemGenerator ig)
	{
		Composite customBurger = new Composite("Build Your Own Burger");
		for (int i = 0; i < options.length; i++)
			customBurger.addChild(ig.createItem(options[i], prices[i]));
		return customBurger
	}

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));

        String[] cbdescript = {"Beef, 1/3 lb on a Bun","Danish Blue Cheese","Horseradish Cheddar","Bermuda Red Onion",
                "Black Olives","Carrot Strings","Coleslaw","Applewood Smoked Bacon","Appricot Sauce"};
        double[] cbprices = {9.50, 0.00, 1.00, 0.00, 0.00, 0.00, 0.00, 1.50, 0.00};

        itemGenerator ig=(d, p) -> { return new Leaf(d,p); };
        Composite customBurger = buildBurger(cbdescript, cbprices, ig);
        
        order.addChild( customBurger );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/