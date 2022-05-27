package core.level5.lection12.task1532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        input();
    }

    public static void input() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = null;
        while (!(s = reader.readLine()).equals("exit")) {
            try {
                if (s.contains("."))
                    print(Double.parseDouble(s));
                else {
                    int n = Integer.parseInt(s);
                    if (Integer.parseInt(s) > 0 && Integer.parseInt(s) < 128)
                        print((short) Integer.parseInt(s));
                    else {
                        print(n);
                    }
                }
            } catch (Exception e) {
                print(s);
            }
        }

        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
