package syntax.level7.lection9;

public class LExa {
    public static void main(String[] args) {
        String i1 = "11";
        String[][] twoDimArray = new String[7][];

        twoDimArray[0] = new String[]{i1, " ", " ", " ", i1, i1, i1, " ", i1, " ", i1, " ", " ", i1, " ", " ", " ", i1, i1, " ", " ", i1, " ", i1, i1, " ", " ", " ", i1, " ", " ", i1, i1, " "};
        twoDimArray[1] = new String[]{i1, " ", " ", " ", i1, " ", " ", " ", i1, " ", i1, " ", i1, " ", i1, " ", " ", i1, " ", i1, " ", i1, " ", i1, " ", i1, " ", i1, " ", i1, " ", i1, " ", i1};
        twoDimArray[2] = new String[]{i1, " ", " ", " ", i1, " ", " ", " ", i1, " ", i1, " ", i1, " ", i1, " ", " ", i1, " ", i1, " ", i1, " ", i1, " ", i1, " ", i1, " ", i1, " ", i1, " ", i1};
        twoDimArray[3] = new String[]{i1, " ", " ", " ", i1, i1, i1, " ", i1, i1, i1, " ", i1, " ", i1, " ", " ", i1, " ", i1, " ", i1, " ", i1, " ", i1, " ", i1, " ", i1, " ", i1, " ", i1};
        twoDimArray[4] = new String[]{i1, " ", " ", " ", i1, i1, i1, " ", i1, i1, i1, " ", i1, i1, i1, " ", " ", i1, i1, " ", " ", i1, " ", i1, " ", i1, " ", i1, " ", i1, " ", i1, i1, " "};
        twoDimArray[5] = new String[]{i1, i1, i1, " ", i1, " ", " ", " ", i1, " ", i1, " ", i1, " ", i1, " ", " ", i1, " ", " ", " ", i1, " ", i1, " ", i1, " ", i1, " ", i1, " ", i1, " ", i1};
        twoDimArray[6] = new String[]{i1, i1, i1, " ", i1, i1, i1, " ", i1, " ", i1," ", i1, " ", i1, " ", " ", i1, " ", " ", " ", i1, " ", i1, i1, " ", " ", " ", i1, " ", " ", i1, " ", i1};

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[0].length; j++) {
                System.out.print(" " + twoDimArray[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
