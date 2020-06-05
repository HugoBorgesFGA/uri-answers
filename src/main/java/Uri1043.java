import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Uri1043 {

    public static boolean isTriangle(double sideA, double sideB, double sideC) {

        if ((sideA == 0) || (sideB == 0) || (sideC == 0)) return false;

        List<Double> orderedSides = Stream.of(sideA, sideB, sideC)
                                          .sorted()
                                          .collect(Collectors.toList());

        double biggerSide = orderedSides.get(orderedSides.size() - 1);
        double perimeter = orderedSides.stream().reduce(0.0, Double::sum);

        return (perimeter - biggerSide) > biggerSide;
    }

    public static double trianglePerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    public static double trapeziumArea(double baseA, double baseB, double height) {
        return ((baseA + baseB) * height) / 2;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final double A = scanner.nextDouble();
        final double B = scanner.nextDouble();
        final double C = scanner.nextDouble();

        if (isTriangle(A, B, C)) {
            System.out.println(String.format("Perimetro = %.1f", trianglePerimeter(A, B, C)));
            return;
        }

        System.out.println(String.format("Area = %.1f", trapeziumArea(A, B, C)));
    }
}
