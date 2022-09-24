package Module;

public class Vehicle {
    private String VehicleNumber;
    private String Maximum_Weight;
    private String NoOfPassengers;
    private String VehicleType;
    public Vehicle() {
    }

    public Vehicle(String vehicleNumber, String maximum_Weight, String noOfPassengers, String vehicleType) {
        VehicleNumber = vehicleNumber;
        Maximum_Weight = maximum_Weight;
        NoOfPassengers = noOfPassengers;
        VehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getMaximum_Weight() {
        return Maximum_Weight;
    }

    public void setMaximum_Weight(String maximum_Weight) {
        Maximum_Weight = maximum_Weight;
    }

    public String getNoOfPassengers() {
        return NoOfPassengers;
    }

    public void setNoOfPassengers(String noOfPassengers) {
        NoOfPassengers = noOfPassengers;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VehicleNumber='" + VehicleNumber + '\'' +
                ", Maximum_Weight='" + Maximum_Weight + '\'' +
                ", NoOfPassengers='" + NoOfPassengers + '\'' +
                ", VehicleType='" + VehicleType + '\'' +
                '}';
    }
}
