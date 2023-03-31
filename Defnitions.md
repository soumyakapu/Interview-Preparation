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
### Spring Actuator
```md
- Spring Actuator is a powerful tool for monitoring  and managing the health of  springboot application
- BY default it provide url some of them are /actuator/health ,/actuator/info,/actuator/loggers
- we craete custom endpoints by @EndPoint by providing id has endpoint name
  it should map to a method by using @ReadOperation annotation, it can also take Request params.
  We can also change the default /actuator endpoint from the properties file by using management.endpoints.web.base-path="custom"
```
### Difference b/w String, String buffer ,StringBuilder
## String
- Storage : Strings stores in Heap area within the string constant pool
-  Objects: Strings objects are immutable(i.e that are not changeable)
- Memory : it allocate the more memory
- Thread : Within the String methods are non-synchronized so there is no thread safe
- Performance : slow 
- Usage : if data is not changing frequently we can go with the String
## StringBuffer
- Storage : StringBuffer stores in Heap area
- Objects : StringBuffer are mutable
- Memory : consume less memory
- Thread : StringBuffer has synchronized methods so it is Thread Safe
- Performance : compared to String it is fast
- Usage : if data is changing frequently
## StringBuilder
- Storage : it stores in heap
- Objects : object are mutable
- Thread : methods are non-synchronized so threads are not safe
- Performance : fast as compared to StringBuffer
- Usage : if data is changing frequently
### Marker Interface
- A marker interface is an empty interface which does not contain any methods fields and constants
- Marker Interface is also called tag interface
- it delivers the run-time type information about an object 
- it is the reason that the jvm and compiler have the additional information about an object, in short it is signal or command to the jvm
- Marker interfaces are 3 types and we can also create marker interface
- cloneable,serializable,cloneable and remote interface
## Cloneable Interface
- Cloneable belongs to lang package . It generate replica of an object with the different name
- In cloneable we have clone() method
- if we don't implement the cloneable interface and we call the clone() method it will give the classnotsupportedexception
```java
package solutions;

public class Clon implements  Cloneable {
    private int id;
    private String name;

    public Clon(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public  void show(){
        System.out.println(id + name);
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Clon clon= new Clon(1," :"+ "Sonu");
        Clon clon1=(Clon) clon.clone();
        clon1.show();
    }
}
```
### Serialization
- Serialization is converting an object into byte stream
- if any class implements Serializable interface  it has two state of an object of that class they are serialize it converts an object into byte stream,deserialization converts byte stream to object
- 
### 50  Spring JPA
- When ever we call the Jpa repository it internally calls the JPA Apis which is a interface doesn't have any implementation Jpa apis internally calls the Hibernate core apis ,which call the Jdbc
- we can also create the customized methods in jpa
### 53 Spring vs Spring Boot
### Spring :
```md
Spring is an open-source lightweight framework widelyused to develop enterprise applications
- Important feature of spring is dependency injection
- it helps to create a loosely coupled application
- to run the application we need to set server explicitly
- to run the spring application a deployment descriptor is required
- there is lot of boiler plate code is needed
- it doesn't provide support for the inmemory database
- we have to define depencies manually in pom.xml file
```
### Spring Boot
```md
- Spring Boot is built on top of the conventional spring framework, widely used to develop REST APIs.
-  important feature of the Spring Boot is Autoconfiguration.
- It helps to create a stand-alone application.
- Spring Boot provides embedded servers such as Tomcat and Jetty etc.
- There is no requirement for a deployment descriptor.
- It reduces the lines of code.
- It provides support for the in-memory database such as H2.
- In Spring Boot, there is reduction in boilerplate code.
- pom.xml file internally handles the required dependencies.
```
### Use of google.guava in an application
- Guava is open source, java based library developed by google
- it facilates best practise of code and reduce to coding errors
- it provides the  utility for methods in collection,caching,i/o,validations,common annotation and primitive support
### @JSONIgnore
- this annotation ignores the logical property of serialization and deserialization
- it is used for getters,setters and fields
- if we use this annotation at fields or its getters, the field is not serialized  


### 16. Why java 8 is more popular than java 9 and other versions?
- java 8 version is introduced in march 2014, it is a major updates like streams,static and default methods ,functional interface,lamda and java8 is a LTS(long term support) version
- java 9 is introduced in sep 2017, it has a minor updates like raective streams, modules,jshell and it introduced some internal code error and it is not LTS
### 55. == and .equals()
- == and .equals both are used to compare the two objects in java but == is a operator .equals() is a method
- == refers to checks the refernce of an object in the heap memory where as .equals() checks the value
- .equals() method will check for strings
```java
package solutions;

public class Q55 {
    public static void main(String[] args) {
        String ab="num1";
        String cd="num1";
        String ef=new String("num1");
        System.out.println(ab==cd);
        System.out.println(cd==ef);
        System.out.println(cd.equals(ef)+" checking for values using the .equals() method");
        //................................................................................................//
        int a=10,b=10;
        System.out.println(a==b);

    }
}

```
### 56. Object class
- Object class is present in java.lang package
- it is parent class of every class in java
- Every class in java extends Object class directly or indirectly , when a class extends another class then it indirectly extending the object class,if class is not extending any class then it directly extending  the object class
- Object class has some methods they are : hashCode(),getClass(),equals(),clone(),toString(),finalize(),wait(),notify(),notifyAll()
### 57. Second max highest salary in employee table
### 58. Why ArrayList is fast
- for fetching arraylist is fast than linkedlist
- linkedlist follows the node which has next and preivous element when we are trying the get the particular element it need to check with next element but with arraylist it will go to the particular index and get the value
```java
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

```
### 60. Compare vs compareTo
- 
### comparator vs comparable
- comparable is an interface
### 84. What is Optional
- Optional class is introduced in java8 to deal with the null pointer exception and it is present in util packageS
```java
package solutions;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
//        String opts[]=new String[3]; it will give the null pointer exception
//        System.out.println(opts[2].toString());
            String op[]=new String[5];
        Optional<String  > optionalS=Optional.ofNullable(op[2]);
       if (optionalS.isPresent()){
           System.out.println(optionalS +" it is  present in the array");
       }
       else {
           System.out.println(optionalS +" it is not present in the array");
       }

    }
}

```
### 119. Java program to find Second-Highest Element in an array

### 127. remove the duplicate element from the list
```java
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

```
### 128. sort the given list in ascending and descending order
```java
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

```
### 129. get the sum of all numbers present in a list using streams
```java
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
```
### Recrusion 
- When we call a method in the same method its called recrusion 
- in the below example we are doing the recrusion 
```java
package solutions;

public class RecrusionExample {
    public static void main(String[] args) {
        display(5);
    }

    private static void display(int n) {
        System.out.println("Hellooo Babyyyy");
        if(n<3)
            return;
//        for (int i = 0; i < n; i++) { // instead of recrusion we can also do looping
//            System.out.println("I hate uuuuuu");
//        }
        display(n-1);
    }
}

```
### 4. Solid Principles
- Solid Principles introduced by Robert C.Martin also know 

### Difference b/w hashtable and hashmap
```md
 HashTable : 
1. HashTable stores the data in key value pair
2.HashTable is synchronized so thread is safe
3.HashTable doesnot allow the null values and keys 
4.It is legacy class
5.intial capacity is 10 and loadfactor is 0.75
6.it is slow when compared to hashmap
```
```md
HashMap :
1. HashMap stores the data in key value pair
2.hashmap is not synchronized so the thread is not safe
3.it allows only one null key and multiple null values
4. it introduced from jdk 1.2
5. we can synchronize using the Collection.synchronizedMap(hashmap)
6.it is fast when compared to hashtable
7. iterator in hashmap is fail fast
```
### 6. Fail fast, fail safe iterators
- Iterator is a interface in collection it has two types of iterators fail fast and fail safe
- Fail fast : when a collection is iterating using iterator method any structural modification is happend by the other thread then 

### DeadLock
- When one thread is waiting for an object lock that is acquiring by the other thread and second thread is waiting for the object lock which is acquring by the first thread then each threads are waiting on each thread to release then it is called deadlock
- To overcome from deadlock by using the synchronized block,and by using the joins,avoiding the unneccessary thread lock,and by avoiding nested locks