import java.text.DecimalFormat;

public abstract class LeafDecorator extends Leaf
{
    public LeafDecorator(String d)
    {
        super(d);
    }
    
    public LeafDecorator(String d, Integer q)
    {
        super(d, q);
    }
    
    public Double getPrice()
    {
        return price;
    }
    
    abstract public void addTopping(String t);
    abstract public String getDescriptionReceipt();
    
    @Override
    public void printItemReceipt()
    {
        System.out.println(getDescriptionReceipt());
    }
}
