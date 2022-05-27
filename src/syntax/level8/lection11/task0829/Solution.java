package syntax.level8.lection11.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> list1 = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();

            list1.put(city, family);
        }

        System.out.println("Введи город: ");
        String gorod = reader.readLine();
        System.out.println(list1.getOrDefault(gorod, "Error"));

    }
}
