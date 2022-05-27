package core.level10.lesson8.externalizable;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        FileOutputStream outputStream = new FileOutputStream("D:\\IDEA_project\\src\\core\\level10\\lesson8\\externalizable\\save.ser");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//
//        UserInfo userInfo = new UserInfo("Ivan", "Ivanov", "Ivan Ivanov`s passport data");
//
//        objectOutputStream.writeObject(userInfo);
//
//        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("D:\\IDEA_project\\src\\core\\level10\\lesson8\\externalizable\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        UserInfo userInfo = (UserInfo) objectInputStream.readObject();
        System.out.println(userInfo);

        objectInputStream.close();
    }
}
