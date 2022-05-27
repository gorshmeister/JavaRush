package core.level9.lection11.task1917;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\IDEA_project\\src\\text5.txt");
        FileConsoleWriter fileConsoleWriter = new FileConsoleWriter(file);
        fileConsoleWriter.write(stringSomeething());
        fileConsoleWriter.close();

    }

    public static String stringSomeething(){
        return "It`s a text for testing";
    }
    public static class FileConsoleWriter {
        private FileWriter fileWriter;

        public FileConsoleWriter(File file) throws IOException {
           fileWriter = new FileWriter(file);
        }

        public void write(char[] cbuf, int off, int len) throws IOException {
            fileWriter.write(cbuf, off, len);
            System.out.println(new String(cbuf).substring(off, off + len));
        }

        public void write(int c) throws IOException {
            fileWriter.write(c);
            System.out.println((char)c);
        }

        public void write(String str) throws IOException {
            fileWriter.write(str);
            System.out.println(str);
        }

        public void write(String str, int off, int len) throws IOException {
            fileWriter.write(str, off, len);
            System.out.println(str.substring(off, off + len));
        }

        public void write(char[] cbuf) throws IOException {
            fileWriter.write(cbuf);
            System.out.println(new String(cbuf));
        }

        public void close() throws IOException {
            fileWriter.close();
        }

    }
}
