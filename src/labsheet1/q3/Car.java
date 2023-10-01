package labsheet1.q3;

public class Car extends Vehicle{
    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void printInfo(){
        System.out.println("This is the Car class with brand " + getBrand() + " and model "+ getModel());
    }
}
