
public class BottomBunToppings extends LeafDecorator
{
    private String [] toppings;
    
    public BottomBunToppings(String d)
    {
        super(d);
    }
    
    public void addToppings(String [] t)
    {
        this.toppings = t;
    }

    public String getDescriptionReceipt()
    {
        String receiptDesc = "";
        for (int i = 0; i < toppings.length; i++)
        {
            if (i == toppings.length-1)
                receiptDesc += "      {{{{ " + toppings[i] + " }}}}";
            else
                receiptDesc += "      {{{{ " + toppings[i] + " }}}}\n";
        }
        return receiptDesc;
    }
}
