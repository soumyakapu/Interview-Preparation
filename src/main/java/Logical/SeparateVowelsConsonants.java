package Logical;

public class SeparateVowelsConsonants {
    private static Long Vowels;
    private static Long CONSONANTS;
    private static int v=0;
    private static int c=0;
    public static void main(String[] args) throws IllegalAccessException {
        String string= """
                Helloo Whatsup Guys
                """;
        System.out.println("Original Value : "+string);

        countOfVowelsAndConsonants(string);
        countUsingString(string);
        System.out.println("vowels from filter : "+Vowels);
        System.out.println("consonants from filter : "+CONSONANTS);
        System.out.println("vowels from charAt : "+v);
        System.out.println("consonants from charAt : "+c);
    }
    // using filters
    public static void countOfVowelsAndConsonants(String str) throws IllegalAccessException {
        if (str== null){
            throw new IllegalAccessException("string should not be null");
        }
     str=   str.replaceAll(" " ," ");
         Vowels=   str.chars()
                    .filter(ch-> 'a'==ch ||'e'==ch ||'i'==ch ||'o'==ch || 'u'==ch || 'A'==ch || 'E' == ch || 'I' == ch || 'O' == ch || 'U'==ch)
                    .count();
        CONSONANTS=  str.chars()
                .filter(co-> (co >='a'&& co <='z')|| (co>='A' && co<='Z'))
                .filter(co->('a'!=co && 'e'!=co && 'i'!=co && 'o'!=co && 'u'!=co) && ('A'!=co && 'E'!=co && 'I'!=co && 'O'!=co && 'U'!=co))
                .count();
    }
    // using String.atChar()
    public static void countUsingString(String str) throws IllegalAccessException {
        if (str == null){
            throw new IllegalAccessException("it should be null");
        }
      char chArray[]=  str.replaceAll(" "," ").toCharArray();
        for (int i=0;i<chArray.length;i++){
            char ch = chArray[i];
            if ('a'==ch || 'e'==ch || 'i'==ch || 'o'==ch ||'u'==ch || 'A'==ch ||'E'==ch || 'I'==ch || 'O'== ch ||'U'==ch){
                v++;
            } else if ((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z'))  {
                c++;
            }
//            else {
//                System.out.println("Nothing is there");
//            }
        }
    }
}

