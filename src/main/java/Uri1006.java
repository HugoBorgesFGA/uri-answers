import java.util.Scanner;

public class Uri1006 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final double a = scanner.nextDouble();
        final double b = scanner.nextDouble();
        final double c = scanner.nextDouble();

        final double average = ((2 * a) + (3 * b) + (5 * c)) / 10;

        System.out.println(String.format("MEDIA = %.1f",average));
    }
}
