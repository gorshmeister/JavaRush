package core.level10.lesson10.task2024;

/*
Знакомство с графами
*/

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Solution implements Serializable {
    int node;
    List<Solution> edges = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("D:\\IDEA_project\\src\\core\\level10\\lesson10\\task2024\\text");
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {

            Solution solution = new Solution();
            outputStream.writeObject(solution);
        }

    }
}