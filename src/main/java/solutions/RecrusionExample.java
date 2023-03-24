package solutions;

public class RecrusionExample {
    public static void main(String[] args) {
        display(5);
    }

    private static void display(int n) {
        System.out.println("Hellooo Babyyyy");
        if(n<3)
            return;
//        for (int i = 0; i < n; i++) {
//            System.out.println("I hate uuuuuu");
//        }
        display(n-1);
    }
}
