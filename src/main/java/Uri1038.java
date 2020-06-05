import java.util.Scanner;

public class Uri1038 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final double[] priceByCode = new double[]{0.0, 4.0, 4.5, 5.0, 2.0, 1.5};
        final int code = scanner.nextInt();
        final int amount = scanner.nextInt();

        final double total = priceByCode[code] * amount;
        System.out.println(String.format("Total: R$ %.2f", total));
    }
}
