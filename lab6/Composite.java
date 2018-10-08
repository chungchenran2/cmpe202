import java.util.ArrayList;

public class Composite implements Component
{
    private ArrayList<Component> itemList = new ArrayList<Component>();
    private String itemDescription;
    
    public Composite(String n)
    {
        itemDescription = n;
    }

    public void printItem()
    {
        System.out.println(itemDescription);
        for (Component obj : itemList) {
            obj.printItem();
        }
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
