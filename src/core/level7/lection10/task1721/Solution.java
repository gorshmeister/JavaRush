package core.level7.lection10.task1721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    /**
     * Path 1
     * D:\IDEA_project\src\testLines
     * Path 2
     * D:\IDEA_project\src\testLines1
     *
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstFilePath = reader.readLine();
        String secondFilePath = reader.readLine();
        reader.close();

        writeToArray(allLines, firstFilePath);
        writeToArray(forRemoveLines, secondFilePath);

        System.out.println(allLines);
        System.out.println(forRemoveLines);
        new Solution().joinData();
        System.out.println(allLines);
        System.out.println(forRemoveLines);
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }

    public static void writeToArray(List<String> array, String filePath) throws IOException {
        for (String line : Files.readAllLines(Paths.get(filePath))) {
            array.add(line);
        }
    }
}
