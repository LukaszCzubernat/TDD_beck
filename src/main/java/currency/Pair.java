package currency;

/**
 * Created by Hawk on 2016-07-02.
 */
public class Pair {
    String from;
    String to;

    public Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null) return false;
        if(getClass() != object.getClass()) return false;
        Pair other = (Pair) object;
        return from.equals(other.from) && to.equals(other.to);
    }

    @Override
    public int hashCode(){
        return 0;
    }
}
