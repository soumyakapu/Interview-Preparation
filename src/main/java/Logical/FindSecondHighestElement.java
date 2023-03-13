package Logical;
import java.util.Arrays;

public class FindSecondHighestElement {
    public static void main(String[] args){
    int[] numbers={9,23,54,67,1,3,2 ,98};
    Arrays.sort(numbers);
    int size=numbers.length;
    int secondHighest=numbers[size - 2];
        System.out.println("second Highest in the array : "+secondHighest);
    int secondSmallest=numbers[1];
        System.out.println("second smallest in the array : "+secondSmallest);
    }
}
