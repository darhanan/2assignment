public class Truck extends Vehicle {
    private double capsTons;
    private int axles;

    public Truck(String brand, int year, double capTons, int axles) {
        super(brand, year);
        this.capsTons = capTons;
        this.axles = axles;
    }

    @Override
    public void startEngine() {
        System.out.println("Жүк көлігі оталды. Жүк көтерімі: " + capsTons + " т.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Жүк көлігі сөнді.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Жүк көлігі: " + brand + " (" + year + "), көтерім: " + capsTons + " т, ось саны: " + axles);
    }
}
