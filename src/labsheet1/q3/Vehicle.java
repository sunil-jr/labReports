package labsheet1.q3;

public class Vehicle {
    private String brand;
    private String model;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void printInfo(){
        System.out.println("This is the Vehicle class with brand: "+ brand + " and model "+ model);
    }
}
