package currency;

/**
 * Created by lucz on 23.06.16.
 */
public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount*multiplier);
    }

    @Override
    public boolean equals(Object o){
        Money money = (Money) o;
        return this.amount == money.amount;
    }
}
