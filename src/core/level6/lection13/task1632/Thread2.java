package core.level6.lection13.task1632;

public class Thread2 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}
