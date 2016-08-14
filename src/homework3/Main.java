package homework3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Firm firm = new Firm("test", "Kyiv", 19999.00);
        Console console = new Console(firm);
        console.consolMenu();


        // Number num1 = new Number(5);
        // Number num2 = new Number(2);
        // Number test = num1.add(num2);
        // test = num1.div(num2);
        // test = num1.fact();
        // test = num1.mod(num2);
        // test = num1.mul(num2);
        // test = num1.pow(num2);
        // test = num1.sub(num2);
        //
        // System.out.println(test.get());
        // System.out.println(num1.get());
        // System.out.println(num2.get());

        // Fraction frac1 = new Fraction(1,3);
        // Fraction frac2 = new Fraction(7,8);
        // Fraction test = frac1.add(frac2);
        // test = frac1.sub(frac2);
        // test = frac1.mul(frac2);
        // System.out.println(test.numerator +" / " +test.denominator);
        // System.out.println(frac1.mul(frac2).toString());
        // test.print();


    }


}
