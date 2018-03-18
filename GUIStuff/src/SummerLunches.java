import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class SummerLunches {


    private static final String summerLunch = "http://www.cabq.gov/family/income-eligible-services/health-social-services/youth-food-service-program";


    public static String summerTitle() throws IOException {
        String url = summerLunch;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }

    public static String summerBody() throws IOException {
        String url = summerLunch;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body;
    }


    public static String enumTitle(int i) {
        try {
            switch (i) {
                case 1:
                    return summerTitle();
            }
        } catch (IOException e) {
            System.out.println("BROKEN LINK FOR TITLES!!");
            System.exit(1);
        }
        return "HOW DID YOU GET HERE!!!";

    }

    public static String enumBody(int i) {
        try {
            switch (i) {
                case 1:
                    return summerBody();

            }
        } catch (IOException e) {
            System.out.println("BROKEN LINK!!");
            System.exit(1);
        }
        return "HOW DID YOU GET HERE!!!";

    }


}