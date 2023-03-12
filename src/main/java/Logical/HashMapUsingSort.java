package Logical;

import org.apache.el.stream.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapUsingSort {
    public static void main(String[] args){
        Map<String , Integer> hashMap=new HashMap<>();
        hashMap.put("fifteen",15);
        hashMap.put("eleven",11);
        hashMap.put("eight",8);
       List<Integer> listSorted= hashMap.values().stream().sorted().collect(Collectors.toList());
        System.out.println(listSorted);
      List<String > value=  hashMap.keySet().stream().sorted().collect(Collectors.toList());
        System.out.println(value);
      Set<Integer> valuesInReverseOrder=  hashMap.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(valuesInReverseOrder);
    }
}
