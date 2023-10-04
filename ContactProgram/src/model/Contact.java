package model;

public class Contact {

    private int id;
    private String group;
    private String address;
    private String phoneNumber;
    private String firstName;
    private String lastName;

    public Contact() {
    }

    public Contact(int id, String group, String address, String phoneNumber, String firstName,
            String lastName) {
        this.id = id;
        this.group = group;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        String fullName = this.firstName + this.lastName;
        return fullName;
    }

    @Override
    public String toString() {
        return "Contact [id=" + id + ", group=" + group + ", address=" + address
                + ", phoneNumber=" + phoneNumber + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

}
