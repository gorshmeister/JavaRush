package core.level5.lection12.task1535;

public class Moon implements Planet {
    private static volatile Moon instance;

    public static Moon getInstance() {
        if (instance == null) {
            synchronized (Moon.class) {
                instance = new Moon();
            }
        }

        return instance;
    }
}
