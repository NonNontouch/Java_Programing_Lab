package Pro3;

import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Lab9_02_Pro3 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Random rand = new Random();
        ClockPane clock = new ClockPane(rand.nextInt(12), rand.nextInt(31), rand.nextInt(61));
        clock.toggleminute();
        String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
        Label lblCurrentTime = new Label(timeString);
        

        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.BOTTOM_CENTER);
        

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("Lab9_02_Pro3");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
