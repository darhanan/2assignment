public class Car extends Vehicle {
    private int doors;
    private String fuelType;

    public Car(String brand, int year, int doors, String fuelType) {
        super(brand, year);
        this.doors = doors;
        this.fuelType = normalize(fuelType, "Белгісіз отын");
    }

    @Override
    public void startEngine() {
        System.out.println("Көлік Қоздырылды. Отын түрі: " + fuelType + ".");
    }

    @Override
    public void stopEngine() {
        System.out.println("Көлік Сөндірілді.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Көлік: " + brand + " (" + year + "), есіктер саны: " + doors + ", отын: " + fuelType);
    }

    private String normalize(String value, String fallback) {
        if (value == null) return fallback;
        String v = value.trim();
        return v.isEmpty() ? fallback : v;
    }
}
