public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        if (hasSidecar) {
            System.out.println("Мотоцикл оталды (арбасымен).");
        } else {
            System.out.println("Мотоцикл оталды.");
        }
    }

    @Override
    public void stopEngine() {
        System.out.println("Мотоцикл сөнді.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Мотоцикл: " + brand + " (" + year + "), арба: " + (hasSidecar ? "бар" : "жоқ"));
    }
}
