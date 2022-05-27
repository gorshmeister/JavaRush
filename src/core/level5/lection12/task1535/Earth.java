package core.level5.lection12.task1535;

public class Earth implements Planet {
    private static volatile Earth instance;

    public static Earth getInstance() {
        if (instance == null) {
            synchronized (Earth.class) {
                instance = new Earth();
            }
        }

        return instance;
    }
}
