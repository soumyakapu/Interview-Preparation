package solutions;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
//        String opts[]=new String[3]; it will give the null pointer exception
//        System.out.println(opts[2].toString());
            String op[]=new String[5];

        Optional<String  > optionalS=Optional.ofNullable(op[2]);
       if (optionalS.isPresent()){
           System.out.println(optionalS +" it is  present in the array");
       }
       else {
           System.out.println(optionalS +" it is not present in the array");
       }

    }
}
