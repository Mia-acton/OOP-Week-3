package ie.atu.week3;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        //methods
        System.out.println("Please enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Please choose an operation to perform (add, subtract, multiply, divide, exponentiation): ");
        String op = sc.next();

        switch (op) {
            case "add":
                add(a, b);
                break;

            case "subtract":
                subtract(a, b);
                break;

            case "multiply":
                multiply(a, b);
                break;

            default:
                System.out.println("Invalid operation");
                break;

        }

    }
    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    public static void subtract(int a, int b) {
        int sum = a - b;
        System.out.println("The sum is: " + sum);
    }

    public static void multiply(int a, int b) {
        int sum = a * b;
        System.out.println("The sum is: " + sum);
    }
}
