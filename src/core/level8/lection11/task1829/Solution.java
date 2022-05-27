package core.level8.lection11.task1829;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\IDEA_project\\src\\text.pt1");

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            int c;
            int count = 0;
            while ((c = fileReader.read()) != -1) {
                if (((char) c >= 'a' && (char) c <= 'z') || ((char) c >= 'A' && (char) c <= 'Z')) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
