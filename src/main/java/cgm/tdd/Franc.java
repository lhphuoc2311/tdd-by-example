/*
*  crated date: 9/4/2021
*  author: cgm
*/
package cgm.tdd;

public class Franc extends Money {


    public Franc(int amount){
        this.amount = amount;

    }

    Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }

  

    
}
