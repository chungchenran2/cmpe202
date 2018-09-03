
public class GumballMachine
{
    public int machine_type;
    private int num_gumballs;
    private boolean has_quarter;
    private int gumball_cost;

    public GumballMachine( int type, int size )
    {
        // initialise instance variables
        this.machine_type = type;
        this.num_gumballs = size;
        this.has_quarter = false;
        if ((this.machine_type==1) || (this.machine_type>3))
        {
            this.gumball_cost = 25;
        }
        else if ((this.machine_type==2) || (this.machine_type==3))
        {
            this.gumball_cost = 50;
        }
    }
    
    public int showType()
    {
        return this.machine_type;
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank()
    {
    	if ( this.has_quarter )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}        
    }
}
