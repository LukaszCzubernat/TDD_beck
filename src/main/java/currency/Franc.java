package currency;

/**
 * Created by lucz on 23.06.16.
 */
public class Franc extends Money{

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return Money.franc(amount*multiplier);
    }

}
