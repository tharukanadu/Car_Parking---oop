package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import view.Tm.InParkTm;

public class InParkController {
    public TableColumn colVehicleNo;
    public TableColumn colvehicleType;
    public TableColumn colSloatNumber;
    public TableColumn colTime;
    public TableColumn colDate;
    public TableView <InParkTm>tblInPark;
    static ObservableList<InParkTm> parkList = FXCollections.observableArrayList();

    public void initialize(){
        tblInPark.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("VehicleNumber"));
        tblInPark.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("VehicleType"));
        tblInPark.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("SloatNumber"));
        tblInPark.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("Time"));
        tblInPark.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("Date"));

        tblInPark.setItems(parkList);
    }
    public static void Parking(String VehicleNumber, String VehicleType, String SloatNumber, String Time, String Date) {
        InParkTm inpark = new InParkTm(VehicleNumber, VehicleType, SloatNumber, Time, Date);
        parkList.add(inpark);

    }
}
