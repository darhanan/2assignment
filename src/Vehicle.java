public abstract class Vehicle {
    protected String brand;
    protected int year;

    private Driver driver;

    public Vehicle(String brand, int year) {
        this.brand = normalize(brand, "Белгісіз бренд");
        this.year = year;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void displayInfo() {
        System.out.println(brand + " (" + year + ")");
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public void displayDriverInfo() {
        if (driver == null) {
            System.out.println("Жүргізуші: тағайындалмаған");
            return;
        }
        driver.displayDriverInfo();
    }

    private String normalize(String value, String fallback) {
        if (value == null) return fallback;
        String v = value.trim();
        return v.isEmpty() ? fallback : v;
    }
}