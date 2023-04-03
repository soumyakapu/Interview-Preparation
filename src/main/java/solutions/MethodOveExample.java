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
