package core.level5.lection12.task1535;

public class Sun implements Planet {
    private static volatile Sun instance;

    public static Sun getInstance() {
        if (instance == null) {
            synchronized (Sun.class) {
                instance = new Sun();
            }
        }

        return instance;
    }
}
