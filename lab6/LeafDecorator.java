import java.text.DecimalFormat;

public abstract class LeafDecorator extends Leaf implements PriceDecorator
{
    PriceDecorator wrapped;
    
    public LeafDecorator(String d)
    {
        super(d);
    }
    
    public LeafDecorator(String d, Integer q)
    {
        super(d, q);
    }
    
    public void wrapDecorator(PriceDecorator w)
    {
        this.wrapped = w;
    }
    
    public Double getPrice()
    {
        if (wrapped == null)
            return price;
        else
            return price + wrapped.getPrice();
    }
    
    abstract public void addTopping(String t);
    abstract public String getDescriptionReceipt();
    
    @Override
    public void printItemReceipt()
    {
        System.out.println(getDescriptionReceipt());
    }
}
