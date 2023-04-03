package solutions;

import java.io.*;

public class SerializeExample implements Serializable {
    String name;
    String email;

    public SerializeExample(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static void main(String[] args) throws IOException {
        SerializeExample serializeExample=new SerializeExample("sonu","email.com");
        //serialize
        FileOutputStream fileOutputStream=new FileOutputStream("D:\\Rajasekhar\\Projects\\Interview-Preparation\\src\\main\\java\\solutions\\SerializeExample");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(serializeExample);
        System.out.println(objectOutputStream);
        objectOutputStream.close();
    }
}
