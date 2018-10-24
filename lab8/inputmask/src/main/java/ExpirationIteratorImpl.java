
public class ExpirationIteratorImpl implements ExpirationIterator
{
    private String expirationDate;
    private int ptr;
    private int maxLength;

    public ExpirationIteratorImpl(String exp)
    {
        expirationDate = exp;
        ptr = 0;
        maxLength = exp.length();
    }

    public String getNextDigit()
    {
        String digitPrintout = "";
        if (!iteratorFinished())
        {
            digitPrintout += expirationDate.charAt(ptr);
            if (ptr == 1)
                digitPrintout += "/";
            ptr += 1;
        }
        return digitPrintout;
    }
    
    public boolean iteratorFinished()
    {
        return ptr == maxLength;
    }
}
