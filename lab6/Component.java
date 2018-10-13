
public interface Component
{
    void printItemReceipt();
    void printItemPackaging();
    void addChild(Component c);
    void addChildPackaging(Component c);
    void removeChild(Component c);
    void removeChildPackaging(Component c);
    Component getChild(int i);
}
