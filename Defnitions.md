### Set
```md
- set is a interface in collection which extends from collection interface
- set doesn't follow the insertion order
- it stores the data according the hashcode value
- it does not allow duplicate values
- it can store only one null value
- set is implemented by HashSet and LinkedHashSet
- set extends the Sortedset which implements Treeset
- set elements are iterates by Iterator
```
### HashSet
```md
- it doesn't follow insertion order
- it won't allow duplicate values and allow only one null value
```
```java
public class Set {
    public static void main(String[] args) {
    HashSet<String> hashSet=new HashSet<>();
    hashSet.add("SriRam");
    hashSet.add("Sita");
    hashSet.add("Shiva");
    hashSet.add("Parvati");
    hashSet.add("Parvati");//it have only one Parvati
    hashSet.add(null);//it takes only one null
    hashSet.add(null);
        Iterator<String> iterator=hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println("hashset values : "+ " "+iterator.next());
        }

    }
}
```
### LinkedHashSet
```md
- it follows insertion order
- we can iterator by Iterator
```
```java
package solutions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class Set {
    public static void main(String[] args) {
        LinkedHashSet<String > linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Ram");
        linkedHashSet.add("Sita");
        linkedHashSet.add("Laxman");//it take only one laxman
        linkedHashSet.add("Laxman");
        linkedHashSet.add(null); //it only take only one null value
        linkedHashSet.add(null);
        Iterator<String> listIterator=linkedHashSet.iterator();
        while (listIterator.hasNext()){
            System.out.println("LinkedHashSet : "+listIterator.next());
        }
    }
}
```
### TreeSet
```md
- TreeSet implements SortedSet
- TreeSet maintains ascending order
- for retriving treeset are fast
- treeset doesn't allow duplicate values and null values
```
```java
package solutions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Set {
    public static void main(String[] args) {
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

```
```md
When To Use?
 Use HashSet if you don’t want to maintain any order of elements.
 Use LinkedHashSet if you want to maintain insertion order of elements.
 Use TreeSet if you want to sort the elements according to some Comparator
```
### 8,9 How to check free memory and total memory in java
```md
we can check the free memory and total memory in java by using Runtime class
```
```java
package solutions;

public class MemoryInJava {
    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        System.out.println("free memory :"+runtime.freeMemory());
        System.out.println("total memory : "+runtime.totalMemory());
        System.out.println("max memory : "+runtime.maxMemory());
    }
}

```
### 13.What is Unreachable catch block error
```md
- when compiler is not able to reach the catch block then it is called unreachable catch block
- it occurs when top level exception in first block ,always top level exception should be last
```
```java
package solutions;

public class UnreachableCatchBlock {
    public static void main(String[] args) {
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch (Exception e){
            System.out.println("Array size is out of bound");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            
        }
    }
}
```
### 14.what is diffrence between ClassNotFoundException and NoClassDefFoundError
```md
## ClassNotFoundException: it occurs when jvm try to load the class which is not present in class path ,it is checked exception
## NoClassDefFoundError: it occurs when class is present in class path at compile time but not present at runtime ,it is linkage error
```
```java
package solutions;

public class ClassNotFoundAndNoClassDefFound {
    public static void main(String[] args) throws ClassNotFoundException {
        //ClassNotFoundException
       Class.forName("solutions.ClassNotFoundAndNoClassDefFound1");

    }
}
```
### 15. Custom immutable class
```md
- Immutable means that cannot be changed.We can create the custom immutable class by declaring the class as final and thier data members as final
```
```java
package solutions;

public  class CustomImmutable {
    public static void main(String[] args) {
        Immutable immutable=new Immutable("Radha");
//        Immutable immutable1=new Immutable("Laxmi");// there is no setters so we cannot chnage the instance variable
        immutable.getName();
    }
}
 final class Immutable{
     final String name;
     Immutable( final String name){
         this.name=name;
     }
     void getName(){
         System.out.println("immuting the class "+ name);
     }
}
```
### 17. Interface and why we have to use
```md
- Interface is a blueprint of a class ,it has static constants and abstract methods
- By using Interface we can achieve the abstraction,allows the multiple inheritance functionality and we achieve the loose coupling
- Interface represents the IS-A relation
- Interface doesn't have method body for abstract and public methods but we have method body for static, default and private methods
- By default interface has public static final for variables and public abstract for methods
- By Java 8 interface has static and default methods
- By Java 9 interface has private methods
```
````java
package solutions;

public interface InterfaceExample {
    int a = 0;
     String show();
    public void show1();
    static void run() {

    }
    default void run1() {

    }
    private void run3() {

    }
}

````
### why interface are widely used than abstract
```md
- Interface are widely used than abstract because abstract class support concrete methods but interface cannot support concrete methods
```
### 18. Is functional Interface is there before java8? what are they?
```md
- An Interface which has only single abstract method are called functional interface.Yes, we have functional interface before java8 they are:
- Runnable,Callable,ActionListner,Comparable,Comparator
- We can restrict the interface as Functional Interface by annonating with @FunctionalInterface
```
```java
package solutions;
@FunctionalInterface
public interface InterfaceExample {
    int a = 0;
     String show();
     static void run() {

    }
    default void run1() {

    }
    private void run3() {

    }
}

```
### 20. Other than public what is the access modifier used for interface
```md
- we can use default access modifier but it is applicable to same package itself
- we cannot use private or protected access modifier for interface
```
