package core.level3.lection11.task1319;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String way = reader.readLine();


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(way))) {
            String text;
            while (!(text = reader.readLine()).equals("exit")) {
                writer.write(text + "\n");
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();
    }
}
