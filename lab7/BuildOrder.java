  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;

        CustomBurger customBurger1 = new CustomBurger( "Build Your Own Burger" ) ;
        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        // first burger base price for 1/2 lb
        Burger bur1 = new Burger( "Burger Options" ) ;
        String[] buro1 = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        bur1.setOptions( buro1 ) ;
        // second burger base price for 1/3 lb
        Burger bur2 = new Burger( "Burger Options" ) ;
        String[] buro2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        bur2.setOptions( buro2 ) ;
        // first burger 1 cheese free, extra cheese +1.00
        Cheese c1 = new Cheese( "Cheese Options" ) ;
        String[] co1 = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c1.setOptions( co1 ) ;
        c1.wrapDecorator( bur1 ) ;
        // second burger 1 cheese free, extra cheese +1.00
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Smoked Gouda", "Greek Feta" } ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( bur2 ) ;
        // first burger premium cheese +1.50 per selection extra cheese +1.50
        PremiumCheese pc1 = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco1 = { "Danish Blue Cheese" } ;
        pc1.setOptions( pco1 ) ;
        pc1.wrapDecorator( c1 ) ;
        // second burger premium cheese +1.50 per selection extra cheese +1.50
        PremiumCheese pc2 = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco2 = { "Fresh Mozzarella" } ;
        pc2.setOptions( pco2 ) ;
        pc2.wrapDecorator( c2 ) ;
        // first burger 1 sauce free, extra +.50
        Sauce sa1 = new Sauce( "Sauce Options" ) ;
        String[] sao1 = { "Mayonnaise", "Thai Peanut Sauce" } ;
        sa1.setOptions( sao1 ) ;
        sa1.wrapDecorator( pc1 ) ;
        // second burger 1 sauce free, extra +.50
        Sauce sa2 = new Sauce( "Sauce Options" ) ;
        String[] sao2 = { "Habanero Salsa" } ;
        sa2.setOptions( sao2 ) ;
        sa2.wrapDecorator( pc2 ) ;
        // first burger unlimited toppings free
        Toppings t1 = new Toppings( "Toppings Options" ) ;
        String[] to1 = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t1.setOptions( to1 ) ;
        t1.wrapDecorator( sa1 ) ;
        // second burger unlimited toppings free
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts" } ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( sa2 ) ;
        // first burger premium topping +1.00 to 3.00
        PremiumToppings pt1 = new PremiumToppings( "Premium Options" ) ;
        String[] pto1 = { "Marinated Tomatoes" } ;
        pt1.setOptions( pto1 ) ;
        pt1.wrapDecorator( t1 ) ;
        // second burger premium topping +1.00 to 3.00
        PremiumToppings pt2 = new PremiumToppings( "Premium Options" ) ;
        String[] pto2 = { "Sunny Side Up Egg*", "Marinated Tomatoes" } ;
        pt2.setOptions( pto2 ) ;
        pt2.wrapDecorator( t2 ) ;
        // first burger 1 bun free
        Bun bun1 = new Bun( "Bun Options" ) ;
        String[] buno1 = { "Ciabatta (Vegan)" } ;
        bun1.setOptions( buno1 ) ;
        bun1.wrapDecorator( pt1 ) ;
        // second burger 1 bun extra +1.00
        Bun bun2 = new Bun( "Bun Options" ) ;
        String[] buno2 = { "Gluten-Free Bun" } ;
        bun2.setOptions( buno2 ) ;
        bun2.wrapDecorator( pt2 ) ;
        // first burger 1 side +3.00
        Side si1 = new Side( "Side Options" ) ;
        String[] sio1 = { "Shoestring Fries" } ;
        si1.setOptions( sio1 ) ;
        si1.wrapDecorator( bun1 ) ;
        // second burger 1 side +3.00
        Side si2 = new Side( "Side Options" ) ;
        String[] sio2 = { "Shoestring Fries" } ;
        si2.setOptions( sio2 ) ;
        si2.wrapDecorator( bun2 ) ;
        
        // first burger Setup Custom Burger Ingredients
        customBurger1.setDecorator( si1 ) ;
        customBurger1.addChild( bur1 ) ;
        customBurger1.addChild( c1 ) ;
        customBurger1.addChild( pc1 ) ;
        customBurger1.addChild( sa1 ) ;
        customBurger1.addChild( t1 ) ;
        customBurger1.addChild( pt1 ) ;
        customBurger1.addChild( bun1 ) ;
        customBurger1.addChild( si1 ) ;
        
        // second burger Setup Custom Burger Ingredients
        customBurger2.setDecorator( si2 ) ;
        customBurger2.addChild( bur2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( pc2 ) ;
        customBurger2.addChild( sa2 ) ;
        customBurger2.addChild( t2 ) ;
        customBurger2.addChild( pt2 ) ;
        customBurger2.addChild( bun2 ) ;
        customBurger2.addChild( si2 ) ;
        
        // Add First Custom Burger to the Order
        order.addChild( customBurger1 );
        // Add Second Custom Burger to the Order
        order.addChild( customBurger2 );
        return order ;
    }

}
