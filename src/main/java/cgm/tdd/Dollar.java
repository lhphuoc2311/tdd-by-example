/*
*  crated date: 9/4/2021
*  author: cgm
*/
package cgm.tdd;

public class Dollar {

    int amount;

    public Dollar(int amount){
        this.amount = amount;

    }

    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }


    
}
