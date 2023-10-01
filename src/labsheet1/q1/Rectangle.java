package labsheet1.q1;

public class Rectangle implements Shape{

    int length;
    int breadth;

    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public float calculateArea() {
        return length*breadth;
    }

    @Override
    public void displayInfo() {
        System.out.println("The length of rectangle is: "+ length+ " and breadth is: "+ breadth);
    }
}
