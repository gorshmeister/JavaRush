package core.level3.lection11.task1326;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader readerConsole = new BufferedReader(new InputStreamReader(System.in));

        String way = readerConsole.readLine();

        try (BufferedReader readerFile = new BufferedReader(new FileReader(way))) {
            String i;
            while ((i = readerFile.readLine()) != null) {
                list.add(Integer.parseInt(i));
            }
        } catch (IOException e) {
            e.getStackTrace();
        }

        readerConsole.close();

        Collections.sort(list);

        for (int even : list) {
            if (even % 2 == 0) {
                System.out.println(even);
            }
        }

        System.out.println(list);
    }
}
