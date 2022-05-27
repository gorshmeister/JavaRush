package core.level9.lection11.task1918;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }

        Document document = Jsoup.parse(fileName, "", Parser.xmlParser());
        Elements elements = document.select(args[0]);
        for (Element elem : elements) {
            System.out.println(elem);
        }

    }
}
