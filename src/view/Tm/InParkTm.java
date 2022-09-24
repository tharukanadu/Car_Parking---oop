package view.Tm;

public class InParkTm {
    private String VehicleNumber;
    private String VehicleType;
    private String SloatNumber;
    private String Time;
    private String Date;

    public InParkTm() {
    }

    public InParkTm(String vehicleNumber, String vehicleType, String sloatNumber, String time, String date) {
        VehicleNumber = vehicleNumber;
        VehicleType = vehicleType;
        SloatNumber = sloatNumber;
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

    public String getSloatNumber() {
        return SloatNumber;
    }

    public void setSloatNumber(String sloatNumber) {
        SloatNumber = sloatNumber;
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
        return "InParkTm{" +
                "VehicleNumber='" + VehicleNumber + '\'' +
                ", VehicleType='" + VehicleType + '\'' +
                ", SloatNumber='" + SloatNumber + '\'' +
                ", Time='" + Time + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}
