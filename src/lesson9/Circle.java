package lesson9;

/**
 * Created by home on 15.08.2016.
 */
public class Circle extends Shape {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*Math.sqrt(radius);
    }

    @Override
    public double perimeter() {
        return 2 *Math.PI*radius;
    }


}
