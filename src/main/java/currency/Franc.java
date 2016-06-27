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

}
