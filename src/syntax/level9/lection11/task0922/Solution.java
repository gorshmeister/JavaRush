package syntax.level9.lection11.task0922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = new SimpleDateFormat("yyyy-MM-d").parse(reader.readLine());
        SimpleDateFormat newdate = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        System.out.println(newdate.format(date).toUpperCase(Locale.ROOT));
    }
}
