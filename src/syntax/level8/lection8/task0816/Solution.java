package syntax.level8.lection8.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов9", dateFormat.parse("JUNE 1 2012"));
        map.put("Смирнов8", dateFormat.parse("JULY 1 2012"));
        map.put("Смирнов7", dateFormat.parse("AUGUST 1 2012"));
        map.put("Смирнов6", dateFormat.parse("FEBRUARY 1 2012"));
        map.put("Смирнов5", dateFormat.parse("NOVEMBER 1 2012"));
        map.put("Смирнов4", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Смирнов3", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Смирнов2", dateFormat.parse("JUNE 1 2012"));
        map.put("Смирнов1", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            int pizdaebanaya = pair.getValue().getMonth() + 1;

            if (pizdaebanaya == 6 || pizdaebanaya == 7 || pizdaebanaya == 8)
                iterator.remove();
        }
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
        System.out.println(map);
    }
}
