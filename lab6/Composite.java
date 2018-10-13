import java.util.ArrayList;
import java.text.DecimalFormat;

public class Composite implements Component
{
    protected ArrayList<Component> itemList = new ArrayList<Component>();
    protected ArrayList<Component> packagingList = new ArrayList<Component>();
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
        System.out.println(itemDescription + " Receipt");
        for (Component obj : itemList)
            obj.printItemReceipt();
        System.out.println("     Sub. Total:\t"+fmt.format(totalPrice)+"\n");
    }
    
    public void printItemPackaging()
    {
        System.out.println(itemDescription + " Packaging Slip");
        for (Component obj : packagingList)
            obj.printItemPackaging();
    }
    
    public void addChild(Component c)
    {
        itemList.add(c);
    }
    
    public void addChildPackaging(Component c)
    {
        packagingList.add(c);
    }
    
    public void removeChild(Component c)
    {
        itemList.remove(c);
    }
    
    public void removeChildPackaging(Component c)
    {
        packagingList.remove(c);
    }
    
    public Component getChild(int i)
    {
        return itemList.get(i);
    }
}
