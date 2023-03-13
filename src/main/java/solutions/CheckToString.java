package solutions;

import lombok.*;

public class CheckToString {
    public static void main(String[] args) {
    User user=User.builder().email("dbviuydg8").build();
        System.out.println(user);

    }
}
@Builder


class User{
    private String name;
    private  String email;
}
