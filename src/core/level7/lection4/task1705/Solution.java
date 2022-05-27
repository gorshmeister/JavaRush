package core.level7.lection4.task1705;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

    }

    public static class Garden {
        public final List<String> fruits = new ArrayList<>();
        public final List<String> vegetables = new ArrayList<>();

        public void addFruit(int index, String fruit) {
            synchronized (this) {
                fruits.add(index, fruit);
            }
        }

        public void removeFruit(int index) {
            synchronized (this) {
                fruits.remove(index);
            }
        }

        public synchronized void addVegetables(int index, String vegetable) {
            vegetables.add(index, vegetable);
        }

        public synchronized void removeVegetable(int index){
            vegetables.remove(index);
        }
    }


}
