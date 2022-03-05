package JavaCore.Java8.chap4;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

public class StreamVsCollection {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java8", "Lambdas", "In", "Action");
        Stream<String> s = names.stream();
        s.forEach(System.out::println);
    }

}
