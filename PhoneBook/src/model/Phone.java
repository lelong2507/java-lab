/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author longle2507
 */
public class Phone {
    private String phoneNumber;
    private String userName;
    
    public Phone(){
        
    }
    public Phone(String phoneNumber, String userName){
        this.phoneNumber = phoneNumber;
        this.userName = userName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNameUser() {
        return userName;
    }

    public void setNameUser(String userName) {
        this.userName = userName;
    }
    
}
