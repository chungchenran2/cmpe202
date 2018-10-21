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
        else
            return "[" + date + "]" + "  " ;
    }   

    public void key(String ch, int cnt) {
        if ( cnt >= 17 && cnt <= 20  ){
            date += ch ;
            if (cnt == 18)
                date += "/";
        }
        else if ( nextHandler != null )
            nextHandler.key(ch, cnt) ;
    }   

    public void addSubComponent( IDisplayComponent c ) {
        return ; // do nothing
    }

}