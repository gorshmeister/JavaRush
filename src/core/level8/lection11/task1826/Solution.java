package core.level8.lection11.task1826;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

//    public class Solution {
//        public static void main(String[] args) throws IOException {
//            String mode = args[0];
//            if (!(mode.equals("-e") || mode.equals("-d"))) return;
//            try (FileInputStream fileInputStream = new FileInputStream(args[1]);
//                 FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
//
//                if (mode.equals("-e")) {
//                    while (fileInputStream.available() > 0) {
//                        fileOutputStream.write(fileInputStream.read() + 32);
//                    }
//                } else {
//                    while (fileInputStream.available() > 0) {
//                        fileOutputStream.write(fileInputStream.read() - 32);
//                    }
//                }
//            }
//        }
//    }
    /**
     * Программа запускается с одним из следующих наборов параметров:
     * -e fileName fileOutputName
     * -d fileName fileOutputName
     * e - encrypt
     * d - decrypt
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        switch (args[0]) {
            case "-e" -> encrypt(args);
            case "-d" -> decrypt(args);
        }
    }

    public static int randomLetter(){
        int min = 97;
        int max = 122;

        max -= min;

        return (int) (Math.random() * ++max) + min;
    }

    public static void encrypt(String... fileName_fileOutputName) throws IOException {
        File fileName = new File(fileName_fileOutputName[1]);
        File fileOutputName = new File(fileName_fileOutputName[2]);

        try (FileInputStream inputStream = new FileInputStream(fileName);
        FileOutputStream outputStream = new FileOutputStream(fileOutputName)) {

            while (inputStream.available() > 0) {
                int data = inputStream.read();
                outputStream.write(data + 1);
            }
        }
    }

    public static void decrypt(String... fileName_fileOutputName) throws IOException {
        File fileName = new File(fileName_fileOutputName[1]);
        File fileOutputName = new File(fileName_fileOutputName[2]);
        ArrayList<Integer> list = new ArrayList<>();

        try (FileInputStream inputStream = new FileInputStream(fileName);
        FileOutputStream outputStream = new FileOutputStream(fileOutputName)) {
            while (inputStream.available() > 0) {
                int data = inputStream.read();
                outputStream.write(data - 1);
            }
        }

    }
}
