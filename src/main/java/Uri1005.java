import java.util.Scanner;

public class Uri1005 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final double a = scanner.nextDouble();
        final double b = scanner.nextDouble();

        final double average = ((3.5 * a) + (7.5 * b)) / 11;

        System.out.println(String.format("MEDIA = %.5f",average));
    }
}
