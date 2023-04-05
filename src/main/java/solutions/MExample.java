package solutions;

public class MExample {
//  String s="helloooo";
//    String s2="woooo";
    public static void main(String[] args) {
//        int num=78;
//       MExample mExample= new MExample();
//        System.out.println(mExample.s + " World" + mExample.s2);


/**
 @BREAK - when a condition is satisfied, it will terminate the iteration and continues the remaining code execution.
 @CONTINUE - when a condition is satisfied, it will skip that particular iteration and continues with the next iteration.
 */

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("loop finished..");

    }
}

