package JavaCore.GenericType;

import java.util.ArrayList;
import java.util.List;

public class GenericMain {

    public static double sum(List<? extends Number> list){
        double sum = 0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(sum(list));
    }
}
