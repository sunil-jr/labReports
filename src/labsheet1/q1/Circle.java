package labsheet1.q1;

public class Circle implements Shape{
    int radius;
    private static final float PI = 3.14f;

    public Circle (int radius){
        this.radius = radius;
    }
    @Override
    public float calculateArea() {
        return PI*radius*radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("The radius of circle is : "+ radius);
    }
}
