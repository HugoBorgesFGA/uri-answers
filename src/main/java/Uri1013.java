import java.util.Scanner;

public class Uri1013 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int traveledKm = scanner.nextInt();
        final double consumedFuel = scanner.nextDouble();

        final double consumption = traveledKm / consumedFuel;

        System.out.println(String.format("%.3f km/l", consumption));
    }
}
