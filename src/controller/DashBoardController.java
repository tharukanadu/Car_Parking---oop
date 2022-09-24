package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DashBoardController {
    public Button button;
    public Label lblTime;
    public Label lblDate;
    public ComboBox SelectVehicleCombo;
    public ComboBox DriverCombo;
    public JFXTextField textVehicleType;
    public Label lblslot;
    public Rectangle txtSlot;
    private volatile boolean stop = false;

    public void initialize(){
        SelectVehicleCombo.getItems().setAll(
                "GC-1005",
                "ND-1003",
                "QA-2001",
                "ND-5089",
                "JB-1020",
                "NA-2356"
        );
        DriverCombo.getItems().setAll(
                "K.A. Pasan",
                "A.C.V Dissanayake",
                "MUDIYANSE",
                "JAYATHILAKA",
                "UPALI WEHELLA",
                "K.J. PERERA",
                "M.P.S.W.PREMARATHNA",
                "W. PREMACHANDRA",
                "S.A Kasun",
                "S.Supun",
                "G.Tharindu",
                "Indika",
                "Mohomed",
                "Abees  ha"
        );
        SelectVehicleCombo.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

            if (SelectVehicleCombo.getValue().equals("ND-1003")) {
                textVehicleType.setText("Bus");
            }
            if (SelectVehicleCombo.getValue().equals("ND-5089")) {
                textVehicleType.setText("Cargo Lory");
            }
            if (SelectVehicleCombo.getValue().equals("GC-1005")) {
                textVehicleType.setText("Van");
            }
            if (SelectVehicleCombo.getValue().equals("JB-1020")) {
                textVehicleType.setText("Van");
            }
            if (SelectVehicleCombo.getValue().equals("QA-2001")) {
                textVehicleType.setText("Bus");
            }
            if (SelectVehicleCombo.getValue().equals("NA-2356")) {
                textVehicleType.setText("Cargo Lory");
            }
        });


        Time();
        Date();
    }
    public void Time(){
        Thread thread = new Thread(() -> {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

            while (!stop) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                final String timenow = sdf.format(new Date());
                Platform.runLater(() -> {
                    lblTime.setText(timenow);
                });
            }
        });
        thread.start();
    }
    public void Date(){
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String datenow = sdf.format(new Date());
        lblDate.setText(datenow);
    }

    public void managerLoginBtn(ActionEvent actionEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"));
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void ParkVehicleOnAction(ActionEvent actionEvent) {
        if (textVehicleType.getText().equals("Van")) {
            Random r = new Random();
            int start = 1;
            int end = 13;
            int result = r.nextInt(end - start) + start;
            lblslot.setText(String.valueOf(result));
        }

        //Bus Random Number
        if (textVehicleType.getText().equals("Bus")) {
            Random r = new Random();
            int start = 14;
            int end = 15;
            int result = r.nextInt(end - start) + start;
            lblslot.setText(String.valueOf(result));
        }

        //Cargo lory Random Number
        if (textVehicleType.getText().equals("Cargo Lory")) {
            Random r = new Random();
            int start = 5;
            int end = 12;
            int result = r.nextInt(end - start) + start;
            lblslot.setText(String.valueOf(result));

        }

        String number = SelectVehicleCombo.getSelectionModel().getSelectedItem().toString();
        String type = textVehicleType.getText();
 //       String sloat = txtSlot.getText();
        String time = lblTime.getText();
        String date = lblDate.getText();

    //    InParkDetailFormController.Parking(number, type, sloat, time, date);
    }


    public void OnDeliveryBtn(ActionEvent actionEvent) {
        String number = SelectVehicleCombo.getSelectionModel().getSelectedItem().toString();
        String type = textVehicleType.getText();
        String driver = DriverCombo.getSelectionModel().getSelectedItem().toString();
        String time = lblTime.getText();
        String date = lblDate.getText();

  //      OnDelivaryDetailFormController.Delivary(number, type, driver, time, date);
    }
}
