import java.util.Scanner;

public class Uri1040 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int n1 = (int) (scanner.nextDouble() * 10);
        final int n2 = (int) (scanner.nextDouble() * 10);
        final int n3 = (int) (scanner.nextDouble() * 10);
        final int n4 = (int) (scanner.nextDouble() * 10);

        int average = (((2*n1) + (3*n2) + (4*n3) + (1*n4)) / 10);
        System.out.println(String.format("Media: %.1f", (average / 10.0)));

        if (average >= 70) {
            System.out.println("Aluno aprovado.");
            return;
        }

        if (average < 50) {
            System.out.println("Aluno reprovado.");
            return;
        }

        System.out.println("Aluno em exame.");
        final int n5 = (int) (scanner.nextDouble() * 10);

        System.out.println(String.format("Nota do exame: %.1f", (n5 / 10.0)));

        final int newAverage = (average + n5) / 2;
        if (newAverage >= 50) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        System.out.println(String.format("Media final: %.1f", (newAverage / 10.0)));
    }

}
