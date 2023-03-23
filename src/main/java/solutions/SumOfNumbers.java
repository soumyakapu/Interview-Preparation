package solutions;

import java.util.LinkedList;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> sum=new LinkedList<>();
        sum.add(2);sum.add(5);sum.add(8);
        System.out.println(sum.stream().reduce(0, Integer::sum));

    }
}
