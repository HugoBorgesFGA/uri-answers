import java.util.Scanner;

public class Uri1061 {

    private static final int MINUTE_IN_SECONDS = 60;
    private static final int HOUR_IN_SECONDS = 60 * MINUTE_IN_SECONDS;
    private static final int DAY_IN_SECONDS = 24 * HOUR_IN_SECONDS;

    public static Timesample readTimesample(Scanner scanner) {

        scanner.next();
        int day = scanner.nextInt();

        int hours = scanner.nextInt();
        scanner.next();
        int minutes = scanner.nextInt();
        scanner.next();
        int seconds = scanner.nextInt();

        return new Timesample(day, hours, minutes, seconds);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        Timesample beginning = readTimesample(scanner); // new Timesample(5, 8, 12, 23);
        Timesample end = readTimesample(scanner); // new Timesample(9, 6, 13, 23);

        printDuration(beginning, end);
    }

    private static void printDuration(Timesample beginning, Timesample end) {
        int totalSecondsTimelapse = end.getTimestampInSeconds() - beginning.getTimestampInSeconds();

        final int days = totalSecondsTimelapse / DAY_IN_SECONDS;
        totalSecondsTimelapse -= (days * DAY_IN_SECONDS);

        final int hours = totalSecondsTimelapse / HOUR_IN_SECONDS;
        totalSecondsTimelapse -= (hours * HOUR_IN_SECONDS);

        final int minutes = totalSecondsTimelapse / MINUTE_IN_SECONDS;
        totalSecondsTimelapse -= (minutes * MINUTE_IN_SECONDS);

        System.out.println(String.format("%d dia(s)", days));
        System.out.println(String.format("%d hora(s)", hours));
        System.out.println(String.format("%d minuto(s)", minutes));
        System.out.println(String.format("%d segundo(s)", totalSecondsTimelapse));
    }

    public static class Timesample {
        private final int day;
        private final int hour;
        private final int minute;
        private final int second;

        public Timesample(int day, int hour, int minute, int second) {
            this.day = day;
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public int getTimestampInSeconds() {
            return second + (MINUTE_IN_SECONDS * minute) + (HOUR_IN_SECONDS * hour) + (DAY_IN_SECONDS * day);
        }
    }
}
