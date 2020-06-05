import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri1042 {

    private final static int INPUT_VALUES  = 3;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<Integer> inputValues = new ArrayList<>();

        int remaining = INPUT_VALUES;
        while (remaining-- > 0) {
            inputValues.add(scanner.nextInt());
        }

        inputValues.stream().sorted().forEach(System.out::println);
        System.out.println();

        inputValues.stream().forEach(System.out::println);
    }
}
