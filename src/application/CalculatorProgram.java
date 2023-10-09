package application;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Calculator Program");
        System.out.println();

        System.out.print("Division (/) : multiplication (*) : increase (+) : decrease (-) ---> ");
        String answer = sc.next();

        if(Objects.equals(answer, "/")) {
            System.out.println("Choose two numbers for calc:");
            System.out.print("first (divisor): ");
            double first = sc.nextDouble();
            System.out.print("Second (dividend): ");
            double second = sc.nextDouble();
            double res = first / second;

            System.out.println(first + " / " + second);

            System.out.println("Your answer: " + String.format("%.2f", res));
        }

        if(Objects.equals(answer, "*")) {
            System.out.println("Choose two numbers for calc:");
            double first = sc.nextDouble();
            double second = sc.nextDouble();
            double res = first * second;

            System.out.println(first + " * " + second);

            System.out.println("Your answer: " + String.format("%.2f", res));
        }

        if(Objects.equals(answer, "+")) {
            System.out.println("Choose two numbers for calc:");
            double first = sc.nextDouble();
            double second = sc.nextDouble();
            double res = first + second;

            System.out.println(first + " + " + second);

            System.out.println("Your answer: " + String.format("%.2f", res));
        }

        if(Objects.equals(answer, "-")) {
            System.out.println("Choose two numbers for calc:");
            double first = sc.nextDouble();
            double second = sc.nextDouble();
            double res = first - second;

            System.out.println(first + " - " + second);

            System.out.println("Your answer: " + String.format("%.2f", res));
        }

        sc.close();

    }
}
