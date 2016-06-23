package currency;

/**
 * Created by lucz on 23.06.16.
 */
public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money)o;
        return this.amount==money.amount;
    }

    @Override
    public int hashCode() {
        return amount;
    }

}
