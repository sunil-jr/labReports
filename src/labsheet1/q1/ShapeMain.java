package labsheet1.q1;

public class ShapeMain {
    public static void main(String[] args) {
       Shape[] shapes = new Shape[3];
       shapes[0] = new Circle(3);
       shapes[1] = new Rectangle(3,4);
       shapes[2] = new Triangle(4,5);

       for(Shape shape: shapes){
           shape.displayInfo();
           System.out.println("Area: "+ shape.calculateArea());

       }
    }
}