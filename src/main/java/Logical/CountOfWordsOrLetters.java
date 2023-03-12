package Logical;

import org.apache.el.stream.Stream;

public class CountOfWordsOrLetters {
    public static void main(String[] args){
        String str= """
                Your in String Bro
                """;
      Long s=  str.chars().count();
        System.out.println(s);
    }
}
