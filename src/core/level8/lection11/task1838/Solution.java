package core.level8.lection11.task1838;


import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> treeSet = new TreeSet<String>();

        String fileName;
        String outputFile = null;
        while (!(fileName = reader.readLine()).equals("end")) {
            treeSet.add(fileName);

            if (outputFile == null) {
                int indexOfSuffix = fileName.lastIndexOf(".pt");
                outputFile = fileName.substring(0, indexOfSuffix);
            }
        }

        if (outputFile == null) return;
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(outputFile))) {
            for (String entry : treeSet) {
                try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(entry))) {
                    while (bufferedInputStream.available() > 0) {
                        bufferedOutputStream.write(bufferedInputStream.readAllBytes());
                        bufferedOutputStream.write('\n');
                    }
                }
            }
        }
    }
}

