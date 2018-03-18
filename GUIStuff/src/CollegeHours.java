import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class CollegeHours {


    private static final String CNMURL = "https://www.cnm.edu/depts/student-services/hours";


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
        return body;
    }



    public static String enumTitle(int i){
        try {
            switch (i) {
                case 1:
                    return CNMTitle();

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
                    return CNMBody();

            }
        }
        catch(IOException e){
            System.out.println("BROKEN LINK!!");
            System.exit(1);
        }
        return "HOW DID YOU GET HERE!!!";

    }

}