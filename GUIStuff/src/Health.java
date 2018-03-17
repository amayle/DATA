import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Health {
    BorderPane bpane;
    Button eR;
    Button healthCare;
    Button back;

    public Health(Stage primaryStage) {
        bpane = new BorderPane();
        bpane.setStyle("-fx-background-color: #ffffff;");
        HBox top2 = new HBox();
        top2.setStyle("-fx-background-color: #2e86c1;");
        VBox left2 = new VBox();
        left2.setStyle("-fx-background-color: #2e86c1;");
        VBox right2 = new VBox();
        right2.setStyle("-fx-background-color: #ffffff;");
        Label heading2 = new Label("Health Services");
        eR = new Button("Emergency Services");
        eR.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        eR.setMinSize(200, 50);
        healthCare = new Button("Affordable Health Care");
        healthCare.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");

        healthCare.setMinSize(200, 50);
        back = new Button("Go Back");
        back.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        back.setMinSize(200, 50);


        top2.getChildren().addAll(heading2);
        heading2.setStyle("-fx-background-color: #2e86c1;");
        heading2.setFont(Font.font("Verdana", FontWeight.BOLD, 50));

        left2.getChildren().addAll(eR, healthCare, back);
        top2.setAlignment(Pos.CENTER);
        left2.setAlignment(Pos.TOP_CENTER);
        right2.setAlignment(Pos.TOP_CENTER);


        bpane.setTop(top2);
        bpane.setLeft(left2);
        bpane.setRight(right2);

        eR.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ER GUI = new ER(primaryStage);
                Scene scene2 = new Scene(GUI.getBpane(), 800, 700);
                primaryStage.setScene(scene2);
                primaryStage.show();
            }
        });
        healthCare.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                HealthCare GUI = new HealthCare(primaryStage);
                Scene scene2 = new Scene(GUI.getBpane(), 800, 700);
                primaryStage.setScene(scene2);
                primaryStage.show();
            }
        });
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                GetHelp GUI = new GetHelp(primaryStage);
                Scene scene2 = new Scene(GUI.getBpane(), 800, 700);
                primaryStage.setScene(scene2);
                primaryStage.show();
            }
        });


    }
    public BorderPane getBpane() {
        return bpane;
    }
}
