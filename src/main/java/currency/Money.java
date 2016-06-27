package currency;

/**
 * Created by lucz on 23.06.16.
 */
public class Money {
    protected int amount;

    @Override
    public boolean equals(Object o){
        Money money = (Money) o;
        return this.amount == money.amount && getClass().equals(money.getClass());
    }
}
