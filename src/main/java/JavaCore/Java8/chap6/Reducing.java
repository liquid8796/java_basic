package JavaCore.Java8.chap6;

import java.util.Optional;

import static JavaCore.Java8.chap6.Dish.menu;
import static java.util.stream.Collectors.reducing;

public class Reducing {
    public static void main(String[] args) {
        System.out.println("Total calories in menu: " + calculateTotalCalories());
        System.out.println("Total calories in menu: " + calculateTotalCaloriesWithMethodReference());
        System.out.println("Max calories in menu: " + findMaxCalories());
        System.out.println("Total calories in menu: " + calculateTotalCaloriesWithoutCollectors());
        System.out.println("Total calories in menu: " + calculateTotalCaloriesUsingSum());

    }
    private static int calculateTotalCalories() {
        return menu.stream()
                .collect(reducing(0, Dish::getCalories, (i, j) -> i + j));
    }

    private static int calculateTotalCaloriesWithMethodReference(){
        return menu.stream()
                .collect(reducing(0, Dish::getCalories, Integer::sum));
    }

    private static int findMaxCalories(){
        Optional<Dish> dish = menu.stream()
                .collect(reducing((x, y) -> x.getCalories() < y.getCalories() ? y : x));
        if(dish.isPresent()){
            return dish.get().getCalories();
        }
        return -1;
    }

    private static int calculateTotalCaloriesWithoutCollectors(){
        return menu.stream()
                .map(Dish::getCalories)
                .reduce(Integer::sum).get();
    }

    private static int calculateTotalCaloriesUsingSum() {
        return menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
    }
}
