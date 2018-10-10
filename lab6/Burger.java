
public class Burger extends LeafDecorator
{
    private boolean hasBacon;
    
    public Burger(String d)
    {
        super(d);
        this.hasBacon = false;
    }
    
    public void addBurger(Integer q)
    {
        this.quantity += q;
        if (descript == "HB")
            this.price += (6.39 * q);
        else if (descript == "CB")
            this.price += (7.19 * q);
        else if (descript == "BB")
        {
            this.price += (7.19 * q);
            this.hasBacon = true;
        }
        else if (descript == "BCB")
        {
            this.price += (7.79 * q);
            this.hasBacon = true;
        }
        else if (descript == "LHB")
            this.price += (4.59 * q);
        else if (descript == "LCB")
            this.price += (5.29 * q);
        else if (descript == "LBB")
        {
            this.price += (5.59 * q);
            this.hasBacon = true;
        }
        else if (descript == "LBCB")
        {
            this.price += (6.19 * q);
            this.hasBacon = true;
        }
    }
    
    public String getDescriptionReceipt()
    {
        String receiptDesc = "      ";
        if (this.hasBacon)
            receiptDesc += "{{{{ BACON }}}}";
        return receiptDesc;
    }
}
