package core.level6.lection13.task1639;

public class Solution {
    public static volatile int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable{
        //Add your code here - добавь код тут

        @Override
        public void run() {
            try {
                while (true) {
                    if (number == 0) {
                        while (number != 5) {
                            number++;
                            System.out.println(toString());
                            if (number == 5) return;
                            Thread.sleep(500);
                        }
                    }
                }
            } catch (InterruptedException e) {
            }
        }

        @Override
        public String toString() {
            return Thread.currentThread().getName() + ":" + number;
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    number -= 1;
                    if (number == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + number;
        }
    }
}