package solutions;

public class UnreachableCatchBlock {
    public static void main(String[] args) {
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch (Exception e){
            System.out.println("Array size is out of bound");
        }
//        catch (ArrayIndexOutOfBoundsException ex){
//
//        }
    }
}
