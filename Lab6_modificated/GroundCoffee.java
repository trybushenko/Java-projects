package Lab6_modificated;

public class GroundCoffee extends Coffee{
    protected enum KILOGRAMS {FIFTY, HUNDRED}
    protected final KILOGRAMS kilograms;
    public GroundCoffee(QUALITY quality, TYPE type, KILOGRAMS kilograms) {
        super(quality, type);
        this.kilograms = kilograms;
    }

    @Override
    public TYPE getType() {
        return super.getType();
    }

    @Override
    public QUALITY getQuality() {
        return super.getQuality();
    }


    @Override
    public String toString() {
        return "GroundCoffee{" +
                ", quality=" + quality +
                ", type=" + type +
                '}';
    }

    public KILOGRAMS getKilograms() {
        return kilograms;
    }
}
