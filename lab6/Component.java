
public interface Component
{
    void printItem();
    void addChild(Component c);
    void removeChild(Component c);
    Component getChild(int i);
}
