import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Uri1018 {

    final static List<Integer> brazilianNotes = Arrays.asList(100, 50, 20, 10, 5, 2);

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        int remainingCash = scanner.nextInt();

        System.out.println(remainingCash);
        for(int noteValue : brazilianNotes) {
            int required = remainingCash / noteValue;
            System.out.println(String.format("%s nota(s) de R$ %d,00", required, noteValue));
            remainingCash -= required * noteValue;
        }
    }
}
