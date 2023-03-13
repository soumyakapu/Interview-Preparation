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
