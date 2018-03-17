import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ChildCare {
    public BorderPane ChildCare() {
        BorderPane bpane2 = new BorderPane();
        bpane2.setStyle("-fx-background-color: #ffffff;");
        HBox top2 = new HBox();
        top2.setStyle("-fx-background-color: #2e86c1;");
        VBox left2 = new VBox();
        left2.setStyle("-fx-background-color: #2e86c1;");
        VBox right2 = new VBox();
        right2.setStyle("-fx-background-color: #ffffff;");
        Label heading2 = new Label("Child Care");
        Button lunches = new Button("Summer Lunches");
        lunches.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        lunches.setMinSize(150, 50);
        Button day_care = new Button("Affordable day care");
        day_care.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");

        day_care.setMinSize(150, 50);
        Button back = new Button("Go Back");
        back.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        back.setMinSize(150, 50);

        top2.getChildren().addAll(heading2);
        heading2.setStyle("-fx-background-color: #2e86c1;");
        heading2.setFont(Font.font("Verdana", FontWeight.BOLD, 50));

        left2.getChildren().addAll(lunches, day_care, back);
        top2.setAlignment(Pos.CENTER);
        left2.setAlignment(Pos.TOP_CENTER);
        right2.setAlignment(Pos.TOP_CENTER);


        bpane2.setTop(top2);
        bpane2.setLeft(left2);
        bpane2.setRight(right2);

        return bpane2;

    }
}
