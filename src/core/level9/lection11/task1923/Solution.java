package core.level9.lection11.task1923;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            args = new String[]{"D:\\IDEA_project\\src\\core\\level9\\lection11\\task1923\\text",
                    "D:\\IDEA_project\\src\\core\\level9\\lection11\\task1923\\text2"};
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]))) {

            while (fileReader.ready()) {
                String line = fileReader.readLine();
                String[] splittedLine = line.split(" ");

                for (String oneword : splittedLine) {
                    if (oneword.matches("\\S*\\d\\S*")) bufferedWriter.write(oneword + " ");
                }

            }
        }
    }
}
