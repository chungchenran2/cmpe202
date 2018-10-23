
public class CCNAggregateImpl implements CCNAggregate
{
    private String creditCardNumber;

    public CCNAggregateImpl(String ccn)
    {
        creditCardNumber = ccn;
    }

    public CCNIterator createIterator()
    {
        return new CCNIteratorImpl(creditCardNumber);
    }
}
