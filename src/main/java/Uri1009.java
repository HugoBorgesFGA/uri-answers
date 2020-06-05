import java.util.Scanner;

public class Uri1009 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String sellersName = scanner.next();
        final double baseSalary = scanner.nextDouble();
        final double totalSold = scanner.nextDouble();

        final double toBeReceived = baseSalary + (0.15 * totalSold);

        System.out.println(String.format("TOTAL = R$ %.2f", toBeReceived));
    }
}
