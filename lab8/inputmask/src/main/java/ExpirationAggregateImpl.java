
public class ExpirationAggregateImpl implements ExpirationAggregate
{
    private String expirationDate;

    public ExpirationAggregateImpl(String exp)
    {
        expirationDate = exp;
    }

    public ExpirationIterator createIterator()
    {
        return new ExpirationIteratorImpl(expirationDate);
    }
}
