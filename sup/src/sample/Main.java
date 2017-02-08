package sample;

import javafx.application.Application;
// import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
// import javafx.scene.Parent;
import javafx.scene.Scene;
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
        txt.setY(60);
        root.getChildren().add(txt);
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
