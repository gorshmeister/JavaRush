package syntax.level8.lection11.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        List<String> months = Arrays.asList("January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October", "November", "December");

        if (months.contains(text))
            System.out.println(text + " is the " + (months.indexOf(text) + 1) + " month");
    }
}
