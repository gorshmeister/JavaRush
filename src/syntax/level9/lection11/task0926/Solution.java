package syntax.level9.lection11.task0926;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(0, new int[] {5,5,5,5,5});
        list.add(1, new int[] {2,2});
        list.add(2, new int[] {4,4,4,4});
        list.add(3, new int[] {7,7,7,7,7,7,7});
        list.add(4, new int[] {});
        return list;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
