package Pro1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;

public class Lab9_Pro1 extends Application {
    protected TextField tfLoanAmount = new TextField();
    protected TextField tfNumberOfYears = new TextField();
    protected TextArea textArea = new TextArea();

    @Override
    public void start(Stage primaryStage) {
        tfNumberOfYears.setPrefColumnCount(4);
        tfLoanAmount.setPrefColumnCount(9);
        textArea.setPrefColumnCount(40);
        textArea.setPrefRowCount(20);

        Button btShowTable = new Button("Show Table");

        HBox paneForControls = new HBox(20);
        paneForControls.setAlignment(Pos.CENTER);
        paneForControls.getChildren().addAll(new Label("Loan Amount"), tfLoanAmount,
                new Label("Number of Years"), tfNumberOfYears, btShowTable);



        BorderPane pane = new BorderPane();
        pane.setTop(paneForControls);
        pane.setCenter(textArea);

        btShowTable.setOnAction(e -> {
            print();
        });

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Lab9");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void print() {
        String output = "";
        double monthlyInterestRate;
        double monthlyPayment;

        output += "Interest Rate         Monthly Payment            Total Payment\n";

        for (double i = 5.0; i <= 8; i += 0.125) {
            monthlyInterestRate = i / 1200;
            monthlyPayment = Double.parseDouble(tfLoanAmount.getText()) *
                    monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate,
                            Double.parseDouble(tfNumberOfYears.getText()) * 12));

            output += String.format("%-26.3f%-36.2f%-10.2f\n", i, monthlyPayment,
                    (monthlyPayment * 12) * Double.parseDouble(tfNumberOfYears.getText()));
        }

        textArea.setText(output);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
