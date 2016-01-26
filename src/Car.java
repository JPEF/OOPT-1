public class Car {

    private String licensePlate;

    private String make;

    private String model;

    private int manufacturingYear;
    
    public Car(String plate, String make, String model, int year) {
        this.licensePlate = plate;
        this.make = make;
        this.model = model;
        this.manufacturingYear = year;
    }
    
    public String getCarInfo() {
        return this.make + " " + this.model;
    }
}
