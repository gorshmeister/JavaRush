package core.level3.lection2.task1302;

public class Solution {
    public static void main(String[] args) {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }
        }

        @Override
        public boolean isAlcoholic() {
            return true;
        }
    }
}
