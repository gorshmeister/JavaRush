package core.level9.lection11.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        String file;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file = reader.readLine();
        }

        List<String> lines = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            while (fileReader.ready()) {
                lines.add(fileReader.readLine());
            }
        }
        for (String line : lines) {
            String[] splittedLine = line.split(" ");
            int count = 0;

            for (String slovo : splittedLine) {
                count += Collections.frequency(words, slovo);
            }
            if (count == 2)
                System.out.println(line);
        }
    }
}
