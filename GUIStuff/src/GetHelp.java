import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class GetHelp extends Application {
    Button foodShelter;
    Button health;
    Button education;
    Button workForce;
    Button childCare;
    Button community;
    BorderPane bpane;

    public static void main(String[] args) {
        launch(args);
    }

    public GetHelp()

    {
        bpane = new BorderPane();
        bpane.setStyle("-fx-background-color: #ffffff;");
        HBox top = new HBox();
        top.setStyle("-fx-background-color: #2e86c1;");
        VBox left = new VBox();
        left.setStyle("-fx-background-color: #2e86c1;");
        VBox right = new VBox();
        right.setStyle("-fx-background-color: #ffffff;");
        foodShelter = new Button("Food & Shelter");
        foodShelter.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        foodShelter.setMinSize(150, 50);
        health = new Button("Health Services");
        health.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        health.setMinSize(150, 50);
        education = new Button("Education");
        education.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        education.setMinSize(150, 50);
        workForce = new Button("Workforce");
        workForce.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        workForce.setMinSize(150, 50);
        childCare = new Button("Child Care");
        childCare.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        childCare.setMinSize(150, 50);
        community = new Button("Community");
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
    }

    public GetHelp(Stage primaryStage)

    {
        bpane = new BorderPane();
        bpane.setStyle("-fx-background-color: #ffffff;");
        HBox top = new HBox();
        top.setStyle("-fx-background-color: #2e86c1;");
        VBox left = new VBox();
        left.setStyle("-fx-background-color: #2e86c1;");
        VBox right = new VBox();
        right.setStyle("-fx-background-color: #ffffff;");
        foodShelter = new Button("Food & Shelter");
        foodShelter.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        foodShelter.setMinSize(150, 50);
        health = new Button("Health Services");
        health.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        health.setMinSize(150, 50);
        education = new Button("Education");
        education.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        education.setMinSize(150, 50);
        workForce = new Button("Workforce");
        workForce.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        workForce.setMinSize(150, 50);
        childCare = new Button("Child Care");
        childCare.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        childCare.setMinSize(150, 50);
        community = new Button("Community");
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


        foodShelter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                FoodAndShelter GUI = new FoodAndShelter(primaryStage);
                Scene scene2 = new Scene(GUI.getBpane(), 800, 700);
                primaryStage.setScene(scene2);
                primaryStage.show();

            }
        });

        health.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Health GUI = new Health(primaryStage);
                Scene scene2 = new Scene(GUI.getBpane(), 800, 700);
                primaryStage.setScene(scene2);
                primaryStage.show();

            }
        });

        education.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Education GUI = new Education(primaryStage);
                Scene scene2 = new Scene(GUI.getBpane(), 800, 700);
                primaryStage.setScene(scene2);
                primaryStage.show();
            }
        });
        workForce.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                WorkForce GUI = new WorkForce(primaryStage);
                Scene scene2 = new Scene(GUI.getBpane(), 800, 700);
                primaryStage.setScene(scene2);
                primaryStage.show();
            }
        });
        childCare.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ChildCare GUI = new ChildCare(primaryStage);
                Scene scene2 = new Scene(GUI.getBpane(), 800, 700);
                primaryStage.setScene(scene2);
                primaryStage.show();
            }
        });

        community.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Community GUI = new Community(primaryStage);
                Scene scene2 = new Scene(GUI.getBpane(), 800, 700);
                primaryStage.setScene(scene2);
                primaryStage.show();
            }
        });

        bpane.setTop(top);
        bpane.setLeft(left);
        bpane.setRight(right);
    }

    public void start(Stage primaryStage) {
            Scene scene1 = new Scene(getBpane(), 800, 700);
            primaryStage.setScene(scene1);
            primaryStage.show();

            foodShelter.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e) {
                    FoodAndShelter GUI = new FoodAndShelter(primaryStage);
                    Scene scene2 = new Scene(GUI.getBpane(), 800, 700);
                    primaryStage.setScene(scene2);
                    primaryStage.show();

                }
            });

            health.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e) {
                    Health GUI = new Health(primaryStage);
                    Scene scene2 = new Scene(GUI.getBpane(), 800, 700);
                    primaryStage.setScene(scene2);
                    primaryStage.show();

                }
            });

            education.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Education GUI = new Education(primaryStage);
                    Scene scene2 = new Scene(GUI.getBpane(), 800, 700);
                    primaryStage.setScene(scene2);
                    primaryStage.show();
                }
            });
            workForce.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    WorkForce GUI = new WorkForce(primaryStage);
                    Scene scene2 = new Scene(GUI.getBpane(), 800, 700);
                    primaryStage.setScene(scene2);
                    primaryStage.show();
                }
            });
            childCare.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    ChildCare GUI = new ChildCare(primaryStage);
                    Scene scene2 = new Scene(GUI.getBpane(), 800, 700);
                    primaryStage.setScene(scene2);
                    primaryStage.show();
                }
            });

            community.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Community GUI = new Community(primaryStage);
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
