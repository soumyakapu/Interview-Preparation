package solutions;

public class Clon implements  Cloneable {
    private int id;
    private String name;

    public Clon(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public  void show(){
        System.out.println(id + name);
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Clon clon= new Clon(1," :"+ "Sonu");
        Clon clon1=(Clon) clon.clone();
        clon1.show();
    }
}
