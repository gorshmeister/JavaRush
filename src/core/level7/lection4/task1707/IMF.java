package core.level7.lection4.task1707;

public class IMF {

    private static IMF imf;

    private IMF(){
    }

    public static IMF getFund() {
        synchronized (IMF.class) {
            if (imf == null) {
                imf = new IMF();
            }
        }

        return imf;
    }
}
