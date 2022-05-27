package syntax.level7.lection12.task0723;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0 ; i--) {
            System.out.println(i);
            Thread.sleep(100);
            if (i == 0)
                System.out.println("Booooooooooom!!!!!!!!!!!!!!!!!!!");
        }
    }
}
