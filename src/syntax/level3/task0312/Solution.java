package syntax.level3.task0312;

public class Solution {
    public static int convertToSecond(int hour) {
        return hour * 60;
    }
    public static void main(String[] args) {
        System.out.println(convertToSecond(3));
        System.out.println(convertToSecond(5));
        System.out.println(convertToSecond(7));
    }
}
