public class Main {
    public static void main(String[] args) {
        SimpleLocation lima = new SimpleLocation();
        SimpleLocation qwerty = new SimpleLocation(321.45, 123.45);
        System.out.println(lima.getLongitude());
    }
}

class SimpleLocation {
    private double longitude;
    public double latitude;
    public SimpleLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public SimpleLocation() {
        this.latitude = 123.75;
        this.longitude = 234.987;
    }

    public double getLongitude() {
        return this.longitude;
    }
}
