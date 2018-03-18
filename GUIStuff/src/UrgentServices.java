import java.io.IOException;
import javafx.scene.text.Text;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class UrgentServices {


    private static final String dukeCity = "https://www.dukecityurgentcare.com/";
    private static final String nextCare = "https://nextcare.com/contact-us/";
    private static final String aspen = "https://aspenmedicalcenter.com/";
    private static final String railyard = "https://railyardurgentcare.com/";
    private static final String concentra = "https://www.concentra.com/urgent-care-centers/new-mexico/albuquerque/concentra-menaul" +
            "-urgent-care/#NearbyLocations_g=35.1103441|-106.610027&NearbyLocations_o=DistanceMi,Ascending";



    public static String  dukeCityTitle() throws IOException {
        String url = dukeCity;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String  dukeCityBody() throws IOException {
        String url = dukeCity;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body.substring(3663, 4733);
    }

    public static String nextCareTitle() throws IOException {
        String url = nextCare;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String nextCareBody() throws IOException {
        String url = nextCare;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body.substring(888, 1375);
    }

    public static String  aspenTitle() throws IOException {
        String url = aspen;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String  aspenBody() throws IOException {
        String url = aspen;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body;
    }

    public static String  railYardTitle() throws IOException {
        String url = railyard;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String  railYardBody() throws IOException {
        String url = railyard;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body.substring(0, 111);
    }

    public static String  concentraTitle() throws IOException {
        String url = concentra;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String  concentraBody() throws IOException {
        String url = concentra;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body;
    }
    public static String enumTitle(int i){
        try {
            switch (i) {
                case 1:
                    return dukeCityTitle();
                case 2:
                    return nextCareTitle();
                case 3:
                    return aspenTitle();
                case 4:
                    return railYardTitle();
                case 5:
                    return concentraTitle();
//                case 6:
//                    return rioGrandeFoodPantryTitle();
//                case 7:
//                    return goodShepardTitle();
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
                    return dukeCityBody();
                case 2:
                    return nextCareBody();
                case 3:
                    return aspenBody();
                case 4:
                    return railYardBody();
                case 5:
                    return concentraBody();
//                case 6:
//                    return rioGrandeFoodPantryBody();
//                case 7:
//                    return goodShepardBody();
            }
        }
        catch(IOException e){
            System.out.println("BROKEN LINK FOR TITLES!!");
            System.exit(1);
        }
        return "HOW DID YOU GET HERE!!!";

    }

}

