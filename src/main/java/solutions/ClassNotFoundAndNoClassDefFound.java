package solutions;

public class ClassNotFoundAndNoClassDefFound {
    public static void main(String[] args) throws ClassNotFoundException {
        //ClassNotFoundException
       Class.forName("solutions.ClassNotFoundAndNoClassDefFound1");

    }
}
