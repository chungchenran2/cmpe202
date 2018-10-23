
public class CCNIteratorImpl implements CCNIterator
{
    private String creditCardNumber;
    private int ptr;
    private int maxLength;

    public CCNIteratorImpl(String ccn)
    {
        creditCardNumber = ccn;
        ptr = 0;
        maxLength = ccn.length();
    }

    public String getNextDigit()
    {
        String digitPrintout = "";
        if (!iteratorFinished())
        {
            digitPrintout += creditCardNumber.charAt(ptr);
            if ((ptr == 3) || (ptr == 7) || (ptr == 11))
                digitPrintout += " ";
            ptr += 1;
        }
        return digitPrintout;
    }
    
    public boolean iteratorFinished()
    {
        return ptr == maxLength;
    }
}
