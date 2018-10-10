
public interface Component
{
    void printItemReceipt();
    void addChild(Component c);
    void removeChild(Component c);
    Component getChild(int i);
}
