package core.level9.lection11.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
public class Solution {
    public static final String BRAT = "(pidor)";

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://vk.com/id67946267/")
                .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.74 Safari/537.36")
                .get();
        Elements listNews = doc.select("#page_info_wrap");
        String text = "";
        for (Element element : listNews) {
            text = element.text();
        }
        System.out.println(text.replace("Алексей Сулин", "Алексей Сулин" + BRAT));

    }
}
