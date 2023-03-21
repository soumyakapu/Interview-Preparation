package solutions;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListFast {
    public static void main(String[] args) {
        LinkedList<String >linkedList=new LinkedList<>();
        linkedList.add("Helloo");
        linkedList.add("Welcome");
        linkedList.add("Bye");
        ArrayList<String > arrayList= new ArrayList<>();
        arrayList.add("Helloo");
        arrayList.add("Welcome");
        arrayList.add("Bye");

        System.out.println("from LinkedList "+linkedList.get(1));
        System.out.println("from ArrayList "+arrayList.get(1));


    }
}
