package Draft;

import JavaCore.Java8.chap5.Trader;
import JavaCore.Java8.chap5.Transaction;
import JavaCore.Java8.chap6.Dish;
import JavaCore.Java8.chap6.ToListCollector;

import java.util.*;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static JavaCore.Java8.chap6.Dish.menu;
import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;


public class draft {

    public static int countWordsIteratively(String s) {
        int counter = 0;
        boolean lastSpace = true;
        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                lastSpace = true;
            } else {
                if (lastSpace) counter++;
                lastSpace = Character.isWhitespace(c);
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        String SENTENCE =
                " Nel   mezzo del cammin  di nostra  vita " +
                        "mi  ritrovai in una  selva oscura" +
                        " che la  dritta via era   smarrita ";
        System.out.println("hello world".length());
    }

}
