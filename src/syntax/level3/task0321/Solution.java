package syntax.level3.task0321;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Name: ");
        String name = bufer.readLine();
        System.out.print("Salary: ");
        String salary = bufer.readLine();
        System.out.print("Years: ");
        String years = bufer.readLine();

        System.out.println(name + " получает $" + salary + " через " + years + " лет.");

    }
}
