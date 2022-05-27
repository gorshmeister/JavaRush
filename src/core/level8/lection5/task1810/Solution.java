package core.level8.lection5.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        while (true) {
            try (FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
                if (inputStream.available() < 1000) {
                    throw new DownloadException();
                }


            }

        }

    }

    public static class DownloadException extends Exception {

    }
}
