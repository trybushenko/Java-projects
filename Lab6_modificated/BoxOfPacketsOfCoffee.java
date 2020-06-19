package Lab6_modificated;

import java.util.Arrays;

public class BoxOfPacketsOfCoffee extends CoffeeInPackets{
    private CoffeeInPackets[] coffeeInPackets;

    protected enum SIZE {SMALL, BIG}

    private final SIZE size;
    private int priceOfBox;
    private int massOfBox = 0;

    public BoxOfPacketsOfCoffee(QUALITY quality, TYPE type, SIZE size) {
        super(quality, type);
        this.size = size;
        setPriceOfBox();
        setCoffeeInPackets();
        fulfill();
        setMassOfBox();
    }

    private void setPriceOfBox() {
        priceOfBox = (this.size == SIZE.SMALL) ? 50 : 100;
    }

    public int getPriceOfBox() {
        return priceOfBox;
    }

    public SIZE getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "BoxOfPacketsOfCoffee{" +
                "coffeeInPackets=" + Arrays.toString(coffeeInPackets) +
                ", size=" + size +
                ", priceOfBox=" + priceOfBox +
                '}';
    }

    private void setCoffeeInPackets() {
        coffeeInPackets = (size == SIZE.SMALL) ? new CoffeeInPackets[20] : new CoffeeInPackets[30];
    }

    public CoffeeInPackets[] getCoffeeInPackets() {
        return coffeeInPackets;
    }

    private void fulfill() {
        for (int i = 0; i < coffeeInPackets.length; i++) {
            coffeeInPackets[i] = new CoffeeInPackets(quality, type);
        }
    }
    private void setMassOfBox() {
        massOfBox = 15 * coffeeInPackets.length + 10;
    }

    public int getMassOfBox() {
        return massOfBox;
    }

}
