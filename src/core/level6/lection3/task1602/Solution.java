package core.level6.lection3.task1602;

public class Solution {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }

    public static class TestThread extends Thread {
        static {
            System.out.println("it`s a static block inside TestThread");
        }
        @Override
        public void run() {
            System.out.println("it`s a run method");
        }
    }
}
