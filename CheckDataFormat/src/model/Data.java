package model;

public class Data {
    private String phoneNumber;
    private String email;
    private String date;

    public Data(String phoneNumber, String email, String date) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.date = date;
    }

    public Data() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
