package Lab6_modificated;

import java.util.Arrays;

public class BagOfCoffee extends GroundCoffee{
    private GroundCoffee[] groundCoffees;
    private double priceForBag;
    public BagOfCoffee(QUALITY quality, TYPE type, KILOGRAMS kilograms) {
        super(quality, type, kilograms);
        setPriceForBag();
        setSize();
        fulfill();
    }
    private void setPriceForBag() {
        if (kilograms == GroundCoffee.KILOGRAMS.FIFTY && quality == Coffee.QUALITY.BAD) priceForBag = 50 * 10 * 0.75;
        else if (kilograms == GroundCoffee.KILOGRAMS.FIFTY && (quality == Coffee.QUALITY.GOOD || quality == Coffee.QUALITY.EXCELLENT))
            priceForBag = 50 * 10;
        else if (kilograms == GroundCoffee.KILOGRAMS.HUNDRED && quality == Coffee.QUALITY.BAD) priceForBag = 100 * 10 * 0.75;
        else priceForBag = 100 * 10;
    }
    private void setSize() {
        groundCoffees = (kilograms == GroundCoffee.KILOGRAMS.FIFTY) ? new GroundCoffee[50] : new GroundCoffee[100];
    }
    private void fulfill() {
        for (int i = 0; i < groundCoffees.length; i++) {
            groundCoffees[i] = new GroundCoffee(quality, type, kilograms);
        }
    }
    public double getPriceForBag() {
        return priceForBag;
    }

    public Coffee.QUALITY getQuality() {
        return quality;
    }

    public GroundCoffee[] getGroundCoffees() {
        return groundCoffees;
    }

    @Override
    public String toString() {
        return "BagOfCoffee{" +
                "groundCoffees=" + Arrays.toString(groundCoffees) +
                ", quality=" + quality +
                ", priceForBag=" + priceForBag +
                ", kilograms=" + kilograms +
                '}';
    }
}
