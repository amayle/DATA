import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class LibraryHours {


    private static final String steelBridgeUrl = "https://abqlibrary.org/hours-locations";


    public static String  steelBridgeTitle() throws IOException {
        String url = steelBridgeUrl;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }

    public static String  steelBridgeBody() throws IOException {
        String url = steelBridgeUrl;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body;
    }



    public static String enumTitle(int i){
        try {
            switch (i) {
                case 1:
                    return steelBridgeTitle();

//                case 5:
//                    return crossroadsForWomenTitle();
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
                    return steelBridgeBody();

//                    return crossroadsForWomenBody();
            }
        }
        catch(IOException e){
            System.out.println("BROKEN LINK!!");
            System.exit(1);
        }
        return "HOW DID YOU GET HERE!!!";

    }

}