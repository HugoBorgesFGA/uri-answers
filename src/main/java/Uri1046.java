import java.util.Scanner;

public class Uri1046 {
    final static int HOURS_PER_DAY = 24;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int begin = scanner.nextInt();
        final int end = scanner.nextInt();

        System.out.println(String.format("O JOGO DUROU %d HORA(S)", duration(begin, end)));
    }

    public static int duration(int begin, int end) {
        if (begin == end) return HOURS_PER_DAY;
        if (begin > end) return (HOURS_PER_DAY - begin) + end;

        return end - begin;
    }
}
