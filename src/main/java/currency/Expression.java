package currency;

/**
 * Created by Hawk on 2016-07-02.
 */
public interface Expression {

    Money reduce(String to);
}