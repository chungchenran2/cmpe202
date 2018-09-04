
public class GumballMachine
{
    public int machine_type;
    private int num_gumballs;
    private boolean has_quarter;
    private boolean has_2nd_quarter;
    private int total_coin_amount;

    public GumballMachine(int type, int size)
    {
        // initialise instance variables
        this.machine_type = type;
        if (this.machine_type > 3)
        {
            System.out.println("Invalid type, setting machine to type 1 as default.");
            this.machine_type = 1;
        }
        this.num_gumballs = size;
        this.has_quarter = false;
        this.has_2nd_quarter = false;
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
            {
                if (!this.has_quarter)
                    this.has_quarter = true;
                else
                    System.out.println("Cannot insert more than 1 quarter.");
            }
            else 
                this.has_quarter = false;
        }
        else if (this.machine_type == 2)
        {
            if (coin == 25)
            {
                if (!this.has_quarter)
                    this.has_quarter = true;
                else if (this.has_quarter && !this.has_2nd_quarter)
                    this.has_2nd_quarter = true;
                else
                    System.out.println("Cannot insert more than 2 quarters.");
            }
            else
            {
                this.has_quarter = false;
                this.has_2nd_quarter = false;
            }
        }
        else if (this.machine_type == 3)
            this.total_coin_amount += coin;
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
            if (this.has_quarter && this.has_2nd_quarter)
            {
                if (this.num_gumballs > 0)
                {
                    this.num_gumballs--;
                    this.has_quarter = false;
                    this.has_2nd_quarter = false;
                    System.out.println("Thanks for your 2 quarters. Gumball Ejected!");
                }
                else
                    System.out.println("No More Gumballs! Sorry, can't return your quarters.");
            }
            else
                System.out.println("Please insert only 2 quarters.");
        }
        else if (this.machine_type == 3)
        {
            if (this.total_coin_amount >= 50)
            {
                if (this.num_gumballs > 0)
                {
                    this.num_gumballs--;
                    this.total_coin_amount -= 50;
                    System.out.println("Thanks for your coins. Gumball Ejected!");
                    System.out.println(this.total_coin_amount + " cents left in machine.");
                }
                else
                    System.out.println("No More Gumballs! Sorry, can't return your coins.");
            }
            else
                System.out.println("Please insert 50 cents.");
        }
    }
}
