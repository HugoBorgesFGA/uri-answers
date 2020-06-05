import java.util.Scanner;

public class Uri1007 {

    /*
        Read four integer values named A, B, C and D. Calculate and print the difference of product A and B by the product of C and D (A * B - C * D).
     */

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        final int d = scanner.nextInt();

        final int result = (a * b) - (c * d);

        System.out.println(String.format("DIFERENCA = %d", result));
    }
}
