package JavaCore.Java8.chap6;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.partitioningBy;

public class PartitionPrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Numbers partitioned in prime and non-prime: " + partitionPrimes(100));
    }

    public static Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n)
                .boxed()
                .collect(partitioningBy(i -> isPrime(i)));
    }

    public static boolean isPrime(int candidate) {
        return IntStream.rangeClosed(2, candidate-1)
                .limit((long) Math.floor(Math.sqrt(candidate)-1))
                .noneMatch(i -> candidate%i == 0);
    }
}
