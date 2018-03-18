import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HealthSources {


    private static final String medClin1 = "http://lcdfnm.org/chaparral-medical/";
    private static final String medClin2 = "http://lcdfnm.org/rio-grande-preparatory-school-based-clinic/";
    private static final String medClin3 = "http://www.pmsnm.org/locations/torreon-health-clinic";
    private static final String medClin4 = "http://stdtestingtreatment.com/planned-parenthood-of-new-mexico-inc-nob-hill-health-center-at-3625-central-ave-ne-albuquerque-nm-87108/";
    private static final String medClin5 = "https://www.plannedparenthood.org/health-center/new-mexico/albuquerque/87112/northeast-heights-health-center-2803-90210";


    public static String  medClin1Title() throws IOException {
        String url = medClin1;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }

    public static String  medClin1Body() throws IOException {
        String url = medClin1;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body.substring(345, 1476);
    }


    public static String medClin2Title() throws IOException {
        String url = medClin2;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String medClin2Body() throws IOException {
        String url = medClin2;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body.substring(759, 1572);
    }

    public static String medClin3Title() throws IOException {
        String url = medClin3;
        Document document = Jsoup.connect(url).get();
        String title = document.title();

        return title;
    }
    public static String medClin3Body() throws IOException {
        String url = medClin3;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body.substring(735, 1635);
    }

    public static String medClin4Title() throws IOException {
        String url = medClin4;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String medClin4Body() throws IOException {
        String url = medClin4;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body.substring(715, 1590);
    }

    public static String medClin5Title() throws IOException {
        String url = medClin5;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String medClin5Body() throws IOException {
        String url = medClin5;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        body.substring(30);
        return body.substring(730, 1380);
    }

    public static String enumTitle(int i){
        try {
            switch (i) {
                case 1:
                    return medClin1Title();
                case 2:
                    return medClin2Title();
                case 3:
                    return medClin3Title();
                case 4:
                    return medClin4Title();
                case 5:
                    return medClin5Title();
            }
        }
        catch(IOException e){
            System.out.println("BROKEN LINK FOR TITLES!!");
            System.exit(1);
        }
        return "HOW DID YOU GET HERE!!!";

    }

    public static String enumBody(int i){
        try {
            switch (i) {
                case 1:
                    return medClin1Body();
                case 2:
                    return medClin2Body();
                case 3:
                    return medClin3Body();
                case 4:
                    return medClin4Body();
                case 5:
                    return medClin5Body();
            }
        }
        catch(IOException e){
            System.out.println("BROKEN LINK FOR TITLES!!");
            System.exit(1);
        }
        return "HOW DID YOU GET HERE!!!";

    }
}