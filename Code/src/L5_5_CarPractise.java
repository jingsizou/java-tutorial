public class L5_5_CarPractise {
    private String brand;
    private String model = "xxx";
    private int year = 0;
    public L5_5_CarPractise(String brandName) {
        brand = brandName;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String printMessage() {
        return String.format("Brand: %s, Model: %s, Year: %s", brand, model, year);
    }
}
