import java.util.Scanner;

public class Uri1019 {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        int totalSeconds = scanner.nextInt();

        final int hours = totalSeconds / 3600;
        totalSeconds -= hours * 3600;

        final int minutes = totalSeconds / 60;
        totalSeconds -= minutes * 60;

        System.out.println(String.format("%d:%d:%d", hours, minutes, totalSeconds));
    }
}
