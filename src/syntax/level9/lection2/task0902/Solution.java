package syntax.level9.lection2.task0902;

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        method3();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElement) {
            System.out.println(element.getMethodName());
        }
//        System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName());
//        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
//        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
//        System.out.println(Thread.currentThread().getStackTrace()[3].getMethodName());
//        System.out.println(Thread.currentThread().getStackTrace()[4].getMethodName());
//        System.out.println(Thread.currentThread().getStackTrace()[5].getMethodName());
//        System.out.println(Thread.currentThread().getStackTrace()[6].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }


}
