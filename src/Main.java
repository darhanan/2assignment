public class Main {
    public static void main(String[] args) {
        Driver bolat = new Driver("Болат", "KZ-778812");
        Driver aigerim = new Driver("Айгерім", "KZ-334109");

        Vehicle camry = new Car("Toyota Camry", 2020, 4, "Бензин");
        Vehicle hondaBike = new Motorcycle("Honda CB500", 2019, false);
        Vehicle volvoTruck = new Truck("Volvo FH", 2017, 14.0, 4);

        camry.setDriver(bolat);
        hondaBike.setDriver(bolat);
        volvoTruck.setDriver(aigerim);

        Vehicle[] vehicles = { camry, hondaBike, volvoTruck };

        for (Vehicle v : vehicles) {
            System.out.println("_________________________________________________");
            v.startEngine();
            v.displayInfo();
            v.stopEngine();
            v.displayDriverInfo();
        }

        System.out.println("_________________________________________________");
        System.out.println("Программма Битти.");
    }
}