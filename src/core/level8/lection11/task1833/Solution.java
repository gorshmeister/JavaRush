package core.level8.lection11.task1833;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
             PrintWriter printWriter = new PrintWriter(new FileWriter(file2))) {

            while (bufferedReader.ready()) {
                String[] splittedLine = bufferedReader.readLine().split(" ");
                for (String numInString : splittedLine) {
                    Double number = Double.parseDouble(numInString);
                    long roundedNumber = Math.round(number);
                    printWriter.print(roundedNumber + " ");
                }
            }
        }
    }
}
