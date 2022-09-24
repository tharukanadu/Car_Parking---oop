package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import view.Tm.DriverTm;
import view.Tm.InParkTm;
import view.Tm.OnDeliveryTm;
import view.Tm.VehicleTm;

public class OnDeliveryController {

    public TableView<OnDeliveryTm> tblDielivery;
    public TableColumn colVehicle;
    public TableColumn colVehicleType;
    public TableColumn colDriver;
    public TableColumn colTime;
    public TableColumn colDate;
    static ObservableList<OnDeliveryTm> deliveryList = FXCollections.observableArrayList();

    public void initialize(){
        tblDielivery.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("VehicleNumber"));
        tblDielivery.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("VehicleType"));
        tblDielivery.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("Driver"));
        tblDielivery.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("Time"));
        tblDielivery.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("Date"));

        tblDielivery.setItems(deliveryList);
    }
    public static void Delivery(String VehicleNumber, String VehicleType, String Driver, String Time, String Date) {
        OnDeliveryTm delivery = new OnDeliveryTm(VehicleNumber, VehicleType, Driver, Time, Date);
        deliveryList.add(delivery);

    }
}
