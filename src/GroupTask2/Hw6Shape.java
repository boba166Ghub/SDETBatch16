package GroupTask2;
/*
Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code
 */

import java.util.concurrent.Callable;

public interface Hw6Shape {

    void calculateArea();

    void calculatePerimiter();
}

    class Circle implements Hw6Shape{

double circleRadius;
public Circle(double radius){
    this.circleRadius =radius;
}
        @Override
        public void calculateArea() {
        double area=3.14*(circleRadius * circleRadius);
            System.out.println("Circle area is "+area);
        }

        @Override
        public void calculatePerimiter() {
        double perimiter=2*3.14* circleRadius;
            System.out.println("Perimiter of circle is "+perimiter);

        }
    }

    class Square implements Hw6Shape{

       double squareSide;
       public Square(double squareSide){
           this.squareSide=squareSide;

       }

        @Override
        public void calculateArea() {
        double area=squareSide*squareSide;
            System.out.println("Area of square is "+area);
        }

        @Override
        public void calculatePerimiter() {
       double perimiter=4*squareSide;
            System.out.println("Perimiter of square is "+perimiter);
        }
    }

    class ShapeTester{
        public static void main(String[] args) {

           Circle circle=new Circle(9.9);
           Square square=new Square(10.5);

           circle.calculateArea();
           circle.calculatePerimiter();

           square.calculateArea();
           square.calculatePerimiter();

        }
    }







