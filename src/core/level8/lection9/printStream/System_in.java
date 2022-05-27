package core.level8.lection9.printStream;

import java.io.*;

public class System_in {
    public static void main(String[] args) throws IOException {
        String greeting = "Привет, меня зовут Амиго!\nЯ изучаю Java на сайте JavaRush. \nОднажды я стану крутым программистом!\n";
        byte[] bytes = greeting.getBytes();

        InputStream inputStream = new ByteArrayInputStream(bytes);

        System.setIn(inputStream);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
    }
}
