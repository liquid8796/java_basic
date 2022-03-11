package JavaCore.Java8.chap5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        List<Transaction> query1 = transactions.stream()
                .filter(y -> y.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());
        System.out.println("Query1: " + query1);

        // Query 2: What are all the unique cities where the traders work?
        List<String> query2 = transactions.stream()
                .map(c -> c.getTrader().getCity())
                .distinct()
                .collect(toList());
        System.out.println("Query2: " + query2);

        // Query 3: Find all traders from Cambridge and sort them by name.
        List<Trader> query3 = transactions.stream()
                .map(Transaction::getTrader)
                .filter(c -> c.getCity().equals("Cambridge"))
                .sorted(comparing(Trader::getCity))
                .collect(toList());
        System.out.println("Query3: " + query3);

        // Query 4: Return a string of all traders’ names sorted alphabetically.
        List<String> query4 = transactions.stream()
                .map(n -> n.getTrader().getName())
                .distinct()
                .sorted()
                .collect(toList());
        System.out.println("Query4: " + query4);

        // Query 5: Are any traders based in Milan?
        boolean query5 = transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"));
        System.out.println("Query5: " + query5);

        // Query 6: Print all transactions’ values from the traders living in Cambridge.
        List<Integer> query6 = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .collect(toList());
        System.out.println("Query6: " + query6);

        // Query 7: What’s the highest value of all the transactions?
        Integer query7 = transactions.stream()
                .map(Transaction::getValue)
                .reduce(0, Integer::max);
        System.out.println("Query7: " + query7);

        // Query 8: Find the transaction with the smallest value.
        Optional<Integer> query8 = transactions.stream()
                .map(Transaction::getValue)
                .reduce((a, b) -> a > b ? b : a);
        System.out.println("Query8: " + query8);

        // Query 9: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Milan"))
                .forEach(t -> t.getTrader().setCity("Cambridge"));
        System.out.println("Query9: " + transactions);


    }
}
