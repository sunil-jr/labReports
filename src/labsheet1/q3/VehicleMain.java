package labsheet1.q3;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Maruti", "2023");
        Bicycle bicycle = new Bicycle("Mountain Bike", "2010");
        car.printInfo();
        bicycle.printInfo();
    }
}
