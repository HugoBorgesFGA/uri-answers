import java.util.Scanner;

public class Uri1020 {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        int ageInDays = scanner.nextInt();

        final int years = ageInDays / 365;
        ageInDays -= (years * 365);

        final int months = ageInDays / 30;
        ageInDays -= (months * 30);

        System.out.println(String.format("%d ano(s)", years));
        System.out.println(String.format("%d mes(es)", months));
        System.out.println(String.format("%d dia(s)", ageInDays));
    }
}
