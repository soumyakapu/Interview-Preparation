package solutions;

public  class CustomImmutable {
    public static void main(String[] args) {
        Immutable immutable=new Immutable("Radha");
        Immutable immutable1=new Immutable("Laxmi");
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