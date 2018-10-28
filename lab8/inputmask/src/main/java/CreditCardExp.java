/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

    private IKeyEventHandler nextHandler ;
    private String date = "" ;

    public void setNext( IKeyEventHandler next) {
        this.nextHandler = next ;
    }   

    public String display() {
        if ( date.equals("") )
            return "[MM/YY]" + "  " ;
        else {
            String res = "";
            res += "[";
            ExpirationAggregate expList = new ExpirationAggregateImpl(date);
            ExpirationIterator expIter = expList.createIterator();
            while (!expIter.iteratorFinished())
                res += expIter.getNextDigit();
            res += "]  ";
            return res;
        }
    }   

    public void key(String ch, int cnt) {
        if ( cnt >= 17 && cnt <= 20  ) {
            if (ch.equals("X") || ch.equals("Delete")) {
                StringBuilder sb = new StringBuilder(date);
                sb.deleteCharAt(sb.length() - 1);
                date = sb.toString();
            }
            else
                date += ch ;
        }
        else if ( nextHandler != null )
            nextHandler.key(ch, cnt) ;
    }   

    public void addSubComponent( IDisplayComponent c ) {
        return ; // do nothing
    }

}