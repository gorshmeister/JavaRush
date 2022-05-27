package core.level8.lection11.task1834;

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) return;

        byte[] bytes = new byte[127];
        try (FileInputStream inputStream = new FileInputStream(args[0])) {
            while (inputStream.available() > 0) {
                bytes[inputStream.read()] += 1;
            }
        }
        for (byte i = 0; i < bytes.length; i++) {
            if (bytes[i] > 0) {
                System.out.println((char) i + " " + bytes[i]);
            }
        }
    }
}
