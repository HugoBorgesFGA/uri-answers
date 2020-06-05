import java.util.Scanner;

public class Uri1047 {
    public static final int MINUTES_PER_HOUR = 60;
    public static final int MINUTES_PER_DAY = 24 * MINUTES_PER_HOUR;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int beginHour = scanner.nextInt();
        final int beginMinute = scanner.nextInt();
        final int endHour = scanner.nextInt();
        final int endMinute = scanner.nextInt();

        int timestampBegin = (beginHour * MINUTES_PER_HOUR) + beginMinute;
        int timestampEnd = (endHour * MINUTES_PER_HOUR) + endMinute;
        int totalMinutes = timestampEnd - timestampBegin;

        if (totalMinutes <= 0) {
            totalMinutes += MINUTES_PER_DAY;
        }

        int lapsedHours = totalMinutes / MINUTES_PER_HOUR;
        totalMinutes -= lapsedHours * MINUTES_PER_HOUR;

        System.out.println(String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", lapsedHours, totalMinutes));
    }
}
