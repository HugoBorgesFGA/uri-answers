import java.util.Scanner;

public class Uri1010 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int productOneCode = scanner.nextInt();
        final int productOneUnits = scanner.nextInt();
        final double productOneUnitPrice = scanner.nextDouble();

        final double totalOne = productOneUnits * productOneUnitPrice;

        final int productTwoCode = scanner.nextInt();
        final int productTwoUnits = scanner.nextInt();
        final double productTwoUnitPrice = scanner.nextDouble();
        final double totalTwo = productTwoUnits * productTwoUnitPrice;

        final double toPay = totalOne + totalTwo;

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", toPay));
    }
}
