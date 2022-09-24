package view.Tm;

public class OnDeliveryTm {
private String VehicleNumber;
    private String VehicleType;
    private String Driver;
    private String Time;
    private String Date;

    public OnDeliveryTm() {
    }

    public OnDeliveryTm(String vehicleNumber, String vehicleType, String driver, String time, String date) {
        VehicleNumber = vehicleNumber;
        VehicleType = vehicleType;
        Driver = driver;
        Time = time;
        Date = date;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "OnDeliveryTm{" +
                "VehicleNumber='" + VehicleNumber + '\'' +
                ", VehicleType='" + VehicleType + '\'' +
                ", Driver='" + Driver + '\'' +
                ", Time='" + Time + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}
