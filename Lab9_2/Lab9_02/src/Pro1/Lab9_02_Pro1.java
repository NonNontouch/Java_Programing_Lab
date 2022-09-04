package Pro1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class Lab9_02_Pro1 extends Application {
    @Override
    public void start(Stage primaryStage) {

        Image UK = new Image("S:\\OneDrive\\OneDrive - KMITL\\OOP\\Lab\\Lab9_2\\Lab9_02\\src\\Pro1\\UK.png");
        ImageView IVUK = new ImageView(UK);
        IVUK.setFitHeight(100);
        IVUK.setFitWidth(200);
        Label labelUK = new Label("", IVUK);
        labelUK.setLayoutX(0);
        labelUK.setLayoutY(50);

        Image Canada = new Image("S:\\OneDrive\\OneDrive - KMITL\\OOP\\Lab\\Lab9_2\\Lab9_02\\src\\Pro1\\canada.png");
        ImageView IVCAN = new ImageView(Canada);
        IVCAN.setFitHeight(100);
        IVCAN.setFitWidth(200);
        Label labelCan = new Label("", IVCAN);
        labelCan.setLayoutX(200);
        labelCan.setLayoutY(50);

        Image China = new Image("S:\\OneDrive\\OneDrive - KMITL\\OOP\\Lab\\Lab9_2\\Lab9_02\\src\\Pro1\\China.jpg");
        ImageView IVChi = new ImageView(China);
        IVChi.setFitHeight(100);
        IVChi.setFitWidth(200);
        Label labelChi = new Label("",IVChi);
        labelChi.setLayoutX(0);
        labelChi.setLayoutY(150);

        Image USA = new Image("S:\\OneDrive\\OneDrive - KMITL\\OOP\\Lab\\Lab9_2\\Lab9_02\\src\\Pro1\\US.png");
        ImageView IVUS = new ImageView(USA);
        IVUS.setFitHeight(100);
        IVUS.setFitWidth(200);
        Label labelUS = new Label("",IVUS);
        labelUS.setLayoutX(200);
        labelUS.setLayoutY(150);
        
        
        BorderPane Pane = new BorderPane();
        Pane.getChildren().addAll(labelUK,labelCan,labelChi,labelUS);
        Scene scene = new Scene(Pane,400,200);
        primaryStage.setTitle("Lab9_02_Pro1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
