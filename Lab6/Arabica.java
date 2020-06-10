package Lab6;

public class Arabica extends Coffee {
    private final int freshness;
    public Arabica(int freshness) {
        this.freshness = freshness;
    }

    public int getFreshness() {
        return freshness;
    }



    @Override
    public String toString() {
        return "Arabica{" +
                "freshness=" + freshness +
                "}";
    }
}
