package lesson9;

import java.util.ArrayList;

/**
 * Created by home on 15.08.2016.
 */
public class Main {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(10,10);
        System.out.println(r);

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(10, 4));
        shapes.add(new Circle(14));
        shapes.add(new Square(104));
        shapes.add(new Rectangle(10, 4));
        shapes.add(new Rectangle(10, 4));

        for ( Shape e : shapes) {
            System.out.println(e);
        }


    }

//  получить площадь
//    получить периметр
//    круг, квадрат, прямоугольник, прямоугольный треугольник

//    Залить фигуры в ArrayList
//    Вывести в консоль данные фигуры

}
