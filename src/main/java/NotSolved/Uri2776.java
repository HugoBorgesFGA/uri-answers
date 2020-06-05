package NotSolved;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Uri2776 {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {

            int amountOfOffers = scanner.nextInt();
            int amountOfCans = scanner.nextInt();
            int earnedCash = 0;
            List<Offer> offers = new ArrayList<>();

            while (amountOfOffers-- > 0) {
                offers.add(readOffer(scanner));
            }

            List<Offer> sortedByUnitPrice = offers.stream()
                                                  .sorted(Comparator.comparingDouble(Offer::unitPrice).reversed())
                                                  .collect(Collectors.toList());

            System.out.println("Amount of cans: " + amountOfCans);
            System.out.println(sortedByUnitPrice);
        }
    }

    public static Offer readOffer(Scanner scanner) {
        return new Offer(scanner.nextInt(), scanner.nextInt());
    }

    public static class Offer {
        private final int amount;
        private final int price;

        public Offer(int amount, int price) {
            this.amount = amount;
            this.price = price;
        }

        public double unitPrice() {
            return (price / amount);
        }

        public int getAmount() {
            return amount;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Offer{" +
                    "amount=" + amount +
                    ", price=" + price +
                    '}';
        }
    }
}
