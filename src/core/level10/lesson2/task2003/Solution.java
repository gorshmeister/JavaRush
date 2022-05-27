package core.level10.lesson2.task2003;

/*
Знакомство с properties
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        //напишите тут ваш код
        Properties properties = new Properties();

        properties.putAll(runtimeStorage);

        properties.store(outputStream, null);
    }

    public static void load(InputStream inputStream) throws IOException {
        //напишите тут ваш код
        Properties properties = new Properties();

        properties.load(inputStream);

        properties.forEach((k, v) -> runtimeStorage.put(k.toString(), v.toString()));
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(reader.readLine())) {
            load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}