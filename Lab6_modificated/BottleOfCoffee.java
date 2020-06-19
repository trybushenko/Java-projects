package Lab6_modificated;


public class BottleOfCoffee extends Coffee {
    protected enum SIZE {SMALL, MEDIUM, BIG}


    private SIZE size;
    private double priceForBottle;
    private int quantity;

    public BottleOfCoffee(QUALITY quality, TYPE type, SIZE size) {
        super(quality, type);
        this.size = size;
    }
    public void setSize(BottleOfCoffee.SIZE size) {
        this.size = size;
        if (size == BottleOfCoffee.SIZE.SMALL) {
            this.quantity = 60;
        } else if (size == BottleOfCoffee.SIZE.MEDIUM) {
            this.quantity = 100;
        } else {
            this.quantity = 160;
        }
        setPriceForBottle();
    }
    private void setPriceForBottle() {
        if (quality.equals(Coffee.QUALITY.BAD)) {
            priceForBottle = (type.equals(Coffee.TYPE.ARABICA)) ? 0.25 * this.quantity : 0.1 * this.quantity;
        } else if (quality.equals(Coffee.QUALITY.GOOD)) {
            priceForBottle = (type.equals(Coffee.TYPE.ARABICA)) ? 0.5 * this.quantity : 0.35 * this.quantity;
        } else {
            priceForBottle = (type.equals(Coffee.TYPE.ARABICA)) ? 0.75 * this.quantity : 0.5 * this.quantity;
        }
    }
    public SIZE getSize() {
        return size;
    }
    public double getPriceForBottle() {
        return this.priceForBottle;
    }
}
