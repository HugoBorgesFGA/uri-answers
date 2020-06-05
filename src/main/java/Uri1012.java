import java.util.Scanner;

public class Uri1012 {

    public static int max(int a, int b) {
        return (a + b + Math.abs(a - b)) / 2;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        final int greatestOne = max(a, max(b, c));

        System.out.println(String.format("%d eh o maior", greatestOne));
    }
}
