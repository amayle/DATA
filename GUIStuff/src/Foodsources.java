import java.io.IOException;
import javafx.scene.text.Text;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Foodsources {


    private static final String abqStoreHouseUrl = "https://www.thestorehouseabq.org/";
    private static final String roadRunnerUrl = "http://www.rrfb.org/?gclid=CjwKCAjw-bLVBRBMEiwAmKSB83FkyN2iYdg4AhqoUogbwe28xHJmgF8MGEjUuJBE6ofW2tL8Nkoq_BoCOqMQAvD_BwE";
    private static final String foodProject = "http://www.rgfp.org/";
    private static final String unitedFoodUrl = "http://feedindiana.org/food-pantries/first-united-methodist-church-food-pantry";
    private static final String comidaUrl = "http://www.fnch.org/services.aspx?cb9791bccdf34a75bd905ee4b0ad0993blogPostId=d39b26cf9e40424e8ccbf801b4d8d784";
    private static final String rioGrandeUrl = "https://www.foodpantries.org/li/rio_grande_food_project_87121";
    private static final String goodShepardUrl = "https://www.goodshepherdcenternm.org/services";



    public static String  storeHouseTitle() throws IOException {
        String url = abqStoreHouseUrl;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String  storeHouseBody() throws IOException {
        String url = abqStoreHouseUrl;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        System.out.println(body);
        return body.substring(98,857) + body.substring(991, 1228)+ body.substring(1875, 2346);

    }

    public static String foodRunnerTitle() throws IOException {
        String url = roadRunnerUrl;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String foodRunnerBody() throws IOException {
        String url = roadRunnerUrl;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();

        return body.substring(12153, 12432);
    }

    public static String  foodProjectTitle() throws IOException {
        String url = foodProject;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String  foodProjectBody() throws IOException {
        String url = foodProject;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body.substring(462,1097);
    }

//    public static String  unitedMethodistFoodPantryTitle() throws IOException {
//        String url = unitedFoodUrl;
//        Document document = Jsoup.connect(url).get();
//        String title = document.title();
//        return title;
//    }
//    public static String  unitedMethodistFoodPantryBody() throws IOException {
//        String url = unitedFoodUrl;
//        Document document = Jsoup.connect(url).get();
//        String body = document.body().text();
//        System.out.println(body);
//        return body;
//    }

//    public static String comidaFoodPantryTitle() throws IOException {
//        String url = comidaUrl;
//        Document document = Jsoup.connect(url).get();
//        String title = document.title();
//        return title;
//    }
//    public static String comidaFoodPantryBody() throws IOException {
//        String url = comidaUrl;
//        Document document = Jsoup.connect(url).get();
//        String body = document.body().text();
//        return body;
//    }

//    public static String rioGrandeFoodPantryTitle() throws IOException {
//        String url = rioGrandeUrl;
//        Document document = Jsoup.connect(url).get();
//        String title = document.title();
//        return title;
//    }
//    public static String rioGrandeFoodPantryBody() throws IOException {
//        String url = rioGrandeUrl;
//        Document document = Jsoup.connect(url).get();
//        String body = document.body().text();
//        return body;
//    }
//    public static String goodShepardTitle() throws IOException {
//        String url = goodShepardUrl;
//        Document document = Jsoup.connect(url).get();
//        String title = document.title();
//        return title;
//    }
//    public static String goodShepardBody() throws IOException {
//        String url = goodShepardUrl;
//        Document document = Jsoup.connect(url).get();
//        String body = document.body().text();
//        return body;
//    }
    public static String enumTitle(int i){
        try {
            switch (i) {
                case 1:
                    return storeHouseTitle();
                case 2:
                    return foodRunnerTitle();
                case 3:
                    return foodProjectTitle();
//                case 4:
//                    return unitedMethodistFoodPantryTitle();
//                case 5:
//                    return comidaFoodPantryTitle();
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
//                case 4:
//                    return unitedMethodistFoodPantryBody();
//                case 5:
//                    return comidaFoodPantryBody();
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