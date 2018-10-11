
public class MeatToppings extends LeafDecorator
{
    private String topping;
    
    public MeatToppings(String d)
    {
        super(d);
    }
    
    public void addTopping(String t)
    {
        this.topping = t;
    }

    public String getDescriptionReceipt()
    {
        String receiptDesc = "      ->|" + this.topping;
        return receiptDesc;
    }
}
