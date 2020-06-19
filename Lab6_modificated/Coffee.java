package Lab6_modificated;

public class Coffee {
    protected enum QUALITY {BAD, GOOD, EXCELLENT};
    protected enum TYPE {ARABICA, ROBUSTA};
    protected QUALITY quality;
    protected TYPE type;
    public Coffee(QUALITY quality, TYPE type) {
        this.quality = quality;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "quality=" + quality +
                ", type=" + type +
                '}';
    }

    public QUALITY getQuality() {
        return quality;
    }

    public TYPE getType() {
        return type;
    }

}
