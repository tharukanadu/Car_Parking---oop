package view.Tm;

public class VehicleTm {
    private String Vehicle_number;
    private String Maximum_Weight;
    private String No_of_passengers;
    private String Vehicle_Type;

    public VehicleTm() {
    }

    public VehicleTm(String vehicle_number, String maximum_Weight, String no_of_passengers, String vehicle_Type) {
        Vehicle_number = vehicle_number;
        Maximum_Weight = maximum_Weight;
        No_of_passengers = no_of_passengers;
        Vehicle_Type = vehicle_Type;
    }

    public String getVehicle_number() {
        return Vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        Vehicle_number = vehicle_number;
    }

    public String getMaximum_Weight() {
        return Maximum_Weight;
    }

    public void setMaximum_Weight(String maximum_Weight) {
        Maximum_Weight = maximum_Weight;
    }

    public String getNo_of_passengers() {
        return No_of_passengers;
    }

    public void setNo_of_passengers(String no_of_passengers) {
        No_of_passengers = no_of_passengers;
    }

    public String getVehicle_Type() {
        return Vehicle_Type;
    }

    public void setVehicle_Type(String vehicle_Type) {
        Vehicle_Type = vehicle_Type;
    }

    @Override
    public String toString() {
        return "VehicleTm{" +
                "Vehicle_number='" + Vehicle_number + '\'' +
                ", Maximum_Weight='" + Maximum_Weight + '\'' +
                ", No_of_passengers='" + No_of_passengers + '\'' +
                ", Vehicle_Type='" + Vehicle_Type + '\'' +
                '}';
    }
}
