package syntax.level9.lection8.task0914;

public class Solution {
    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception3 e) {
            System.err.println("PIZDA PROGE x1");
        } catch (Exception2 e) {
            System.err.println("PIZDA PROGE x2");
        } catch (Exception1 e) {
            System.err.println("PIZDA PROGE x3");
        }

    }

    public static void method1() throws Exception1 {
        int i = (int) (Math.random() * 3);
        if (i == 0) {
            throw new Exception1();
        } else if (i == 1) {
            throw new Exception2();
        } else if (i == 2) {
            throw new Exception3();
        }
    }
}

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}
