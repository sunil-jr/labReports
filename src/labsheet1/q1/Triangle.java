package labsheet1.q1;

public class Triangle implements Shape{
    int base;
    int height;

    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    @Override
    public float calculateArea() {
        return (float) (base*height)/2;
    }

    @Override
    public void displayInfo() {
        System.out.println("The base of triangle is: "+ base+ " and height is: "+ height);
    }
}
