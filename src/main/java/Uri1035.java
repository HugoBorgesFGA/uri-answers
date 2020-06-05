import java.util.Scanner;

/*
    Read 4 integer values A, B, C and D.

    Then if B is greater than C and ===> (B > C)
    D is greater than A and ===> (C > A)
    if the sum of C and D is greater than the sum of A and B and ===> (C + D) > (A + B)
    if C and D were positives values ===> (C > 0) && (D > 0)
    and if A is even ===> ((A % 2) == 0)

    write the message “Valores aceitos” (Accepted values). Otherwise, write the message “Valores nao aceitos” (Values not accepted).
 */

public class Uri1035 {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        final int d = scanner.nextInt();

        if ((b > c) &&
            (d > a) &&
            ((c + d) > (a + b)) &&
            ((c > 0) && (d > 0)) &&
            ((a % 2) == 0)
        ) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
