package JavaCore.Java8.chap5;

import java.util.Arrays;
import java.util.List;

import static JavaCore.Java8.chap5.Dish.menu;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 5, 1, 2);
        Integer sum = numbers.stream().reduce(0, (a, b) -> (a + b));
        System.out.printf("%d %n", sum);

        int sum2 = numbers.stream().reduce(0, Integer::sum);
        System.out.printf("%d %n", sum2);

        numbers.stream().reduce(Integer::sum).ifPresent(System.out::println);

        int max = numbers.stream().reduce(0, Integer::max);
        System.out.printf("%d %n", max);

        int min = numbers.stream().reduce(0, Integer::min);
        System.out.printf("%d %n", min);

        int min2 = numbers.stream().reduce(0, (x, y) -> x < y ? x : y);
        System.out.printf("%d %n", min2);

        int countDishes = menu.stream().map(d -> 1).reduce(0, (a, b) -> a + b);
        System.out.printf("%d %n", countDishes);

        long countDishes2 = menu.stream().count();
        System.out.printf("%d %n", countDishes2);

    }
}
