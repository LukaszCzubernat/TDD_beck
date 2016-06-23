package currency;

/**
 * Created by lucz on 23.06.16.
 */
public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        Dollar dollar = (Dollar)o;
        return this.amount==dollar.amount;
    }


    @Override
    public int hashCode() {
        return amount;
    }

}
