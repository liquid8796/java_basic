package Draft;

import JavaCore.Java8.chap6.Dish;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static JavaCore.Java8.chap6.Dish.menu;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;


public class draft {

    public static void printList(int[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        List<Integer> collect = Arrays.stream(nums)
                .map(x -> x * x)
                .boxed()
                .collect(toList());
        System.out.println(collect);
    }

}
