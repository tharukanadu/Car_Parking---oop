package view.Tm;

public class DriverTm {
    private String DriverName;
    private String Nic;
    private String Driver_License_No;
    private String address;
    private String Contact;

    public DriverTm() {
    }

    public DriverTm(String driverName, String nic, String driver_License_No, String address, String contact) {
        DriverName = driverName;
        Nic = nic;
        Driver_License_No = driver_License_No;
        this.address = address;
        Contact = contact;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public String getNic() {
        return Nic;
    }

    public void setNic(String nic) {
        Nic = nic;
    }

    public String getDriver_License_No() {
        return Driver_License_No;
    }

    public void setDriver_License_No(String driver_License_No) {
        Driver_License_No = driver_License_No;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    @Override
    public String toString() {
        return "DriverTm{" +
                "DriverName='" + DriverName + '\'' +
                ", Nic='" + Nic + '\'' +
                ", Driver_License_No='" + Driver_License_No + '\'' +
                ", address='" + address + '\'' +
                ", Contact='" + Contact + '\'' +
                '}';
    }
}
