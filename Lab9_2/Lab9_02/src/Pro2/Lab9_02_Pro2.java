package Pro2;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class Lab9_02_Pro2 extends Application {
    @Override
    public void start(Stage primaryStage) {
        double x = 0, y = 0;
        int r=0;
        GridPane grid = new GridPane();
        StackPane pane = new StackPane();
        Random rand = new Random();
        TextField[] text = new TextField[100];
        for (int i = 0; i < 100; i++) {
            text[i] = new TextField(String.valueOf(rand.nextInt(2)));
            grid.addRow(r, text[i]);
            if((i+1)%10==0){
                r++;
            }
        }
        pane.getChildren().add(grid);
        Scene scene = new Scene(pane, 300, 270);
        primaryStage.setTitle("Lab9_02_Pro2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
