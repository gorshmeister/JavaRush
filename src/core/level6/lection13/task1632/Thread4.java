package core.level6.lection13.task1632;

public class Thread4 extends Thread implements Message {
    @Override
    public void showWarming() {
        this.interrupt();
    }


    @Override
    public void run() {
        while (!isInterrupted()) {
        }
    }
}
