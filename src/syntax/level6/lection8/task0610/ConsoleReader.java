package syntax.level6.lection8.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readString() throws Exception {
        return reader.readLine();
    }

    public static int readInt() throws Exception {
        return Integer.parseInt(reader.readLine());
    }

    public static double readDouble() throws Exception {
        return Double.parseDouble(reader.readLine());
    }

    public static boolean readBoolean() throws Exception {
        return Boolean.parseBoolean(reader.readLine());
    }

    public static void main(String[] args) throws Exception {

        readDouble();
        readBoolean();
        readString();


    }
}
