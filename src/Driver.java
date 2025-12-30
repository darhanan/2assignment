public class Driver {
    private String name;
    private String licenziaNumber;

    public Driver(String name, String licenziaNumber) {
        this.name = normalize(name, "Белгісіз адам");
        this.licenziaNumber = normalize(licenziaNumber, "N/A");
    }

    public void displayDriverInfo() {
        System.out.println("Жүргізуші: " + name + " | Куәлік №: " + licenziaNumber);
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenziaNumber;
    }

    private String normalize(String value, String fallback) {
        if (value == null) return fallback;
        String v = value.trim();
        return v.isEmpty() ? fallback : v;
    }
}
