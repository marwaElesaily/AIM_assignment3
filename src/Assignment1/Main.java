package Assignment1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("add int + int = " + calc.add(2,3));
        System.out.println("add double + double = " + calc.add(2.4,3.3));
        System.out.println("add double + int = " + calc.add(2.5,3));
        System.out.println("add int + double = " + calc.add(2,3.2));

        System.out.println("format result = "+Calculator.formatResult(calc.add(7,8),4));
    }
}
