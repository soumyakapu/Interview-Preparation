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
### 136. separate vowels and consonants using String filters
```java
package Logical;

public class SeparateVowelsConsonants {
    private static Long Vowels;
    private static Long CONSONANTS;
    private static int v=0;
    private static int c=0;
    public static void main(String[] args) throws IllegalAccessException {
        String string= """
                Helloo Whatsup Guys
                """;
        System.out.println("Original Value : "+string);

        countOfVowelsAndConsonants(string);
        countUsingString(string);
        System.out.println("vowels from filter : "+Vowels);
        System.out.println("consonants from filter : "+CONSONANTS);
        System.out.println("vowels from charAt : "+v);
        System.out.println("consonants from charAt : "+c);
    }
    // using filters
    public static void countOfVowelsAndConsonants(String str) throws IllegalAccessException {
        if (str== null){
            throw new IllegalAccessException("string should not be null");
        }
     str=   str.replaceAll(" " ," ");
         Vowels=   str.chars()
                    .filter(ch-> 'a'==ch ||'e'==ch ||'i'==ch ||'o'==ch || 'u'==ch || 'A'==ch || 'E' == ch || 'I' == ch || 'O' == ch || 'U'==ch)
                    .count();
        CONSONANTS=  str.chars()
                .filter(co-> (co >='a'&& co <='z')|| (co>='A' && co<='Z'))
                .filter(co->('a'!=co && 'e'!=co && 'i'!=co && 'o'!=co && 'u'!=co) && ('A'!=co && 'E'!=co && 'I'!=co && 'O'!=co && 'U'!=co))
                .count();
    }
    // using String.atChar()
    public static void countUsingString(String str) throws IllegalAccessException {
        if (str == null){
            throw new IllegalAccessException("it should be null");
        }
      char chArray[]=  str.replaceAll(" "," ").toCharArray();
        for (int i=0;i<chArray.length;i++){
            char ch = chArray[i];
            if ('a'==ch || 'e'==ch || 'i'==ch || 'o'==ch ||'u'==ch || 'A'==ch ||'E'==ch || 'I'==ch || 'O'== ch ||'U'==ch){
                v++;
            } else if ((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z'))  {
                c++;
            }
//            else {
//                System.out.println("Nothing is there");
//            }
        }
    }
}
```
### 135. sort employees according to their salary
```java
package Logical;

import lombok.*;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortOfEmployees {
    public static void main(String[] args) {
    List<Employees> employeesList = new LinkedList<>();
    employeesList.add(new Employees(1,"emp1","emp1@gmail.com",12000));
    employeesList.add(new Employees(2,"emp2","emp2@gmail.com",10000));
    employeesList.add(new Employees(3,"emp3","emp3@gmail.com",9000));

//    List<Employees> emp=employeesList.stream()
//                 .filter(c->c.getSalary()<13000)
//            .sorted()
//            .collect(Collectors.toList());
//        System.out.println(emp);
        Stream<Employees> stream=employeesList.stream();
        stream.sorted((s1,s2)-> (int) (s1.getSalary() - s2.getSalary())).forEach(System.out::println);
    }

}
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
class Employees{
    private int empId;
    private String name;
    private String email;
    private  long salary;
}
```
### 133. count of letters or words using stream
```java
package Logical;

import org.apache.el.stream.Stream;

public class CountOfWordsOrLetters {
    public static void main(String[] args){
        String str= """
                Your in String Bro
                """;
      Long s=  str.chars().count();
        System.out.println(s);
    }
}
```
### fork in Git

- In git, fork is a copy of a repository that allow us to make changes without affecting the original repository, when you fork a repository you create a new copy of that repository under the own account and you make the changes to your copy of repository without affecting the original repository

### 134. Hashmap sort based on values using stream 
```java
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

```
### 119. Java program to find Second Highest Element In an Array
```java
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
```
### 120. Count strings whose length is greater than 3 in List using streams
```md

```
###  @Builder
```md
- @Builder is a Lombok annotation .it will automatically generate the builder class for java class  that builder responsible for creating the setters and getters by default for non-static fields
- note that if we want to modify the values we have to use explicitly getters and setters annotation
  - @Builder will provide the all type of constructors called telescoping constructors
    - @Builder will provide convenient for object creation
    - it allow for the optional fields
- no we dont have toString method in @Builder
```
```java
package solutions;

import lombok.*;

public class CheckToString {
    public static void main(String[] args) {
    User user=User.builder().email("dbviuydg8").build();
        System.out.println(user);
    }
}
@Builder
class User{
    private String name;
    private  String email;
}
```
### 100. How annotation works in java
```md
- Annotation provide additional information about code ,it essentially  metadata that are added to classes,methods,fields it provide addtional information to the compiler or run time environment
- We can also create customized annotation using @interface
```
```java
package solutions;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


public class CustomizedAnnotaion {
    @Hello
    static void run(){
        System.out.println("helooo");
    }
    public static void main(String[] args) {
        run();
    }
}

@Retention(RetentionPolicy.RUNTIME) // it specifys it should retained at runtime
//@Target(ElementType.METHOD) // if we want to use only for methods we can use this
 @interface Hello{

}
```
### 101.Transaction rollback
```md
- Transaction rollback is the process of undoing the changes made by a transaction in DBMS .if transaction fails due to error or some other reasons  the DBMS discard the changes and it returns to its original state it can be done by manually by user or automatically trigged by the dbms whenever transaction fails due to deadlock or other some reasons.
- Transaction rollback ensure the reliability and consistency of database 
```
### Spring Ioc Container
- Ioc : Inversion of control
- Ioc is responsible for instantinating the application class , configure the object , and to assemble the dependency between two objects by using the xml configuration or java annotation
- There are 2 types of Ioc : Bean Factory , ApplicationContext
- ApplicationContext is interface above the bean factory application context provides some additional features like webApplication(Context) 
```md
ApplicationContext context =   
    new ClassPathXmlApplicationContext("applicationContext.xml");  
```
### Dependency Injection
- Dependency Injection is a design pattern which removes the dependency from the program by providing the external sources like Xml file it makes loosely coupled and easy for testing
- Dependency Injection can achieved by Setter Injection and Construct Injection

### Constructor Injection and Setter Injection
- 