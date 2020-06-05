import java.util.Scanner;

public class Uri1044 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if ((Math.max(firstNumber, secondNumber) % Math.min(firstNumber, secondNumber)) == 0) {
            System.out.println("Sao Multiplos");
            return;
        }

        System.out.println("Nao sao Multiplos");
    }
}
