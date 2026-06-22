import java.util.Scanner;

public class IT26100139Lab9Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, x1, x2, d;

        System.out.print("Enter value a: ");
        a = input.nextDouble();

        System.out.print("Enter value b: ");
        b = input.nextDouble();

        System.out.print("Enter value c: ");
        c = input.nextDouble();

        d = Math.pow(b, 2) - (4 * a * c);

        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Roots are real and different");
            System.out.println("Root 1: " + x1);
            System.out.println("Root 2: " + x2);
        } else {
            System.out.println("No real roots");
        }

        input.close();
    }
}