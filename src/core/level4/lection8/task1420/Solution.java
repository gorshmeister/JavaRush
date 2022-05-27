package core.level4.lection8.task1420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> listX = new ArrayList<>();
        ArrayList<Integer> listY = new ArrayList<>();

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        iterationNum(x, listX);

        iterationNum(y, listY);

        marker(listX, listY);

    }

    public static void iterationNum(int x, ArrayList<Integer> list) {
        if (x < 0)
            x = x * (-1);

        while (x != 1) {
            int y = 2;
            while (!(x % y == 0)) {
                y++;
            }
            x = x / y;
            list.add(y);
        }
    }

    public static void marker(ArrayList<Integer> listX, ArrayList<Integer> listY) {
        for (int i = 0; i < listX.size(); i++) {
            for (int j = 0; j < listY.size(); j++) {
                if (listX.get(i) == listY.get(j)) {
                    listX.set(i, listX.get(i) * (-1));
                    listY.set(j, listY.get(j) * (-1));
                    break;

                }

            }
        }

        int nod = 1;
        for (int multiply : listX) {
            if (multiply < 0) {
                nod = nod * multiply;
            }
        }
        if (nod < 0) {
            System.out.println(nod * -1);
        } else
            System.out.println(nod);
    }
}
