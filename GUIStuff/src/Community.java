import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Community {
    BorderPane bpane;
    VBox right2;

    private Button add = new Button("Submit");

    private final VBox chatBox = new VBox(5);
    private List<Label> messages = new ArrayList<>();
    private ScrollPane container = new ScrollPane();
    private int index = 0;
    TextField text;
    public Community(Stage primaryStage) {
        bpane = new BorderPane();
        bpane.setStyle("-fx-background-color: #ffffff;");
        HBox top2 = new HBox();
        top2.setStyle("-fx-background-color: #2e86c1;");
        VBox left2 = new VBox();
        left2.setStyle("-fx-background-color: #2e86c1;");
        right2 = new VBox();
        right2.setStyle("-fx-background-color: #ffffff;");
        Label heading2 = new Label("Community Center");
        Label placeHolder = new Label("This is where community center goes");
        text = new TextField();
        add.setMinSize(600, 30);
        add.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");


        Button back = new Button("Go Back");
        back.setStyle("-fx-background-color: #A3D5F7; " +
                "-fx-border-color: #000000; -fx-border-width: 1px;");
        back.setMinSize(150, 50);

        top2.getChildren().addAll(heading2);
        heading2.setStyle("-fx-background-color: #2e86c1;");
        heading2.setFont(Font.font("Verdana", FontWeight.BOLD, 50));

        initChatBox();
        chatBox.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());

        right2.getChildren().addAll(container,text , add);
        left2.getChildren().addAll(back);
        top2.setAlignment(Pos.CENTER);
        left2.setAlignment(Pos.TOP_CENTER);
        right2.setAlignment(Pos.BOTTOM_CENTER);


        bpane.setTop(top2);
        bpane.setLeft(left2);
        bpane.setCenter(right2);



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

    public void initChatBox(){
        container.setPrefSize(216, 400);
        container.setContent(chatBox);
        chatBox.getStyleClass().add("chatbox");
        add.setOnAction(evt->{
            messages.add(new Label(text.getText()));
            if(index%2==0){
                messages.get(index).setAlignment(Pos.CENTER_LEFT);
            }else{
                messages.get(index).setAlignment(Pos.CENTER_RIGHT);
            }
            chatBox.getChildren().add(messages.get(index));
            index++;

            text.clear();
        });
    }
}

