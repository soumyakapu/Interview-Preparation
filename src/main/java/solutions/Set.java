package solutions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Set {
    public static void main(String[] args) {
    HashSet<String> hashSet=new HashSet<>();
    hashSet.add("SriRam");
    hashSet.add("Sita");
    hashSet.add("Shiva");
    hashSet.add("Parvati");
    hashSet.add("Parvati");
    hashSet.add(null);
    hashSet.add(null);
        Iterator<String> iterator=hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println("hashset values : "+ " "+iterator.next());
        }
        LinkedHashSet<String > linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Ram");
        linkedHashSet.add("Sita");
        linkedHashSet.add("Laxman");
        linkedHashSet.add("Laxman");
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        Iterator<String> listIterator=linkedHashSet.iterator();
        while (listIterator.hasNext()){
            System.out.println("LinkedHashSet : "+listIterator.next());
        }
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(10);
        treeSet.add(3);
        treeSet.add(92);
        treeSet.add(92);
     //   treeSet.add(null); if you try to do this it throws nullpointer exception
        System.out.println(treeSet);
        for (Object o :treeSet) {
            System.out.println(o);
        }

    }
}
