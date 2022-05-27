package core.level9.lection3.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        PersonScannerAdapter adapter = new PersonScannerAdapter(new Scanner(System.in));
        Person person = adapter.read();
        System.out.println(person);

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            Calendar calendar = new GregorianCalendar();

            String line = fileScanner.nextLine();
            String[] splittedLine = line.split(" ");

            int year = Integer.parseInt(splittedLine[5]);
            int month = Integer.parseInt(splittedLine[4]);
            int day = Integer.parseInt(splittedLine[3]);
            calendar.set(year, month - 1, day);

            return new Person(splittedLine[1], splittedLine[2], splittedLine[0], calendar.getTime());

        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
