package solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
       List<Integer> list= new ArrayList<>();
       list.add(12);
       list.add(13);
       list.add(12);
       list.add(13);
       // using the Streams

       List<Integer> removedDuplicates=list.stream().distinct().collect(Collectors.toList());
       System.out.println("Using the Streams : "+removedDuplicates);

        // without using the Stream

        Set<Integer> sets=new HashSet<>();
        for (Integer set:list)
            if (!sets.contains(list))
                sets.add(set);
                System.out.println("Without the Streams : "+sets);
    }
}
