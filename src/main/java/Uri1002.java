import java.util.Scanner;

public class Uri1002 {

    public static void main(String[] args) {

        final double PI = 3.14159;
        final Scanner scanner = new Scanner(System.in);
        final double radius = scanner.nextDouble();

        System.out.println(String.format("A=%.04f", (Math.pow(radius, 2) * PI)));
    }
}
