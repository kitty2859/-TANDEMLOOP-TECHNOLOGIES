import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Calculator c = new Calculator();

        System.out.print("Enter the value of a: ");
        c.a = scan.nextDouble();

        System.out.print("Enter the value of b: ");
        c.b = scan.nextDouble();

        System.out.println("Type the operation from below to perform (case sensitive):");
        System.out.println("Add\nSubtract\nMultiply\nDivide");

        c.opr = scan.next();

        double result = c.calculate();
        System.out.println("Result: " + result);
    }
}

class Calculator {
    double a;
    double b;
    String opr;

    double calculate() {
        if (opr.equals("Add")) {
            return a + b;
        } else if (opr.equals("Subtract")) {
            return a - b;
        } else if (opr.equals("Multiply")) {
            return a * b;
        } else if (opr.equals("Divide")) {
            return a / b;
        } else {
            System.out.print("Invalid operation: ");
            return 0;
        }
    }
}

