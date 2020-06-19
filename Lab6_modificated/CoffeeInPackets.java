package Lab6_modificated;

public class CoffeeInPackets extends Coffee{
    private final int massOfPacket;
    public CoffeeInPackets(QUALITY quality, TYPE type) {
        super(quality, type);
        massOfPacket = 15;
    }

    @Override
    public String toString() {
        return "CoffeeInPackets{" +
                "massOfPacket=" + massOfPacket +
                ", quality=" + quality +
                ", type=" + type +
                '}';
    }

    @Override
    public QUALITY getQuality() {
        return super.getQuality();
    }

    @Override
    public TYPE getType() {
        return super.getType();
    }

    public int getMassOfPacket() {
        return massOfPacket;
    }
}
