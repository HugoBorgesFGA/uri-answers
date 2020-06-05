import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Uri1021 {

    final static List<Integer> brazilianNotes = Arrays.asList(10000, 5000, 2000, 1000, 500, 200);
    final static List<Integer> brazilianCoins = Arrays.asList(100, 50, 25, 10, 5, 1);

    public static int sortBills(int initialValue) {

        int remaining = initialValue;

        System.out.println("NOTAS:");
        for (int noteValue : brazilianNotes) {
            int required = (remaining / noteValue);
            System.out.println(String.format("%d nota(s) de R$ %.2f", required, (noteValue / 100.0)));
            remaining -= (required * noteValue);
        }

        return remaining;
    }

    public static int sortCoins(int initialValue) {
        int remaining = initialValue;

        System.out.println("MOEDAS:");
        for (int coinValue : brazilianCoins) {
            int required = (remaining / coinValue);
            System.out.println(String.format("%d moeda(s) de R$ %.2f", required, (coinValue / 100.0)));
            remaining -= (required * coinValue);
        }

        return remaining;
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        double totalMoney = scanner.nextDouble();
        int totalMoneyInCents = (int) (totalMoney * 100.0);

        int inCoins = sortBills(totalMoneyInCents);
        sortCoins(inCoins);
    }
}
