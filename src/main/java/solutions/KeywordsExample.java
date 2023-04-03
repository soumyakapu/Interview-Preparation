package solutions;

public class KeywordsExample {


    public static void main(String[] args) {
        int a =10,b=20;
        if(a==b){
            System.out.println(false);
        }

        String name="Hello",name1="Hello";
        if(name==name1){
            System.out.println("true from ==");
        }
        if(name.equals(name1)){
            System.out.println("true from equals");
        }
    }

}

