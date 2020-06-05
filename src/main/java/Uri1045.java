import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Uri1045 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final List<Map.Entry<TriPredicate, String>> messageByPredicate = Arrays.asList(
            new AbstractMap.SimpleImmutableEntry<>(TriangleUtils::isRight, "TRIANGULO RETANGULO"),
            new AbstractMap.SimpleImmutableEntry<>(TriangleUtils::isOblique, "TRIANGULO OBTUSANGULO"),
            new AbstractMap.SimpleImmutableEntry<>(TriangleUtils::isAcute, "TRIANGULO ACUTANGULO"),
            new AbstractMap.SimpleImmutableEntry<>(TriangleUtils::isEquilateral, "TRIANGULO EQUILATERO"),
            new AbstractMap.SimpleImmutableEntry<>(TriangleUtils::isIsosceles, "TRIANGULO ISOSCELES")
        );

        final List<Double> orderedSides = Stream.of(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble())
                                                .sorted()
                                                .collect(Collectors.toList());

        final double a = orderedSides.get(2);
        final double b = orderedSides.get(1);
        final double c = orderedSides.get(0);

        if (TriangleUtils.notATriangle(a, b, c)) {
            System.out.println("NAO FORMA TRIANGULO");
            return;
        }

        messageByPredicate.forEach(entry -> {
            TriPredicate check = entry.getKey();
            String message = entry.getValue();

            if (check.test(a, b ,c)) {
                System.out.println(message);
            }
        });
    }

    static class TriangleUtils {
        public static boolean notATriangle(double a, double b, double c) {
            return (a >= (b + c));
        }

        public static boolean isRight(double a, double b, double c) {
            return (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2)));
        }

        public static boolean isOblique(double a, double b, double c) {
            return (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2)));
        }

        public static boolean isAcute(double a, double b, double c) {
            return (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2)));
        }

        public static boolean isEquilateral(double a, double b, double c) {
            return ((a == b) && (b == c));
        }

        public static boolean isIsosceles(double a, double b, double c) {
            return ((a == b) && (b != c)) || ((a != b) && (b == c));
        }
    }

    interface TriPredicate {
        boolean test(double a, double b, double c);
    }
}
