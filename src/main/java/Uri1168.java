import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uri1168 {

    private static final Map<Character, Integer> ledsByChar = new HashMap<Character, Integer>(){{
        put('0', 6);
        put('1', 2);
        put('2', 5);
        put('3', 5);
        put('4', 4);
        put('5', 5);
        put('6', 6);
        put('7', 3);
        put('8', 7);
        put('9', 6);
    }};

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int entries = scanner.nextInt();
        while (entries-- > 0) {
            String number = scanner.next();
            System.out.println(String.format("%d leds", getLEDSbyText(number)));
        }
    }

    private static Integer getLEDSbyText(String text) {
        return text.chars().mapToObj(c -> (char) c)
                           .map(ledsByChar::get)
                           .mapToInt(Integer::intValue).sum();
    }
}
