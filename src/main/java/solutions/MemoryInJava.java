package solutions;

public class MemoryInJava {
    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        System.out.println("free memory :"+runtime.freeMemory());
        System.out.println("total memory : "+runtime.totalMemory());
        System.out.println("max memory : "+runtime.maxMemory());
    }
}
