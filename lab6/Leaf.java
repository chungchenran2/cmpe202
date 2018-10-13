import java.text.DecimalFormat;

public class Leaf implements Component
{
    protected String descript;
    protected Integer quantity;
    protected Double price;
    
    public Leaf(String d, Integer q, Double p)
    {
        descript = d;
        quantity = q;
        price = p;
    }
    
    public Leaf(String d, Integer q)
    {
        descript = d;
        quantity = q;
        price = 0.0;
    }
    
    public Leaf(String d)
    {
        descript = d;
        quantity = 0;
        price = 0.0;
    }
    
    public Double getPrice()
    {
        return price;
    }
    
    public void printItemReceipt()
    {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println(quantity + "    " + descript + "\t\t" + fmt.format(price));
    }
    
    public void printItemPackaging()
    {
        System.out.println(quantity + "    " + descript);
    }
    
    public void addChild(Component c) {}
    
    public void addChildPackaging(Component c) {}
    
    public void removeChild(Component c) {}
    
    public void removeChildPackaging(Component c) {}
    
    public Component getChild(int i)
    {
        return null;
    }
}
