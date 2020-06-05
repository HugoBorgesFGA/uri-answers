import java.util.Scanner;

public class Uri1017 {

    private static double consumptionInKmPerLiter = 12;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int tripDurationInHours = scanner.nextInt();
        final int speedInKmPerHour = scanner.nextInt();

        final double requiredLiters = (tripDurationInHours * speedInKmPerHour) / consumptionInKmPerLiter;

        System.out.println(String.format("%.3f", requiredLiters));
    }
}
