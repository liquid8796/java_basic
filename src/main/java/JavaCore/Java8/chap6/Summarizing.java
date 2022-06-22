package JavaCore.Java8.chap6;

import java.util.*;

import static JavaCore.Java8.chap6.Dish.menu;
import static java.util.stream.Collectors.*;

public class Summarizing {
    public static void main(String[] args) {
        System.out.println("Number of dishes: " + howManyDishes());
        System.out.println("Total calories in menu: " + calculateTotalCalories());
        System.out.println("Average calories in menu: " + calculateAverageCalories());
        System.out.println("Menu statistics: " + calculateMenuStatistics());
        System.out.println("The most caloric dish is: " + findMostCaloricDishUsingComparator());
        System.out.println("Short menu: " + getShortMenu());
        System.out.println("Short menu comma separated: " + getShortMenuCommaSeparated());
    }

    private static long howManyDishes(){
        return menu.stream()
                .collect(counting());
    }

    private static int calculateTotalCalories() {
         return menu.stream()
                 .collect(summingInt(Dish::getCalories));
    }

    private static Double calculateAverageCalories() {
        return menu.stream()
                .collect(averagingInt(Dish::getCalories));
    }

    private static IntSummaryStatistics calculateMenuStatistics() {
        return menu.stream()
                .collect(summarizingInt(Dish::getCalories));
    }

    private static Optional<Dish> findMostCaloricDishUsingComparator() {
        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);
        return menu.stream().collect(maxBy(dishCaloriesComparator));
    }

    private static String getShortMenu() {
        return menu.stream().map(Dish::getName).collect(joining());
    }

    private static String getShortMenuCommaSeparated() {
        return menu.stream().map(Dish::getName).collect(joining(", "));
    }
}
