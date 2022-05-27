package syntax.level9.lection2.task0901;

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2() {
        method3();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3() {
        method4();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4() {
        method5();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElement)
            System.out.println(element.getMethodName());

        return Thread.currentThread().getStackTrace();
    }
}
