package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortingListToAD {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Sonu","Patel","Radha");
        List<Integer> ints=Arrays.asList(1,5,3,7);
        // for asscending order
        ints.stream().sorted()
                .forEach(System.out::println);
        // for decending order
      Set<Integer> set= ints.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toSet());

        System.out.println(set);
        list.stream().sorted().forEach(System.out::println);
    }
}
