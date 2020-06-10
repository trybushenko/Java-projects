package Lab6;


public class Bottle_of_coffee extends Coffee {
    private Coffee[] Bottle;

    enum SIZE {SMALL, MEDIUM, BIG}

    ;
    private int quantity;
    private final QUALITY quality;
    private double priceForBottle;
    private final TYPE type;
    private SIZE size;

    public Bottle_of_coffee(TYPE type, QUALITY quality) {
        this.type = type;
        this.quality = quality;
    }

    public void setSize(SIZE size) {
        this.size = size;
        if (size == SIZE.SMALL) {
            this.quantity = 60;
        } else if (size == SIZE.MEDIUM) {
            this.quantity = 100;
        } else {
            this.quantity = 160;
        }
        setPriceForBottle();
    }

    public SIZE getSize() {
        return size;
    }
    public TYPE getType() {
        return type;
    }
    public double setPriceForBottle() {
        if (quality.equals(QUALITY.BAD)) {
            priceForBottle = (type.equals(TYPE.ARABICA)) ? 0.25 * this.quantity : 0.1 * this.quantity;
        } else if (quality.equals(QUALITY.GOOD)) {
            priceForBottle = (type.equals(TYPE.ARABICA)) ? 0.5 * this.quantity : 0.35 * this.quantity;
        } else {
            priceForBottle = (type.equals(TYPE.ARABICA)) ? 0.75 * this.quantity : 0.5 * this.quantity;
        }
        return priceForBottle;
    }

    public double getPriceForBottle() {
        return priceForBottle;
    }
    public QUALITY getQuality() {
        return quality;
    }

}
