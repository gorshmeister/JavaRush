package core.level6.lection13.task1632;

public class Thread3 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Ура");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
