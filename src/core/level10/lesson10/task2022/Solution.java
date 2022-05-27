package core.level10.lesson10.task2022;

/*
Переопределение сериализации в потоке
*/

import java.io.*;

public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(String fileName, ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (FileOutputStream fos = new FileOutputStream("D:\\IDEA_project\\src\\core\\level10\\lesson10\\task2022\\text1");
             ObjectOutputStream outputStream = new ObjectOutputStream(fos);
             FileInputStream fis = new FileInputStream("D:\\IDEA_project\\src\\core\\level10\\lesson10\\task2022\\text1");
             ObjectInputStream objectInputStream = new ObjectInputStream(fis)) {

            Solution solution = new Solution("D:\\IDEA_project\\src\\core\\level10\\lesson10\\task2022\\text2");
            solution.writeObject("It`s a text for testing");
            outputStream.writeObject(solution);
            outputStream.flush();

            Solution solution2 = (Solution) objectInputStream.readObject();

            solution2.writeObject("some text");
            System.out.println(solution);
            System.out.println(solution2);
        } catch (Exception e) {
        }
    }
}