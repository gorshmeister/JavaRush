package core.level9.lection11.task1916;

/*
Отслеживаем изменения
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        String file1;
        String file2;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = reader.readLine();
            file2 = reader.readLine();
        }

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file1));
             BufferedReader fileReader2 = new BufferedReader(new FileReader(file2))) {
            while (fileReader.ready()) {
                list1.add(fileReader.readLine());
            }
            while (fileReader2.ready()) {
                list2.add(fileReader2.readLine());
            }
        }

        while (list1.size() > 0 && list2.size() > 0) {
            if (list1.get(0).equals(list2.get(0))) {

                lines.add(new LineItem(Type.SAME, list1.get(0)));
                list1.remove(0);
                list2.remove(0);

            } else if (list1.get(1).equals(list2.get(0))) {

                lines.add(new LineItem(Type.REMOVED, list1.get(0)));
                list1.remove(0);

            } else if (list1.get(0).equals(list2.get(1))) {

                lines.add(new LineItem(Type.ADDED, list2.get(0)));
                list2.remove(0);
            }
        }
        if (list1.size() > 0) {
            lines.add(new LineItem(Type.REMOVED, list1.get(list1.size() - 1)));
        } else if (list2.size() > 0) {
            lines.add(new LineItem(Type.ADDED, list2.get(list2.size() - 1)));
        }

        for (LineItem lineItem : lines) {
            System.out.println(lineItem.type + "\t" + lineItem.line);
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
