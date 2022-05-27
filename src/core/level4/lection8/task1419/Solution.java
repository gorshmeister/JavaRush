package core.level4.lection8.task1419;

/*
Нашествие исключений
*/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        exceptions.add(new NullPointerException());
        exceptions.add(new FindException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new IOException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new NoSuchFieldException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new ClassCastException());
        exceptions.add(new DataFormatException());
        exceptions.add(new IllegalArgumentException());

    }
}

