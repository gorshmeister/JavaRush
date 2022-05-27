package core.level9.lection11.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();
    public static DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");

    public static void main(String[] args) throws IOException {
        if (args.length == 0)
            args = new String[]{"D:\\IDEA_project\\src\\core\\level9\\lection11\\task1921\\text"};

        ArrayList<String> strings = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                strings.add(line);
            }
        }
        for (String lineS : strings) {
            String[] sL = lineS.split(" ");
            StringBuilder name = new StringBuilder();

            for (int i = 0; i < sL.length - 3; i++) {
                name.append(" ").append(sL[i]);
            }

            Calendar calendar = new GregorianCalendar();
            calendar.set(Integer.parseInt(sL[sL.length - 1]), Integer.parseInt(sL[sL.length - 2]) - 1, Integer.parseInt(sL[sL.length - 3]));
            PEOPLE.add(new Person(name.toString(), calendar.getTime()));
        }

        PEOPLE.forEach(person -> System.out.println(dateFormat.format(person.getBirthday()) + "\t" + person.getName()));

    }
}
