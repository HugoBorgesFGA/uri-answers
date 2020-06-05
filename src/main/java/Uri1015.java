import java.util.Scanner;

public class Uri1015 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final double x1 = scanner.nextDouble();
        final double y1 = scanner.nextDouble();

        final double x2 = scanner.nextDouble();
        final double y2 = scanner.nextDouble();

        final double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(String.format("%.4f", distance));
    }
}
