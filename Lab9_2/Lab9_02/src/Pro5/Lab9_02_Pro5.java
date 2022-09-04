package Pro5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Lab9_02_Pro5 extends Application {
    @Override 
    public void start(Stage primaryStage) {
        Fan fanPane = new Fan();

        
        Button btPause = new Button("Pause");
        Button btResume = new Button("Resume");
        Button btReverse = new Button("Reverse");
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);

        
        hBox.getChildren().addAll(btPause, btResume, btReverse);

     
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(fanPane);
        borderPane.setBottom(hBox);

        btPause.setOnAction(e -> {
            fanPane.pause();
        });

        btResume.setOnAction(e -> {
            fanPane.play();
        });

        btReverse.setOnAction(e -> {
            fanPane.reverse();
        });

        
        Scene scene = new Scene(borderPane, 350, 300);
        primaryStage.setTitle("Lab9_02_Pro5"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 

        fanPane.requestFocus();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
