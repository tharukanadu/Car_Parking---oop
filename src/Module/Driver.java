package Module;

public class Driver {
private String Driver_name;
private String Nic;
private String DrivingLicenseNo;
private String Address;
private String Contact;

    public Driver() {
    }

    public Driver(String driver_name, String nic, String drivingLicenseNo, String address, String contact) {
        Driver_name = driver_name;
        Nic = nic;
        DrivingLicenseNo = drivingLicenseNo;
        Address = address;
        Contact = contact;
    }

    public String getDriver_name() {
        return Driver_name;
    }

    public void setDriver_name(String driver_name) {
        Driver_name = driver_name;
    }

    public String getNic() {
        return Nic;
    }

    public void setNic(String nic) {
        Nic = nic;
    }

    public String getDrivingLicenseNo() {
        return DrivingLicenseNo;
    }

    public void setDrivingLicenseNo(String drivingLicenseNo) {
        DrivingLicenseNo = drivingLicenseNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "Driver_name='" + Driver_name + '\'' +
                ", Nic='" + Nic + '\'' +
                ", DrivingLicenseNo='" + DrivingLicenseNo + '\'' +
                ", Address='" + Address + '\'' +
                ", Contact='" + Contact + '\'' +
                '}';
    }
}
