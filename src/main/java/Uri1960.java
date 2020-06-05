import java.util.*;

public class Uri1960 {

    private static int[] arabians = new int[]{1, 5, 10, 50, 100, 500, 1000};
    private static String[] romanian = new String[]{"I", "V", "X", "L", "C", "D", "M"};

    private static List<Integer> parseBase(int number, int base) {

        List<Integer> result = new ArrayList<>();

        int remaining = number;
        while (remaining > base) {
            int order = (int) Math.pow(base, Math.floor(Math.log(remaining) / Math.log(base)));
            int decrement = (remaining / order) * order;

            remaining -= decrement;
            result.add(decrement);
        }

        result.add(remaining);
        return result;
    }

    private static String next(String romanianItem) {
        for(int i = 0; i < romanian.length; i++) {
            if (romanianItem.equals(romanian[i])) return romanian[++i];
        }

        return "";
    }

    private static String parseRomanian(int baseTenArabian) {

        if (baseTenArabian == 0) return "";

        int remaining = baseTenArabian;
        String result = "";

        for(int i = arabians.length - 1; i >= 0; i--) {

            int chunk = arabians[i];
            while (chunk <= remaining) {
                remaining -= chunk;
                result += romanian[i];
            }
        }

        // Edge cases
        switch (result.length()) {
            case 4:
                {
                    String firstRomanian = String.valueOf(result.charAt(0));
                    String lastRomanian = String.valueOf(result.charAt(3));
                    if (firstRomanian.equals(lastRomanian)) {
                        result = firstRomanian + next(firstRomanian);
                    }
                }

                break;

            case 5:
                {
                    String firstRomanian = String.valueOf(result.charAt(0));
                    String lastRomanian = String.valueOf(result.charAt(4));
                    result = lastRomanian + next(firstRomanian);
                }
                break;

            default:
                break;
        }

        return result;
    }

    public static String toRomanian(int value) {
        String result = "";
        for(int base10 : parseBase(value, 10)) {
            result = result + parseRomanian(base10);
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(toRomanian(new Scanner(System.in).nextInt()));
    }
}
