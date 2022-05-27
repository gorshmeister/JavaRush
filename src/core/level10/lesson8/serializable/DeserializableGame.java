package core.level10.lesson8.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableGame {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("D:\\IDEA_project\\src\\core\\level10\\lesson8\\serializable\\save");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        SavedGame savedGame = (SavedGame) objectInputStream.readObject();

        System.out.println(savedGame);
    }
}
