package core.level7.lection10.task1710;

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
            case "-c" -> createPeople(args[1], args[2], args[3]);
            case "-r" -> printPeople(Integer.parseInt(args[1]));
            case "-u" -> updatePeople(Integer.parseInt(args[1]), args[2], args[3], args[4]);
            case "-d" -> removePeople(Integer.parseInt(args[1]));
        }
    }

    /**
     * argument -c name sex bd "Миронов м 15/04/1990"
     *
     * @param name     name person
     * @param sex      gender of a person
     * @param birthDay birth day a person
     * @throws ParseException parse Exception
     */

    public static void createPeople(String name, String sex, String birthDay) throws ParseException {
        Date date = simpleDate.parse(birthDay);
        switch (sex) {
            case ("м") -> allPeople.add(Person.createMale(name, date));
            case ("ж") -> allPeople.add(Person.createFemale(name, date));
        }
        System.out.println(allPeople.size() - 1);

//        Person person = null;
//        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(args[3]);
//        String sex = args[2];
//        switch (sex) {
//            case ("м") -> person = Person.createMale(args[1], date);
//            case ("ж") -> person = Person.createFemale(args[1], date);
//        }
//        allPeople.add(person);
//        System.out.println(allPeople.indexOf(person));
    }

    /**
     * argument -r id "Миронов м 15-Apr-1990"
     *
     * @param id id a person
     */
    public static void printPeople(int id) {
        Date date = allPeople.get(id).getBirthDate();
        String dateString = outputDate.format(date);
        if (allPeople.get(id).getSex() == Sex.MALE) {
            System.out.println(allPeople.get(id).getName() + " м " + dateString);
        } else
            System.out.println(allPeople.get(id).getName() + " ж " + dateString);

//        Person person = null;
//        person = allPeople.get(Integer.parseInt(args[1]));
//
//        System.out.println(person);
    }

    /**
     * argument -u id name sex bd
     *
     * @param id       id person
     * @param name     name person
     * @param sex      gender of a person
     * @param birthDay birth day a person
     * @throws ParseException parse Exception
     */
    public static void updatePeople(int id, String name, String sex, String birthDay) throws ParseException {
        Date date = simpleDate.parse(birthDay);
        if (sex.equals("м")) {
            allPeople.set(id, Person.createMale(name, date));
        } else
            allPeople.set(id, Person.createFemale(name, date));

//        Person person = null;
//        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(args[3]);
//
//        person = allPeople.get(Integer.parseInt(args[1]));
//        person.setName(args[2]);
//        person.setSex(Sex.valueOf(args[3]));
//        person.setBirthDate(date);
//
//        allPeople.set(Integer.parseInt(args[1]), person);

    }

    /**
     * argument -d id
     *
     * @param id id a person
     */
    public static void removePeople(int id) {
        Person person = allPeople.get(id);
        person.setName(null);
        person.setSex(null);
        person.setBirthDate(null);
    }

}
