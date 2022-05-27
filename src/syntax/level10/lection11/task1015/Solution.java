package syntax.level10.lection11.task1015;

import java.util.ArrayList;
import java.util.Arrays;

/*
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] list = new ArrayList[3];

        list[0] = new ArrayList<String>(Arrays.asList("mas1", "stroka1"));
        list[1] = new ArrayList<String>(Arrays.asList("mas2", "stroka2"));
        list[2] = new ArrayList<String>(Arrays.asList("mas3", "stroka3"));

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
