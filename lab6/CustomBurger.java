import java.text.DecimalFormat;

public class CustomBurger extends Composite
{
    Integer quantity;
    Double price = 0.0;
    
    public CustomBurger(String i, Integer q)
    {
        super(i);
        quantity = q;
    }
    
    public void setBurgerPrice()
    {
        if (itemDescription == "HB")
            this.price += (6.39 * this.quantity);
        else if (itemDescription == "CB" || itemDescription == "BB")
            this.price += (7.19 * this.quantity);
        else if (itemDescription == "BCB")
            this.price += (7.79 * this.quantity);
        else if (itemDescription == "LHB")
            this.price += (4.59 * this.quantity);
        else if (itemDescription == "LCB")
            this.price += (5.29 * this.quantity);
        else if (itemDescription == "LBB")
            this.price += (5.59 * this.quantity);
        else if (itemDescription == "LBCB")
            this.price += (6.19 * this.quantity);
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
