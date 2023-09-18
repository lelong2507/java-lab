/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author longle2507
 */
public class Grab {

    private int id;
    private String nameDriver;
    private String nameUser;
    private double numberKm;
    private boolean isDone;

    public Grab() {

    }

    public Grab(int id, String nameDriver, String nameUser, double numberKm,boolean isDone) {
        this.id = id;
        this.nameDriver = nameDriver;
        this.nameUser = nameUser;
        this.numberKm = numberKm;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        this.nameDriver = nameDriver;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public double getNumberKM() {
        return numberKm;
    }

    public void setNumberKM(double numberKm) {
        this.numberKm = numberKm;
    }

    public boolean isIsDone() {
        return isDone;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        return "Grab{" + "id=" + id + ", nameDriver=" + nameDriver + ", nameUser=" + nameUser + ", numberKm=" + numberKm + ", isDone=" + isDone + '}';
    }

   

    public double getMoney() {
        final double moneyKm = 15.00;
        double result = moneyKm * this.numberKm;
        return result;
    }
}
