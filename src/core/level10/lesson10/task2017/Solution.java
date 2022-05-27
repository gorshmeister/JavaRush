package core.level10.lesson10.task2017;

/*
Десериализация
*/

import java.io.ObjectInputStream;
import java.io.Serializable;

public class Solution implements Serializable {
    public A getOriginalObject(ObjectInputStream objectStream) {
        try {
            return (Solution.A) objectStream.readObject();
        } catch (Exception e) {
        }
        return null;
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        A a = solution.new A();
//        B b = solution.new B();
        System.out.println(a);

    }
}