package core.level5.lection2.task1502;

public class Solution {
    public static void main(String[] args) {
        BigAnimal big = new Dragon();
        System.out.println(big.getSize());

        SmallAnimal small = new Goose();
        System.out.println(small.getSize());

    }

    public static class BigAnimal {
        protected String getSize() {
            return "Как динозавр";
        }
    }

    public static class SmallAnimal {
        protected String getSize() {
            return "Как кошка";
        }
    }

    public static class Goose extends SmallAnimal {

        @Override
        public String getSize() {
            return "Гусь маленький, " + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal {
        @Override
        public String getSize() {
            return "Дракон большой, " +  super.getSize();
        }
    }
}
