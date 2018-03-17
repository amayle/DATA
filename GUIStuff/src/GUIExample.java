import javafx.application.Application;
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

public class GUIExample extends Application {

    public static void main(String []args){
        launch(args);
    }
    public void start(Stage primaryStage)  {
        BorderPane bpane = new BorderPane();
        bpane.setStyle("-fx-background-color: #ffffff;");
        HBox top = new HBox();
        top.setStyle("-fx-background-color: #2e86c1;");
        VBox left = new VBox();
        left.setStyle("-fx-background-color: #2e86c1;");
        VBox right = new VBox();
        right.setStyle("-fx-background-color: #ffffff;");
        Button foodShelter = new Button("Food & Shelter");
        foodShelter.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        foodShelter.setMinSize(150, 50);
        Button health = new Button("Health Services");
        health.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        health.setMinSize(150, 50);
        Button education = new Button("Education");
        education.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        education.setMinSize(150, 50);
        Button workForce = new Button("Workforce");
        workForce.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        workForce.setMinSize(150, 50);
        Button childCare = new Button("Child Care");
        childCare.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        childCare.setMinSize(150, 50);
        Button community = new Button("Community");
        community.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        community.setMinSize(150, 50);


        Label heading = new Label("Here to help");
        heading.setStyle("-fx-background-color: #2e86c1;");
        heading.setFont(Font.font("Verdana", FontWeight.BOLD, 50));
        Label intro = new Label("\n\n\n\nOn your left you will see a list of options to select based on what category your need falls into.\n" +
                "\nUnder food and shelter you will find resources for homelessness, food banks,\n\tclothing banks and other assistance programs related to food and housing. \n" +
                "\nUnder Health services you will find links to affordable or emergency health care. \n" +
                "\nUnder education you will find resources for education for your children and yourself to use. \n" +
                "\nUnder workforce you will find resources related to finding a job such as work force solutions\n\tand the department of vocational rehabilitation. \n" +
                "\nUnder Childcare you will be able to find more affordable child care options for you to use. \n" +
                "\nIf none of the categories seem to fit your situation, click on the community option to be \n\tguided to our community page where you can ask others for help with whatever your needs are. \n");

        top.getChildren().add(heading);

        left.getChildren().addAll(foodShelter, health, education, workForce, childCare, community);
        right.getChildren().add(intro);
        top.setAlignment(Pos.CENTER);
        left.setAlignment(Pos.TOP_CENTER);
        right.setAlignment(Pos.TOP_CENTER);

        bpane.setTop(top);
        bpane.setLeft(left);
        bpane.setRight(right);
        Scene scene1 = new Scene(bpane, 800, 700);
        primaryStage.setScene(scene1);
        primaryStage.show();

    }

}
