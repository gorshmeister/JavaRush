package core.level7.lection10.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));
        allPeople.add(Person.createMale("Петров Петр", new Date()));
    }

    public static DateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
    public static DateFormat outputDate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);


    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-c" -> createManyPeople(args);
            case "-u" -> updateManyPeople(args);
            case "-d" -> {
                for (int i = 1; i < args.length; i++)
                    deleteManyPeople(Integer.parseInt(args[i]));
            }
            case "-i" -> {
                for (int i = 1; i < args.length; i++)
                    printManyPeople(Integer.parseInt(args[i]));
            }
        }

    }

    /**
     * @param name_sex_bd args[1...n] - name, sex, birthDay;
     * @throws ParseException parseEx
     */
    public static void createManyPeople(String... name_sex_bd) throws ParseException {
        for (int i = 1; i < name_sex_bd.length; i += 3) {
            Date date = simpleDate.parse(name_sex_bd[i + 2]); // arg[2]
            String sex = name_sex_bd[i + 1]; // arg[1]
            String name = name_sex_bd[i]; // arg[0]
            switch (sex) {
                case "м" -> allPeople.add(Person.createMale(name, date));
                case "ж" -> allPeople.add(Person.createFemale(name, date));
            }
            System.out.println(allPeople.size() - 1);
        }
    }

    /**
     * @param id_name_sex_bd args[0] - id,
     *                       args[1] - name
     *                       args[2] - sex
     *                       args[3] - bd
     * @throws ParseException
     */
    public static void updateManyPeople(String... id_name_sex_bd) throws ParseException {
        for (int i = 1; i < id_name_sex_bd.length; i += 4) {

            Date date = simpleDate.parse(id_name_sex_bd[i + 3]); // arg[3]
            String sex = id_name_sex_bd[i + 2]; // arg[2]
            String name = id_name_sex_bd[i + 1]; // arg [1]
            int index = Integer.parseInt(id_name_sex_bd[i]); // arg [0]

            switch (sex) {
                case "м" -> allPeople.set(index, Person.createMale(name, date));
                case "ж" -> allPeople.set(index, Person.createFemale(name, date));
            }
        }
    }

    /**
     * @param id
     */
    public static void deleteManyPeople(int... id) {
        for (int currentID : id) {
            Person person = allPeople.get(currentID);
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }
    }

    public static void printManyPeople(int... id) {
        for (int currentID : id) {
            Date date = allPeople.get(currentID).getBirthDate();
            String dateString = outputDate.format(date);
            System.out.println(allPeople.get(currentID).getName() + (allPeople.get(currentID).getSex() == Sex.MALE ? " м " : " ж ") + dateString);
        }
    }
}
