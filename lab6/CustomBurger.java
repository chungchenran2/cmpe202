import java.text.DecimalFormat;

public class CustomBurger extends Composite
{
    Integer quantity;
    Double price;
    
    public CustomBurger(String i, Integer q, Double p)
    {
        super(i);
        quantity = q;
        price = p;
    }
    
    public Double getPrice()
    {
        return this.price;
    }

    public void printItemReceipt()
    {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println(quantity + "    " + itemDescription + "\t\t" + fmt.format(this.price));
        for (Component obj : itemList)
            obj.printItemReceipt();
    }
    
    public void printItemPackaging()
    {
        System.out.println(quantity + "    " + itemDescription);
        for (Component obj : packagingList)
            obj.printItemPackaging();
    }
}
