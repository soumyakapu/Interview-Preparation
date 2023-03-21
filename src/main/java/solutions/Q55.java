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
