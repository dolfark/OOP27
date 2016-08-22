package lesson9;

/**
 * Created by home on 15.08.2016.
 */
public abstract class Shape {

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return String.format("perimeter : %05.2f, area : %05.2f", perimeter(), area());
    }

}
