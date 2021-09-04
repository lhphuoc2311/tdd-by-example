/*
*  crated date: 9/4/2021
*  author: cgm
*/
package cgm.tdd;

public class Franc {

    private int amount;

    public Franc(int amount){
        this.amount = amount;

    }

    Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Franc dollar = (Franc) obj;
        return dollar.amount == this.amount;
    }

    
}
