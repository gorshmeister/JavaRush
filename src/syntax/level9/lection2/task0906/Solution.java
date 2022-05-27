package syntax.level9.lection2.task0906;

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        String s = "";
        s += Thread.currentThread().getStackTrace()[2].getClassName();
        s += ": ";
        s += Thread.currentThread().getStackTrace()[2].getMethodName();
        s += ": ";
        s += text;
        System.out.println(s);
    }
}
