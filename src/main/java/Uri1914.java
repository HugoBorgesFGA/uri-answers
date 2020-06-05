import java.util.Scanner;

public class Uri1914 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int rounds = scanner.nextInt();

        while(rounds-- > 0) {
            String kid1 = scanner.next();
            String kid1choice = scanner.next();

            String kid2 = scanner.next();
            scanner.next(); // ignore second kid choice.. irrelevant

            String[] result = new String[2];
            if (kid1choice.equals("PAR")) {
                result[0] = kid1;
                result[1] = kid2;
            } else {
                result[0] = kid2;
                result[1] = kid1;
            }

            int kid1Fingers = scanner.nextInt();
            int kide2Fingers = scanner.nextInt();

            System.out.println(result[(kid1Fingers + kide2Fingers) % 2]);
        }
    }
}
