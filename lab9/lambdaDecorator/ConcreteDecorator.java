
public class ConcreteDecorator extends Decorator {
    
    private String addedState;
    private behaviorGenerator bg1, bg2;
    
    interface behaviorGenerator
    {
        String addedBehavior(String in);
    }
    
    public ConcreteDecorator( Component c )
    {
        super( c ) ;
        bg1 = (in) -> { return "<em>" + in + "</em>"; };
        bg2 = (in) -> { return "<h1>" + in + "</h1>"; };
    }
    
    public String operation()
    {
        addedState = super.operation();
        return bg2.addedBehavior(bg1.addedBehavior(addedState));
    }
}
