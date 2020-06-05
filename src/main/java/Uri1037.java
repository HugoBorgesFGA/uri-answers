import java.util.Scanner;

public class Uri1037 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final double number = scanner.nextDouble();

        if ((0 <= number) && (number <= 25)) {
            System.out.println("Intervalo [0,25]");
        } else if ((25 < number) && (number <= 50)) {
            System.out.println("Intervalo (25,50]");
        } else if ((50 < number) && (number <= 75)) {
            System.out.println("Intervalo (50,75]");
        } else if ((75 < number) && (number <= 100)) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
