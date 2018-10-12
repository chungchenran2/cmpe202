import java.util.ArrayList;
import java.text.DecimalFormat;

public class Composite implements Component
{
    protected ArrayList<Component> itemList = new ArrayList<Component>();
    protected String itemDescription;
    protected Double totalPrice = 0.0;
    
    public Composite(String i)
    {
        itemDescription = i;
    }
    
    public void addToTotalPrice(Double p)
    {
        totalPrice += p;
    }

    public void printItemReceipt()
    {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println(itemDescription);
        for (Component obj : itemList)
            obj.printItemReceipt();
        System.out.println("     Sub. Total:\t"+fmt.format(totalPrice));
    }
    
    public void addChild(Component c)
    {
        itemList.add(c);
    }
    
    public void removeChild(Component c)
    {
        itemList.remove(c);
    }
    
    public Component getChild(int i)
    {
        return itemList.get(i);
    }
}
