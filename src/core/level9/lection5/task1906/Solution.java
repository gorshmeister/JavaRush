package core.level9.lection5.task1906;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile = reader.readLine();
        reader.close();

        ArrayList<Integer> list = new ArrayList<>();
        try (FileReader fileReader = new FileReader(inputFile)) {
            while (fileReader.ready()) {
                list.add(fileReader.read());
            }
        }
        try (FileWriter fileWriter = new FileWriter(outputFile)) {
            for (int i = 1; i < list.size(); i+=2) {
                fileWriter.write(list.get(i));
            }
        }
    }
}
