import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class FoodAndShelter {
    public BorderPane FoodAndShelter() {
        BorderPane bpane2 = new BorderPane();
        bpane2.setStyle("-fx-background-color: #ffffff;");
        HBox top2 = new HBox();
        top2.setStyle("-fx-background-color: #2e86c1;");
        VBox left2 = new VBox();
        left2.setStyle("-fx-background-color: #2e86c1;");
        VBox right2 = new VBox();
        right2.setStyle("-fx-background-color: #ffffff;");
        Label heading2 = new Label("Food and Shelter");
        Button foodBank = new Button("Food banks");
        foodBank.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        foodBank.setMinSize(150, 50);
        Button homeless = new Button("Homeless Shelters");
        homeless.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        homeless.setMinSize(150, 50);
        Button clothing = new Button("Clothing banks");
        clothing.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        clothing.setMinSize(150, 50);
        Button housingAssist = new Button("Housing Assistance");
        housingAssist.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        housingAssist.setMinSize(150, 50);
        Button back = new Button("Go Back");
        back.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        back.setMinSize(150, 50);

        top2.getChildren().addAll(heading2);
        heading2.setStyle("-fx-background-color: #2e86c1;");
        heading2.setFont(Font.font("Verdana", FontWeight.BOLD, 50));

        left2.getChildren().addAll(foodBank, homeless, clothing, housingAssist, back);
        top2.setAlignment(Pos.CENTER);
        left2.setAlignment(Pos.TOP_CENTER);
        right2.setAlignment(Pos.TOP_CENTER);


        bpane2.setTop(top2);
        bpane2.setLeft(left2);
        bpane2.setRight(right2);

        return bpane2;

    }
}
