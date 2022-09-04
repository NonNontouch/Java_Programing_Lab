import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Lab10_Pro1 extends Application {
    private static Loan loan;
    private TextField tfAnnualIntersetRate = new TextField();
    private TextField tfNumberofYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfTotalPayment = new TextField();
    private Button btCalculate = new Button("Calculate");
    private Button btClear = new Button("Clear");
    private Button btSave = new Button("Save");
    private Button btLoad = new Button("Load");
    private Rectangle rec = new Rectangle(80, 20, Color.web("#F4F4F4"));

    @Override
    public void start(Stage primaryStage) {

        BorderPane borderPane = new BorderPane();
        GridPane gridPane = new GridPane();
        GridPane gridPane2 = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        gridPane.add(new Label("Annual InterestRate:"), 0, 0);
        gridPane.add(tfAnnualIntersetRate, 1, 0);

        gridPane.add(new Label("Number of Year:"), 0, 1);
        gridPane.add(tfNumberofYears, 1, 1);

        gridPane.add(new Label("Lone Amount:"), 0, 2);
        gridPane.add(tfLoanAmount, 1, 2);

        gridPane.add(new Label("Monthly Payment:"), 0, 3);
        gridPane.add(tfMonthlyPayment, 1, 3);

        gridPane.add(new Label("Total Payment:"), 0, 4);
        gridPane.add(tfTotalPayment, 1, 4);

        gridPane2.add(btSave, 0, 0);
        gridPane2.add(btLoad, 1, 0);
        gridPane2.add(rec,2,0);
        gridPane2.add(btClear, 3, 0);
        gridPane2.add(btCalculate, 4, 0);

        // setAlignment ของแต่ละอัน
        gridPane.setAlignment(Pos.CENTER);
        gridPane2.setAlignment(Pos.CENTER);
        tfAnnualIntersetRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberofYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment((Pos.BOTTOM_RIGHT));
        tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);

        // แก้ไขได้หรือปล่าว
        tfMonthlyPayment.setEditable(false);
        tfTotalPayment.setEditable(false);

        btCalculate.setOnAction(e -> calculateLonePayment());
        btClear.setOnAction(e -> clearall());
        btSave.setOnAction(e -> {
            try {
                save();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        btLoad.setOnAction(e -> {
            try {
                load();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        borderPane.setCenter(gridPane);
        borderPane.setBottom(gridPane2);

        Scene scene = new Scene(borderPane, 400, 200);
        primaryStage.setTitle("Lab10_2");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void calculateLonePayment() {

        double interes = Double.parseDouble(tfAnnualIntersetRate.getText());
        int year = Integer.parseInt(tfNumberofYears.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());

        loan = new Loan(interes, year, loanAmount);

        tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
        tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
    }

    public void clearall() {
        tfAnnualIntersetRate.clear();
        tfLoanAmount.clear();
        tfMonthlyPayment.clear();
        tfNumberofYears.clear();
        tfTotalPayment.clear();
    }

    public void save() throws IOException {
        if (!tfAnnualIntersetRate.isCache() && !tfLoanAmount.isCache() && !tfMonthlyPayment.isCache()) {
            try (DataOutputStream output = new DataOutputStream(new FileOutputStream("loan.dat"));) {
                output.writeDouble(loan.getAnnualInterestRate());
                output.writeInt(loan.getNumberofYear());
                output.writeDouble(loan.getLoanAmount());
                output.close();
            }
        }
    }

    public void load() throws IOException {
        tfAnnualIntersetRate.clear();
        tfLoanAmount.clear();
        tfMonthlyPayment.clear();
        tfNumberofYears.clear();
        tfTotalPayment.clear();
        try (DataInputStream input = new DataInputStream(new FileInputStream("loan.dat"));) {
            tfAnnualIntersetRate.setText(Double.toString(input.readDouble()));
            tfNumberofYears.setText(Integer.toString(input.readInt()));
            tfLoanAmount.setText(Double.toString(input.readDouble()));
            input.close();
        }

    }

    public static void main(String[] args) throws IOException {

        launch(args);
    }

}
