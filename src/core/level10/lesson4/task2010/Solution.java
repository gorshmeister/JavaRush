package core.level10.lesson4.task2010;

/*
Как сериализовать что-то свое?
*/

import java.io.Serializable;

public class Solution {
    public static class Object implements Serializable {
        public String string1;
        public String string2;
    }

    public static int stringCount;

    public static class String implements Serializable {
        private final int number;

        public String() {
            number = ++stringCount;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }

    public static void main(java.lang.String[] args) {
        Object object = new Object();
        object.string1 = new String();
        object.string2 = new String();
        object.string1.print();
        object.string2.print();
    }
}
