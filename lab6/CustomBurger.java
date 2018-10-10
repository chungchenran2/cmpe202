import java.text.DecimalFormat;

public class CustomBurger extends Composite
{
    PriceDecorator decorator = null;
    Integer quantity;
    
    public CustomBurger(String i, Integer q)
    {
        super(i);
        quantity = q;
    }
    
    public void setDecorator(PriceDecorator p)
    {
        this.decorator = p;
    }

    public void printItemReceipt()
    {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println(quantity + "    " + itemDescription + "\t" + fmt.format(decorator.getPrice()));
        for (Component obj : itemList)
        {
            obj.printItemReceipt();
        }
    }
}
