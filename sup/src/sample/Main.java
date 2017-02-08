package sample;

import javafx.application.Application;
// import javafx.fxml.FXMLLoader;
import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*
        * We'll come back to the Parent object later
        **/

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));

        // Group root = new Group();
        /*
        sets the scene height and width... just like the Canvas object in
        HTML or the old-school scene object from ActionScript
        */
    /*    Text txt = new Text("Sup?");
        txt.setFont(new Font("Papyrus", 80));
        Label label = new Label("Name: ");
        GridPane grid = new GridPane();
        TextField nameFld = new TextField();
        Button btn = new Button();
        grid.add(label, 0, 0 );
        txt.setY(60);
        grid.setHgap(20);
        grid.add(nameFld, 1, 0);
        btn.setText("Say S'up");
        btn.setOnAction(evt -> System.out.printf("Sup, %s!%n", nameFld.getText()));
        grid.add(btn, 1, 1);
        // grid.setGridLinesVisible(true);
        VBox box = new VBox();
        box.getChildren().addAll(txt, grid);
        root.getChildren().add(box);*/
        primaryStage.setTitle("Sup App");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
