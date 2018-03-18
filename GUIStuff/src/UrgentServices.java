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



    public static String  storeHouseTitle() throws IOException {
        String url = dukeCity;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String  storeHouseBody() throws IOException {
        String url = dukeCity;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body;
    }

    public static String foodRunnerTitle() throws IOException {
        String url = nextCare;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String foodRunnerBody() throws IOException {
        String url = nextCare;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body;
    }

    public static String  foodProjectTitle() throws IOException {
        String url = aspen;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String  foodProjectBody() throws IOException {
        String url = aspen;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body;
    }

    public static String  unitedMethodistFoodPantryTitle() throws IOException {
        String url = railyard;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String  unitedMethodistFoodPantryBody() throws IOException {
        String url = railyard;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body;
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
                    return storeHouseTitle();
                case 2:
                    return foodRunnerTitle();
                case 3:
                    return foodProjectTitle();
                case 4:
                    return unitedMethodistFoodPantryTitle();
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
                    return storeHouseBody();
                case 2:
                    return foodRunnerBody();
                case 3:
                    return foodProjectBody();
                case 4:
                    return unitedMethodistFoodPantryBody();
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