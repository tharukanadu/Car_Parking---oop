package controller;

import Module.Vehicle;
import com.jfoenix.controls.JFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import view.Tm.DriverTm;
import view.Tm.InParkTm;
import view.Tm.VehicleTm;

import java.util.ArrayList;

public class AddVehicleController {

    public TextField textVehicleNumber;
    public TextField textMaximumWeight;
    public TextField textNoOfPassenger;
    public JFXComboBox<String> vehicleTypeCombo;
    static ArrayList<Vehicle> vehiclelist = new ArrayList();
    public TableView<VehicleTm> tblVehicle;
    public TableColumn colVehicleNumber;
    public TableColumn colMaximumWeight;
    public TableColumn colNoOfPassengers;
    public TableColumn colVehicleType;

    static ObservableList<VehicleTm> vehicleList = FXCollections.observableArrayList();

    public void initialize(){
        tblVehicle.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("Vehicle_number"));
        tblVehicle.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("Maximum_Weight"));
        tblVehicle.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("No_of_passengers"));
        tblVehicle.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("Vehicle_Type"));

        tblVehicle.setItems(vehicleList);
    }
    public void AddVehicleButton(ActionEvent actionEvent) {
        Vehicle vehicle = new Vehicle(textVehicleNumber.getText(),textMaximumWeight.getText(),textNoOfPassenger.getText(),vehicleTypeCombo.getValue());


        if (vehiclelist.add(vehicle)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Save..", ButtonType.CLOSE).show();
        } else {
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }
    }

public static void VehicleAdd(String Vehicle_number, String Maximum_Weight, String No_of_passengers, String Vehicle_Type) {
    VehicleTm vehicle  = new VehicleTm(Vehicle_number, Maximum_Weight, No_of_passengers, Vehicle_Type);
    vehicleList.add(vehicle);

}
}
