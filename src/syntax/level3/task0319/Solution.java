package syntax.level3.task0319;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine(); //читаем строку
        String sAge = bufferedReader.readLine(); //
        int nAge = Integer.parseInt(sAge);
    }
}
