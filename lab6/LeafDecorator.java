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
    
    abstract public void addToppings(String [] t);
    abstract public String getDescriptionReceipt();
    
    @Override
    public void printItemReceipt()
    {
        System.out.println(getDescriptionReceipt());
    }
    
    @Override
    public void printItemPackaging()
    {
        System.out.println(getDescriptionReceipt());
    }
}
