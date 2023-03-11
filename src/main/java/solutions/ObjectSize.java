package solutions;

import java.lang.instrument.Instrumentation;

public class ObjectSize {

    public static void main(String[] args) {
        System.out.println(""+Size.getObjectSize(new Size()));
    }


}
class Size{
    int a;
    int b;
    private static Instrumentation inst;
    void show(){
        System.out.println("am from show");
    }
    public static void premain(String args, Instrumentation inst) {
       inst=inst;
        System.out.println("" +inst.getObjectSize(new Size()));

    }
    public static long getObjectSize(Object o) {
        return inst.getObjectSize(o);
    }
}