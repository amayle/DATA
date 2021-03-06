import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class CollegeHours {


    private static final String CNMURL = "https://www.cnm.edu/depts/student-services/hours";
    private static final String FullStackURL = "https://deepdivecoding.com/fullstack/";

    public static String  CNMTitle() throws IOException {
        String url = CNMURL;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }

    public static String  CNMBody() throws IOException {
        String url = CNMURL;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();

        return body.substring(2404, 5257);
    }

    public static String  FullStackTitle() throws IOException {
        String url = FullStackURL;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }

    public static String  FullStackBody() throws IOException {
        String url = FullStackURL;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        System.out.println(body);
        return body.substring(123, 271) +body.substring(341, 1198);
    }


    public static String enumTitle(int i){
        try {
            switch (i) {
                case 1:
                    return CNMTitle();
                case 2:
                    return FullStackTitle();
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
                    return CNMBody();
                case 2:
                    return FullStackBody();

            }
        }
        catch(IOException e){
            System.out.println("BROKEN LINK!!");
            System.exit(1);
        }
        return "HOW DID YOU GET HERE!!!";

    }

}