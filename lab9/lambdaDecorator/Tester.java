
public class Tester {
    
    public static void runTest()
    {
        Component obj = new ConcreteDecorator(new ConcreteComponent());
        String result = obj.operation() ;
        System.out.println( result );
    }

    public static void main( String [] args )
    {
        Tester t = new Tester() ;
        t.runTest() ;
    }    
    
}
