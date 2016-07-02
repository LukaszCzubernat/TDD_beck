package currency;

/**
 * Created by lucz on 23.06.16.
 */
public abstract class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o){
        Money money = (Money) o;
        return this.amount == money.amount && getClass().equals(money.getClass());
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public abstract Money times(int amount);

    public String currency() {
        return currency;
    }
}
