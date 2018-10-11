import java.util.ArrayList;

public class Composite implements Component
{
    protected ArrayList<Component> itemList = new ArrayList<Component>();
    protected String itemDescription;
    
    public Composite(String i)
    {
        itemDescription = i;
    }

    public void printItemReceipt()
    {
        System.out.println(itemDescription);
        for (Component obj : itemList)
            obj.printItemReceipt();
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
