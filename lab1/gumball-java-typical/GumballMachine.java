
public class GumballMachine
{
    public int machine_type;
    private int num_gumballs;
    private boolean has_quarter;
    private boolean has_2_quarters;
    private int gumball_cost;
    private int total_coin_amount;

    public GumballMachine(int type, int size)
    {
        // initialise instance variables
        this.machine_type = type;
        this.num_gumballs = size;
        this.has_quarter = false;
        this.has_2_quarters = false;
        
        if (this.machine_type == 1)
            this.gumball_cost = 25;
        else if ((this.machine_type == 2) || (this.machine_type == 3))
            this.gumball_cost = 50;
        else
        {
            System.out.println("Invalid type, setting to type 1 as default.");
            this.gumball_cost = 25;
        }
        
        this.total_coin_amount = 0;
    }
    
    public int showType()
    {
        return this.machine_type;
    }

    public void insertCoin(int coin)
    {
        if (this.machine_type == 1)
        {
            if (coin == 25)
                this.has_quarter = true;
            else 
                this.has_quarter = false;
        }
        else if (this.machine_type == 2)
        {
            if (coin == 25)
                this.total_coin_amount += 25;
            
            if (this.total_coin_amount == 50)
                this.has_2_quarters = true;
        }
    }
    
    public void turnCrank()
    {
        if (this.machine_type == 1)
        {
            if (this.has_quarter)
            {
                if (this.num_gumballs > 0)
                {
                    this.num_gumballs--;
                    this.has_quarter = false;
                    System.out.println("Thanks for your quarter. Gumball Ejected!");
                }
                else
                    System.out.println("No More Gumballs! Sorry, can't return your quarter.");
            }
            else 
                System.out.println("Please insert a quarter.");
        }
        else if (this.machine_type == 2)
        {
            if (this.has_2_quarters)
            {
                if (this.num_gumballs > 0)
                {
                    this.num_gumballs--;
                    this.has_2_quarters = false;
                    this.total_coin_amount = 0;
                    System.out.println("Thanks for your 2 quarters. Gumball Ejected!");
                }
                else
                    System.out.println("No More Gumballs! Sorry, can't return your quarters.");
            }
            else
                System.out.println("Please insert only 2 quarters.");
        }
    }
}
