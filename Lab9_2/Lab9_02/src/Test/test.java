package Test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class test extends Application {

    ScrollBar scrollbar = new ScrollBar();
    TextField text = new TextField();
    BorderPane pane = new BorderPane();

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("PUSH");
        btn.setOnAction(e -> print());
        scrollbar.setMax(100);

        pane.setTop(scrollbar);
        pane.setCenter(text);
        pane.setBottom(btn);

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void print() {
        text.setText(Double.toString(scrollbar.getValue()));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
