package Pro4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class Lab9_02_Pro4 extends Application {
    public void start(Stage primaryStage) {
        Car car = new Car();

        car.setOnMousePressed(e -> car.pause());
        car.setOnMouseReleased(e -> car.play());
        car.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                car.increaseSpeed();
            } else if (e.getCode() == KeyCode.DOWN) {
                car.decreaseSpeed();
            }
        });

        Scene scene = new Scene(car, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Lab9_02_Pro4");
        primaryStage.show();
        car.requestFocus();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
