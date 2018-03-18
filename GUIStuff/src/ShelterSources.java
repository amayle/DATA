import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ShelterSources {


    private static final String steelBridgeUrl = "https://mysteelbridge.org/get-help/";
    private static final String healthcareForHomelessUrl = "https://www.yellowpages.com/albuquerque-nm/mip/health-care-for-the-homeless-456676796";
    private static final String rockAbqUrl = "http://therockabq.com/about-us/";
    private static final String stMartin = "https://www.hopeworksnm.org/contact/";
    private static final String crossroadsUrl = "https://crossroadsowensboro.org/emergency-womens-shelter/";

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

        body = body.substring(606);
        String substr1 = body.substring(0, 604);
        String substr2 = body.substring(640);
        body = substr1 + "\n\n" + substr2;
        substr1 = body.substring(0, 907);
        substr2 = body.substring(918);
        body = substr1 + "\n\n" + substr2;
        substr1 = body.substring(0, 1197);
        substr2 = body.substring(1231);
        body = substr1 + "\n\n" + substr2;
        substr1 = body.substring(0, 1412);
        substr2 = body.substring(1412);
        body = substr1 + "\n\n" + substr2;
        substr1 = body.substring(0, 2153);
        substr2 = body.substring(2307);
        body = substr1 + "\n\n" + substr2;
        substr1 = body.substring(0, 2681);
        substr2 = body.substring(2681);
        body = substr1 + "\n\n" + substr2;
        substr1 = body.substring(0, 3030);
        substr2 = body.substring(3030);
        body = substr1 + "\n\n" + substr2;
        substr1 = body.substring(0, 3941);
        substr2 = body.substring(3941);
        body = substr1 + "\n\n" + substr2;
        substr1 = body.substring(0, 4198);
        substr2 = body.substring(4198);
        body = substr1 + "\n\n" + substr2;
        body = body.substring(0, 4291);
        return body;

    }


    public static String healthcareForTheHomelessTitle() throws IOException {
        String url = healthcareForHomelessUrl;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String healthcareForTheHomelessBody() throws IOException {
        String url = healthcareForHomelessUrl;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body.substring(821,1563);
    }

    public static String rockAbqTitle() throws IOException {
        String url = rockAbqUrl;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String rockAbqBody() throws IOException {
        String url = rockAbqUrl;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        System.out.println(body);
        return body;
    }

    public static String stMartinHospitalityCenterTitle() throws IOException {
        String url = stMartin;
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        return title;
    }
    public static String stMartinHospitalityCenterBody() throws IOException {
        String url = stMartin;
        Document document = Jsoup.connect(url).get();
        String body = document.body().text();
        return body;
    }

//    public static String crossroadsForWomenTitle() throws IOException {
//        String url = crossroadsUrl;
//        Document document = Jsoup.connect(url).get();
//        String title = document.title();
//        return title;
//    }
//    public static String crossroadsForWomenBody() throws IOException {
//        String url = crossroadsUrl;
//        Document document = Jsoup.connect(url).get();
//        String body = document.body().text();
//        body.substring(30);
//        return body.substring(252, 700);
//    }

    public static String enumTitle(int i){
        try {
            switch (i) {
                case 1:
                    return steelBridgeTitle();
                case 2:
                    return healthcareForTheHomelessTitle();
                case 3:
                    return rockAbqTitle();
                case 4:
                    return stMartinHospitalityCenterTitle();
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
                case 2:
                    return healthcareForTheHomelessBody();
                case 3:
                    return rockAbqBody();
                case 4:
                    return stMartinHospitalityCenterBody();
//                case 5:
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