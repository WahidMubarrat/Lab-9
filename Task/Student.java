package Task;

public class Student {
    String id;
    String name;
    String address;
    String residenceStatus;
    String mobile;

    public Student(String id, String name, String address, String residenceStatus, String mobile) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.residenceStatus = residenceStatus;
        this.mobile = mobile;
    }
    public String toString() {
        return "Name" + this.name + "Id" + this.id + "Mobile" + this.mobile +"ResidenceStatus"+residenceStatus+ "Address" + this.address;
    }

}