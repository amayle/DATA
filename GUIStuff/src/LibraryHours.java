import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class LibraryHours {

    private static final String libraryURL = "https://abqlibrary.org/hours-locations";


    public static String  LibraryTitle() throws IOException {
        String url = libraryURL;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }

    public static String  LibraryBody() throws IOException {
        String url = libraryURL;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body;
    }



    public static String enumTitle(int i){
        try {
            switch (i) {
                case 1:
                    return LibraryTitle();
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
                    return LibraryBody();

            }
        }
        catch(IOException e){
            System.out.println("BROKEN LINK!!");
            System.exit(1);
        }
        return "HOW DID YOU GET HERE!!!";

    }

}