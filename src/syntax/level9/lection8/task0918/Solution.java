package syntax.level9.lection8.task0918;

public class Solution {
    public static void main(String[] args) {

    }

    static class MyException extends RuntimeException {
    }

    static class MyException2 extends Exception {
    }

    static class MyException3 extends MyException2 {
    }

    static class MyException4 extends MyException {
    }

//2 checked 2 unchecked
}
