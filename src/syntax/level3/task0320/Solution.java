package syntax.level3.task0320;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Name:");
        String name = reader.readLine();
        System.out.print("Years:");
        String sAge = reader.readLine();
//        int sAge = Integer.parseInt(sAge);

        System.out.println(name + " захватит мир через " + sAge + " лет. Му - ха - ха!");
    }
}
