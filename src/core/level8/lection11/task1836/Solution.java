package core.level8.lection11.task1836;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (!(fileName = reader.readLine()).equals("exit")) {
            new ReadThread(fileName).start();
        }

    }

    public static class ReadThread extends Thread {
        String name;
        public ReadThread(String fileName) throws FileNotFoundException {
            //implement constructor body
            this.name = fileName;
        }

        @Override
        public void run() {
            int[] bytes = new int[128];
            int maxCount = 0, maxCountByte = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
                while (reader.ready()) {
                    bytes[reader.read()]++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < bytes.length; i++) {
                if (bytes[i] > maxCount) {
                    maxCount = bytes[i];
                    maxCountByte = i;
                }
            }
            resultMap.put(name, maxCountByte);
        }

        // implement file reading here - реализуйте чтение из файла тут
    }
}
