package JavaCore.Java8.chap5;

import java.util.Arrays;
import java.util.List;

import static JavaCore.Java8.chap5.Dish.menu;
import static java.util.stream.Collectors.toList;

public class Mapping {
    public static void main(String[] args) {
        // map
        List<String> dishNames = menu.stream()
                                     .map(Dish::getName)
                                     .collect(toList());
        System.out.println(dishNames);

        // map
        System.out.println("");
        List<String> words = Arrays.asList("Hello", "World");
        List<Integer> wordLengths = words.stream()
                                         .map(String::length)
                                         .collect(toList());
        System.out.println(wordLengths);

        // map
        System.out.println("");
        List<Integer> dishNamesLengths = menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(toList());
        System.out.println(dishNamesLengths);

        // flatMap
        System.out.println("");
        List<String> flatMapWords = words.stream()
             .map(w -> w.split(""))
             .flatMap(Arrays::stream)
             .distinct()
             .collect(toList());
        System.out.println(flatMapWords);

        // flatMap
        System.out.println("");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .map(x -> x*x)
                .forEach(System.out::println);

        // flatMap
        System.out.println("");
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> pairs =
                numbers1.stream()
                        .flatMap((Integer i) -> numbers2.stream()
                                .map((Integer j) -> new int[]{i, j})
                        )
                        .filter(pair -> (pair[0] + pair[1]) % 3 == 0)
                        .collect(toList());
        pairs.forEach(pair -> System.out.println("(" + pair[0] + ", " + pair[1] + ")"));
    }
}
