package practise;

public class College {

    int id;
    String name;
    String contactNo;
    String address;
    int pincode;

    public College(int id, String name, String contactNo, String address, int pincode) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", address='" + address + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
