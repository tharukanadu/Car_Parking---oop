package controller;

import Module.Driver;
import Module.Vehicle;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import view.Tm.DriverTm;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static javafx.collections.FXCollections.observableArrayList;

public class AddDriverController {
    public JFXTextField textDriverName;
    public JFXTextField textAddress;
    public JFXTextField textDrivingLicenseNo;
    public JFXTextField textNicNumber;
    public TableColumn colDriverName;
    public TableColumn colNic;
    public TableColumn colDrivingLicenseNo;
    public TableColumn colAddress;
    public TableColumn colContact;
    public JFXTextField textContactNumber;
    public TableView <DriverTm>DriverTable;
    static ArrayList<Driver> driverList = new ArrayList();

    public void initialize(){
        DriverTable.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("DriverName"));
        DriverTable.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("Nic"));
        DriverTable.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("Driver_License_No"));
        DriverTable.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("address"));
        DriverTable.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("Contact"));
    }
    public void AddButtonOnAction(ActionEvent actionEvent) {
        Driver driver = new Driver(textDriverName.getText(),textNicNumber.getText(),textDrivingLicenseNo.getText(),textAddress.getText(),textContactNumber.getText());


        if (driverList.add(driver)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Save..", ButtonType.CLOSE).show();
            loadAllDriver();
        } else {
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }
    }


    public void loadAllDriver(){
        ObservableList<DriverTm>drivers=FXCollections.observableArrayList();
        drivers.add(new DriverTm(textDriverName.getText(),textNicNumber.getText(),textDrivingLicenseNo.getText(),textAddress.getText(),textContactNumber.getText()));

        DriverTable.setItems(drivers);
    }

}
