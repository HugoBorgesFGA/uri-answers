import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

public class Uri1048 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final Map<RangeChecker, Integer> percentualIncreaseByRange = new HashMap<RangeChecker, Integer>(){{
            put(new RangeChecker(0.00, 400.00), 15);
            put(new RangeChecker(400.01, 800.00), 12);
            put(new RangeChecker(800.01, 1200.00), 10);
            put(new RangeChecker(1200.01, 2000.00), 7);
            put(new RangeChecker(2000.01, Double.MAX_VALUE), 4);
        }};

        final double salary = scanner.nextDouble();

        percentualIncreaseByRange.entrySet().stream()
                                            .filter(entry -> entry.getKey().test(salary))
                                            .findFirst()
                                            .ifPresent(entry -> {
                                                final Integer increase = entry.getValue();
                                                final double gain = (increase * salary) / 100.0;
                                                final double afterRaise = salary + gain;

                                                System.out.println(String.format("Novo salario: %.2f", afterRaise));
                                                System.out.println(String.format("Reajuste ganho: %.2f", gain));
                                                System.out.println(String.format("Em percentual: %d ", increase) + "%");
                                            });
    }

    public static class RangeChecker implements Predicate<Double> {

        private final Double lower;
        private final Double upper;

        RangeChecker(Double lower, Double upper) {
            this.lower = lower;
            this.upper = upper;
        }

        @Override
        public boolean test(Double value) {
            return (lower <= value) && (value <= upper);
        }
    }
}
