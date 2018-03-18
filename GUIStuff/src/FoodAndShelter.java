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

public class FoodAndShelter {
    Button foodBank;
    Button homeless;
    Button clothing;
    Button housingAssist;
    Button back;
    BorderPane bpane;
    public FoodAndShelter(Stage primaryStage) {
        bpane = new BorderPane();
        bpane.setStyle("-fx-background-color: #ffffff;");
        HBox top2 = new HBox();
        top2.setStyle("-fx-background-color: #2e86c1;");
        VBox left2 = new VBox();
        left2.setStyle("-fx-background-color: #2e86c1;");
        VBox right2 = new VBox();
        right2.setStyle("-fx-background-color: #ffffff;");
        Label heading2 = new Label("Food and Shelter");
        foodBank = new Button("Food banks");
        foodBank.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        foodBank.setMinSize(150, 50);
        homeless = new Button("Homeless Shelters");
        homeless.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        homeless.setMinSize(150, 50);
        clothing = new Button("Clothing banks");
        clothing.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        clothing.setMinSize(150, 50);
        housingAssist = new Button("Housing Assistance");
        housingAssist.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        housingAssist.setMinSize(150, 50);
        back = new Button("Go Back");
        back.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        back.setMinSize(150, 50);

        Label intro = new Label("\n\n\nThe Sections listed to the left will take you to different options for food and shelter." +
                "\nYou can find food banks, homeless shelters, clothing banks and housing assistance.");
        intro.setAlignment(Pos.CENTER_LEFT);
        top2.getChildren().addAll(heading2);
        heading2.setStyle("-fx-background-color: #2e86c1;");
        heading2.setFont(Font.font("Verdana", FontWeight.BOLD, 50));
        right2.getChildren().add(intro);
        left2.getChildren().addAll(foodBank, homeless, clothing, housingAssist, back);
        top2.setAlignment(Pos.CENTER);
        left2.setAlignment(Pos.TOP_CENTER);
        right2.setAlignment(Pos.TOP_CENTER);


        bpane.setTop(top2);
        bpane.setLeft(left2);
        bpane.setRight(right2);


        foodBank.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                FoodBank GUI = new FoodBank(primaryStage);
                Scene scene2 = new Scene(GUI.getBpane(),800,700);
                primaryStage.setScene(scene2);
                primaryStage.show();

            }
        });

        homeless.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Homeless GUI = new Homeless(primaryStage);
                Scene scene2 = new Scene(GUI.getBpane(), 800, 700);
                primaryStage.setScene(scene2);
                primaryStage.show();

            }
        });

        clothing.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Clothing GUI = new Clothing(primaryStage);
                Scene scene2 = new Scene(GUI.getBpane(), 800, 700);
                primaryStage.setScene(scene2);
                primaryStage.show();
            }
        });
        housingAssist.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                HousingAssist GUI = new HousingAssist(primaryStage);
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
