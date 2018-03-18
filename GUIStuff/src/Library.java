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

public class Library {
    Button back;
    BorderPane bpane;
    ArrayList<Button> buttons;
    public Library(Stage primaryStage) {
        bpane = new BorderPane();
        bpane.setStyle("-fx-background-color: #ffffff;");
        HBox top2 = new HBox();
        top2.setStyle("-fx-background-color: #2e86c1;");
        VBox left2 = new VBox();
        left2.setStyle("-fx-background-color: #2e86c1;");
        VBox right2 = new VBox();
        right2.setStyle("-fx-background-color: #ffffff;");
        Label heading2 = new Label("Library Resources");

        back = new Button("Go Back");
        back.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        back.setMinSize(150, 50);

        top2.getChildren().addAll(heading2);
        heading2.setStyle("-fx-background-color: #2e86c1;");
        heading2.setFont(Font.font("Verdana", FontWeight.BOLD, 50));

        //left2.getChildren().addAll( back);
        top2.setAlignment(Pos.CENTER);
        left2.setAlignment(Pos.TOP_CENTER);
        right2.setAlignment(Pos.TOP_CENTER);
        buttons = new ArrayList<Button>();
            buttons.add(new Button("" + LibraryHours.enumTitle(1)));
            buttons.get(0).setStyle("-fx-background-color: #A3D5F7; " +
                    "-fx-border-color: #000000; -fx-border-width: 1px;");
            buttons.get(0).setMaxSize(200, 50);
            buttons.get(0).setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e) {
                    right2.getChildren().clear();
                    ScrollPane container = new ScrollPane();
                    Text info = new Text(LibraryHours.enumBody(1));
                    Text title = new Text(LibraryHours.enumTitle(1));
                    info.setWrappingWidth(500);
                    container.setContent(info);
                    container.setMinWidth(550);
                    right2.getChildren().addAll(container);
                    top2.getChildren().clear();
                    top2.getChildren().addAll(title);
                }

            });
        left2.getChildren().addAll(buttons.get(0),back);

        bpane.setTop(top2);
        bpane.setLeft(left2);
        bpane.setRight(right2);
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Education GUI = new Education(primaryStage);
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
