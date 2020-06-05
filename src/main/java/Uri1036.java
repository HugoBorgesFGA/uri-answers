import java.util.Scanner;


public class Uri1036 {

    public static double getDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static double getX1(double a, double b, double c, double delta) {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public static double getX2(double a, double b, double c, double delta) {
        return (-b - Math.sqrt(delta)) / (2 * a);
    }

    public static void printImpossible() {
        System.out.println("Impossivel calcular");
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final double a = scanner.nextDouble();
        final double b = scanner.nextDouble();
        final double c = scanner.nextDouble();

        if (a == 0) {
            printImpossible();
            return;
        }

        final double delta = getDelta(a, b, c);
        if (delta < 0) {
            printImpossible();
            return;
        }

        final double x1 = getX1(a, b, c, delta);
        System.out.println(String.format("R1 = %.5f", x1));

        final double x2 = getX2(a, b, c, delta);
        System.out.println(String.format("R2 = %.5f", x2));
    }
}
