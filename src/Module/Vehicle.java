package Module;

public class Vehicle {
    private String VehicleNumber;
    private String Maximum_Weight;
    private String NoOfPassengers;

    public Vehicle() {
    }

    public Vehicle(String vehicleNumber, String maximum_Weight, String noOfPassengers) {
        VehicleNumber = vehicleNumber;
        Maximum_Weight = maximum_Weight;
        NoOfPassengers = noOfPassengers;
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

    @Override
    public String toString() {
        return "Vehicle{" +
                "VehicleNumber='" + VehicleNumber + '\'' +
                ", Maximum_Weight='" + Maximum_Weight + '\'' +
                ", NoOfPassengers='" + NoOfPassengers + '\'' +
                '}';
    }
}
