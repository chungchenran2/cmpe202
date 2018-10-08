import java.text.DecimalFormat;

public class Leaf implements Component
{
    private String descript;
    private Double price;
    
    public Leaf(String d, Double p)
    {
        descript = d;
        price = p;
    }
    
    public void printItem()
    {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println(descript + "\t" + fmt.format(price));
    }
    
    public void addChild(Component c) {}
    
    public void removeChild(Component c) {}
    
    public Component getChild(int i)
    {
        return null;
    }
}
