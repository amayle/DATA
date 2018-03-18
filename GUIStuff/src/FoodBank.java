import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class FoodBank {

    Button back;
    BorderPane bpane;
    ArrayList<Button> buttons;
    public FoodBank(Stage primaryStage) {
        bpane = new BorderPane();
        bpane.setStyle("-fx-background-color: #ffffff;");
        HBox top2 = new HBox();
        top2.setStyle("-fx-background-color: #2e86c1;");
        VBox left2 = new VBox();
        left2.setStyle("-fx-background-color: #2e86c1;");
        VBox right2 = new VBox();
        right2.setStyle("-fx-background-color: #ffffff;");
        Label heading2 = new Label("Food Banks");

        back = new Button("Go Back");
        back.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        back.setMinSize(150, 50);


        top2.getChildren().addAll(heading2);
        heading2.setStyle("-fx-background-color: #2e86c1;");
        heading2.setFont(Font.font("Verdana", FontWeight.BOLD, 50));

        left2.getChildren().addAll( back);
        top2.setAlignment(Pos.CENTER);
        left2.setAlignment(Pos.TOP_CENTER);
        right2.setAlignment(Pos.TOP_CENTER);
        buttons = new ArrayList<Button>();
        for (int i = 1; i <= 4; i++) {
            final int b = i;
            buttons.add(new Button("" + Foodsources.enumTitle(i)));
            buttons.get(i-1).setStyle("-fx-background-color: #A3D5F7; " +
                    "-fx-border-color: #000000; -fx-border-width: 1px;");
            buttons.get(i-1).setMaxSize(200, 50);
            buttons.get(i - 1).setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e) {
                    right2.getChildren().clear();
                    ScrollPane container = new ScrollPane();
                    Text info = new Text(Foodsources.enumBody(b));
                    Text title = new Text(Foodsources.enumTitle(b));
                    info.setWrappingWidth(550);
                    container.setContent(info);
                    right2.getChildren().addAll(container);
                    top2.getChildren().clear();
                    top2.getChildren().addAll(title);
                }

            });
            left2.getChildren().add(buttons.get(i-1));

        }

        bpane.setTop(top2);
        bpane.setLeft(left2);
        bpane.setRight(right2);
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FoodAndShelter GUI = new FoodAndShelter(primaryStage);
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