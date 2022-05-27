package core.level10.lesson7.task2014;


/*
Serializable Solution
*/

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("D:\\IDEA_project\\src\\core\\level10\\lesson7\\task2014\\text");

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Solution savedObject = new Solution(5);
        oos.writeObject(savedObject);
        oos.close();

        Solution loadedObject = new Solution(6);
        loadedObject = (Solution) ois.readObject();
        ois.close();

        System.out.println(savedObject.string.equals(loadedObject.string));

    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}