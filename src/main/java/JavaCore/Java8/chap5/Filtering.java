package JavaCore.Java8.chap5;

import java.util.Arrays;
import java.util.List;

import static JavaCore.Java8.chap5.Dish.menu;
import static java.util.stream.Collectors.toList;

public class Filtering {
    public static void main(String[] args) {
        // Filtering with predicate
        List<Dish> vegetarianMenu  =
                menu.stream()
                    .filter(Dish::isVegetarian)
                    .collect(toList());
        vegetarianMenu.forEach(System.out::println);

        // Filtering unique elements
        System.out.println("");
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
               .filter(i -> i % 2 == 0)
               .distinct()
               .forEach(System.out::println);

        // Truncating a stream
        System.out.println("");
        List<Dish> dishesLimit3 =
                menu.stream()
                    .filter(d -> d.getCalories() > 300)
                    .limit(3)
                    .collect(toList());
        dishesLimit3.forEach(System.out::println);
        // Skipping elements
        System.out.println("");
        List<Dish> dishesSkip2 =
                menu.stream()
                        .filter(d -> d.getCalories() > 300)
                        .skip(2)
                        .collect(toList());
        dishesSkip2.forEach(System.out::println);
    }
}
