package core.level5.lection12.task1535;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String s = reader.readLine();

            switch (s) {
                case ("earth") -> thePlanet = Earth.getInstance();
                case ("moon") -> thePlanet = Moon.getInstance();
                case ("sun") -> thePlanet = Sun.getInstance();
                default -> thePlanet = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
