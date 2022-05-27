package core.level4.lection6.task1408;

/*
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory implements Country {

        static Hen getHen(String country) {
            switch (country) {
                case RUSSIA -> {
                    return new RussianHen();
                }
                case BELARUS -> {
                    return new BelarusianHen();
                }
                case MOLDOVA -> {
                    return new MoldovanHen();
                }
                case UKRAINE -> {
                    return new UkrainianHen();
                }
                default -> throw new IllegalStateException("Unexpected value: " + country);
            }
        }
    }
}