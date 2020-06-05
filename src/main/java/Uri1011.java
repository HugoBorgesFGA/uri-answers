import java.util.Scanner;

public class Uri1011 {

    private static final double PI = 3.14159;

    public static double getPytagoreanTriangleArea(double base, double height) {
        return (base * height) / 2.0;
    }

    public static double getCircleArea(double radius) {
        return PI * Math.pow(radius, 2);
    }

    public static double getTrapeziumArea(double upperBase, double lowerBase, double height) {
        final double smallerBase = Math.min(upperBase, lowerBase);
        final double biggerBase = Math.max(upperBase, lowerBase);

        return height * (smallerBase + ((biggerBase - smallerBase) / 2));
    }

    public static double getSquareArea(double side) {
        return Math.pow(side, 2);
    }

    public static double getRectangleArea(double sideA, double sideB) {
        return sideA * sideB;
    }


    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final double a = scanner.nextDouble();
        final double b = scanner.nextDouble();
        final double c = scanner.nextDouble();

        System.out.println(String.format("TRIANGULO: %.3f", getPytagoreanTriangleArea(a, c)));
        System.out.println(String.format("CIRCULO: %.3f", getCircleArea(c)));
        System.out.println(String.format("TRAPEZIO: %.3f", getTrapeziumArea(a, b, c)));
        System.out.println(String.format("QUADRADO: %.3f", getSquareArea(b)));
        System.out.println(String.format("RETANGULO: %.3f", getRectangleArea(a, b)));
    }
}
