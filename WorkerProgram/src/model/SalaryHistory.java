package model;

import java.util.*;

public class SalaryHistory {

    private int code;
    private double amount;
    private String date;
    private List<SalaryHistory> shList;

    public SalaryHistory() {

    }

    public SalaryHistory(int code, double amount, String date) {
        this.code = code;
        this.amount = amount;
        this.date = date;
        shList = new ArrayList<>();
    }

    public List<SalaryHistory> getShList() {
        return shList;
    }

    public void setShList(List<SalaryHistory> shList) {
        this.shList = shList;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public String getStatus(){
        return "";
    }
}
