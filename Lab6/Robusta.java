package Lab6;

public class Robusta extends Coffee {
    private final int freshness;

    public Robusta(int freshness) {
        this.freshness = freshness;
    }

    public int getFreshness() {
        return freshness;
    }


    @Override
    public String toString() {
        return "Robusta{" +
                "freshness=" + freshness +
                "}";
    }
}
