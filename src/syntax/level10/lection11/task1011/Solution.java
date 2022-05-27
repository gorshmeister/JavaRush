package syntax.level10.lection11.task1011;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        String text = "Я не хочу изучать Java, я хочу большую зарплату!";
        char[] chars = text.toCharArray();

        for (int i = 0; i < 40; i++) {
            System.out.println(text.substring(i));
        }
/*

        for (int i = 0; i < 40; i++) {
            for (int j = i; j < text.length(); j++) {
                System.out.print(chars[j]);
            }
            Thread.sleep(500);

            System.out.println();
        }
*/
    }
}
