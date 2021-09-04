/*
*  crated date: 9/4/2021
*  author: cgm
*/
package cgm.tdd;

public class Money {

    protected int amount;

    @Override
    public boolean equals(Object obj) {
        Money dollar = (Money) obj;
        return dollar.amount == this.amount;
    }

    
}
