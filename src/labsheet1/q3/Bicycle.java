package labsheet1.q3;

public class Bicycle extends Vehicle{
    public Bicycle(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void printInfo(){
        System.out.println("This is the Bicycle class with brand " + getBrand() + " and model "+ getModel());
    }
}
