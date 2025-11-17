import java.util.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;


public class Main extends Application {
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello, World!'");
        btn.setOnAction(e -> System.out.println("Hello, World!"));

        VBox vBox = new VBox(btn);

        Scene scene = new Scene(vBox, 300, 250);

        primaryStage.setTitle("Hello, World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}