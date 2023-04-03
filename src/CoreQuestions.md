### 1. what is compiler and interpreter?is java compiler based or interpreter?
- Java is both compiler and interpreter
- Complier converts Source code to Byte code
- Interpreter converts Byte code to Machine code 
- Jvm converts Byte code to Machine Code
### 2. what is JIT compiler?
- The Just-In-Time (JIT) compiler is a component of the runtime environment that improves the performance of Java™ applications by compiling bytecodes to native machine code at run time.
### What is JVM,JDK and JRE, JVM architechure?
- JVM :java virtual machine is a abstract machine .it is a specification that provides the runtime environment in which bytecode converts into machine code
- JDK : java development kit 


### 3. What is Serializable?
- Serializable is a interface , which extends the marker interface which doesn't have the data members and methods in it
- Which is in the java.io.package
- If the classes implements serializable if they want to serialize or deserialize we have two mechanism they are serialize and deserialize
- Serialize : converts the Object into byte stream it is done by ObjectOutput stream
- Deserialize : converts the Byte Stream to Object and it is done by ObjectInput stream

### 4.Explain method Overloading and overriding?
- If a class has same method signature with different parameters are called method overloading
- If a subclass extends superclass the methods in the subclass are overridden by the methods in the superclass
```java
package solutions;

public class MethodOveExample {
    public static void main(String[] args) {
    A a = new A();
//    a.run(1,2);
//    a.run(1,2,"3");

  B c = new C();
   c.running();
    }
}
// method overloading
class A{
    public void run(int i,int j){
        System.out.println("am run with 2 parameters");
    }
    public void run(int i,int j,String k){
        System.out.println("am run with 3 parameters");
    }
}
class B {
    public void running() {
        System.out.println("running in superclass");
    }
}
    class C extends B{
        public void running(){
            System.out.println("running in subclass");
        }

    }

```
### 5.What is the difference between static and normal methods ?
- Static is a key word which can be used for methods,variables and class when we declare static for any we no need to create a instance (object)
- We can only declare a nested class has static it is not possible to declare a top class has static but we can achieve the static class behaviour by using the singleton class
```java
public class MyStaticClass {
    private static final MyStaticClass INSTANCE = new MyStaticClass();

    private MyStaticClass() {
        // Private constructor to prevent external instantiation
    }

    public static MyStaticClass getInstance() {
        return INSTANCE;
    }

    public static void doSomething() {
        // Code to do something
    }
}
// by using the above class we have can achieve the behaviour of Static class
```
- Static for methods : If we declare the method as Static we can override the method but we cannot inherit
- non-static variables are cannot access in static methods 
```java
package solutions;

public class StaticExample {
    public static void run(){
        System.out.println("run from parent");
    }
    public static void main(String[] args) {

        Hello1.run();

    }

}
class Hello1 extends StaticExample{
    public static void run(){
        System.out.println("run from child");
    }
}
```
- static variables : if we declare variable as static 

### 6. What is abstraction? and how we achieve?
- Abstraction is the process of hiding the implementation, abstraction has the definition but no declaration
- it can be achieved by abstract class and interface
- abstract class can have concrete methods so abstract class cant provide the abstraction
- By Interface we can achieve the complete abstraction
- In interface we have static and default methods by java 8 and by java 9 we have private methods .In interface by default interface methods are public and abstract
```java
public abstract  class H{
    void run(){
        
    }
    abstract ram(){
        
    }
}
```
### 7. What is constructor?
- Constructor is used to intialize the objects 
- constructor name should be same as class name
- Constructor doesn't have return type , constructors are two types default and parameterized
### 8.Characteristics of objects
- Characteristics of an object is defined by its class which includes variables,methods,constructors,inheritance,polymorphism,encapsulation
- these characteristics defines the state,behaviour and nature of an object
- state of object is know by the instance variables,behaviour is known by the methods
### 9.What is garbage collection ?
- Garbage Collection in java is the automated freeuping the memory that being not used by the program
- An object is created and no longer used then eligible for garbage collection ,garbage collector runs automatically in the background
- An object is created and no longer used then eligible for garbage collection ,garbage collector runs automatically in the background
### 10. What is oops concepts and explain ?
###  11. What super, this keywords and method ?
- super,this,method are used to define the behaviour of a class
- super: super keyword used to refer the superclass to the current object
```java
package solutions;

public class KeywordsExample {
    KeywordsExample(int b){
        System.out.println(b);
    }
    public static void main(String[] args) {
        Aa aa= new Aa(2);

    }

}
class Aa extends KeywordsExample{
    Aa(int a){
        super(23);
        System.out.println(a);

    }
}


```
- this : this keyword used to refer to the instance variable 
- this keyword used to refer to methods 
- instance variables are used to define the state of an object , the variables which are declared inside the class but outside the method are called instance variables
- local variables are declared within the class and methods
- Static variables are declared anywhere in class with the static keyword
```java
package solutions;

public class KeywordsExample {


    public static void main(String[] args) {
        Aa aa= new Aa();
        aa.show1(7);
    }

}
class Aa extends KeywordsExample{
int a;

    void show(int a){
        this.a=a;
        System.out.println(a+  "  from show method");
    }
    void show1(int a){
        this.show(4);
        System.out.println(a);
    }
}

// it will print the  4 from show method and 7
```
### 12.Why do we need instance variables and what is instance ?
- Instance is a single occurance of an object, Instance variables are declared inside the class and outside the methods 
- instance variables are accessed by anywhere in within class
### 13.Immutable and mutable objects ?
- mutable object can be changed once it is intialized and no need to create another object
- state of an object is changed
- we can use getters and setters to change the values
- mutable objects are may or may not be thread safe

```java
package solutions;

public class MExample {

    String s;

    public MExample(String s) {
        this.s = s;
    }

    public void setS(String  setName) {
        this.s=setName;
    }

    public void getS() {
        this.s=s;
        System.out.println(s);
    }

    public static void main(String[] args) {
        MExample mExample = new MExample("hellll");


        mExample.setS("World");
        mExample.setS("Welcome");
        mExample.getS();

    }
}


```
- immutable : immutable objects are cannot be changed once it is created
- there is no setters to modifies the value but have only getters
- immutable objects state cannot be changed
- these objects are thread safe
```java
package solutions;

public class MExample {
  String s="helloooo";
    String s2="woooo";
    public static void main(String[] args) {
       MExample mExample= new MExample();
        System.out.println(mExample.s + " World" + mExample.s2);
    }
}
```
### 14.Difference between StringBuilder , String and StringBuffer ?
### 15.Wait, notify, notifyAll ?
- Object class is the parent of all the classes  it has some methods they are listed below :
- 1. toSTring(): it converts the object to string 
- 2. hashCode() : it converts to hexadecimal
- 3. wait() : it tells to wait thread until another thread calls notify or notifyAll
- 4. notify() : it notify the thread that it is waiting state
- 5. notifyAll() :it notifys all the threads that are in the waiting
- 6. equals() : it checks reference of the objects are same or not (note : == checks the values are same or not)
```java
package solutions;

public class KeywordsExample {


    public static void main(String[] args) {
        int a =10,b=20;
        if(a==b){
            System.out.println(false);
        }

        String name="Hello",name1="Hello";
        if(name==name1){
            System.out.println("true from ==");
        }
        if(name.equals(name1)){
            System.out.println("true from equals");
        }
    }

}
```
### 16.Final, finally and finalize ?
- final keyword is declared to a variable,class and methods 
- whenever a variable is declared as final it cannot be changed
- if we declare to methods it cannot be overridden
- if it declared for class it cannot be extended
- finally: it is used in exceptions if we want to execute the code even if we get exception then we can use finally block , generally it is used for close the connections
- finalize : it is used in garbage collection ,it is called before a object is being destroyed
### Exceptions
- Throwable is the superclass for Exceptions and error , Throwable is a class in lang package
- Throwable has two subclass Exception and error
- Exception : Terminating the program abnormally , it distrubs the normal flow of program
- Exception Handling : it terminates the program in a smooth way
### 17.  What is the difference between exception and error in Java? ...
- Errors mainly occur due to system resources
- It is mostly caused by the environment in which the application is running.
 ````md
- Errors cannot be handled or recovered
- Errors occured at runtime
- Errors are unchecked errors
- Errors are in java.lang.Errors package
- Errors can occur at out of memory
- Errors are not thrown at compile time
 ````
```
Exception : 	It is mainly caused by the application itself.
- Exceptions can be handled using try catch
- Exceptions are two types checked and unchecked
- Checked Excpetions are thrown at compile time example : Io exception 
- UncheckedExceptions are ArrayOutOfBound,NullPointerException
- Exceptiona are in the java.lang.Exception package
- Exceptions has 4 keywords : try-catch,throw, throws
- whenever exception occurs try block create a exception object and throws then catch block catch that exception
- throw keyword used to create a customized execptions
- throws keyword throws to exception
```
### 18 .Can we just use try instead of finally and catch blocks?
### 19. How you handled exception in your project
- we have used customized exception handlers
- using try-catch,throws
### 20. Methods in throwable class
- Java Throwable class provides several methods like 
- addSuppressed(),
- fillInStackTrace(), 
- getMessage(),
- getStackTrace(), 
- getSuppressed(),
- toString(),
- printStackTrace() 
### 21.Chained Exception
- Chained exception also known as nested Exception
- Chained Exception helps to identify a situation in which one exception causes another Exception in an application.
### 22. what is advice,point cut,joint point?
### 23. what is Collections and Collection?