package sample;

import javafx.application.Application;
// import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
// import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*
        * We'll come back to the Parent object later
        **/
        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group root = new Group();
        Text txt = new Text("Sup?");
        TextField nameFld = new TextField();
        Button btn = new Button();
        btn.setText("Say S'up");
        btn.setOnAction(evt -> System.out.printf("Sup, %s!%n", nameFld.getText()));
        txt.setY(60);
        VBox box = new VBox();
        box.getChildren().addAll(txt, nameFld, btn);
        root.getChildren().add(box);
        primaryStage.setTitle("Sup App");
        /*
        sets the scene height and width... just like the Canvas object in
        HTML or the old-school scene object from ActionScript
        */
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
