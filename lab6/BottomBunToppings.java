
public class BottomBunToppings extends LeafDecorator
{
    private String topping;
    
    public BottomBunToppings(String d)
    {
        super(d);
    }
    
    public void addTopping(String t)
    {
        this.topping = t;
    }

    public String getDescriptionReceipt()
    {
        String receiptDesc = "      {{{{ " + this.topping + " }}}}";
        return receiptDesc;
    }
}
