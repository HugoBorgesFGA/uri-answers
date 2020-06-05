package Playground;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        List<Integer> possibleValues = Arrays.asList(
                8,
                5,
                3
        );

        List<Integer> coefficients = Arrays.asList(
                14,
                12,
                10
        );

        Counter counter = anagramCounter(possibleValues);

        int value = 18;
        while (value-- > 0) {
            System.out.println(String.format("Counter %s -> %f", getCounterValue(counter), outcomeByCounter(counter, coefficients)));
            counter.increment();
        }
    }

    private static double outcomeByCounter(Counter counter, List<Integer> coefficients) {
        double sum = 0;

        List<Algarism> algarisms = counter.getAlgarisms();
        for (int i = 0; i < algarisms.size(); i++) {
            System.out.println(String.format("Multiplying %d x %d = ", algarisms.get(i).getValue(), coefficients.get(i)));
            sum += (algarisms.get(i).getValue()*coefficients.get(i));
        }

        return sum;
    }

    private static String getCounterValue(Counter counter) {
        return counter.getAlgarisms().stream()
                                     .map(Algarism::getValue)
                                     .map(String::valueOf)
                                     .collect(Collectors.joining());
    }

    private static Counter anagramCounter(List<Integer> possibleValues) {
        return new Counter(
                possibleValues.stream()
                              .map(entry -> new Algarism(0, 0, entry - 1))
                              .collect(Collectors.toList())
        );
    }
}
