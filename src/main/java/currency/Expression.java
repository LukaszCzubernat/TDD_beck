package currency;

/**
 * Created by Hawk on 2016-07-02.
 */
public interface Expression {

    Money reduce(Bank bank, String to);

    Expression plus(Expression tenFrancs);
}
