package model;

import java.util.List;

//(id, name,age, salary, work location)
public class Worker {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String workLocation;
    private List<SalaryStatus> status;

    public List<SalaryStatus> getsalaryStatus() {
        return status;
    }

    public void setSalaryStatus(List<SalaryStatus> status) {
        this.status = status;
    }

    public Worker() {

    }

    public Worker(int id, String name, int age, double salary, String workLocation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public double increaseSalary(double amount) {
        return salary += amount;
    }

    public double decreaseSalary(double amount) {
        boolean flag = true;
        while (flag == true) {
            if (amount > salary) {
                System.out.println("Can't not");
                flag= false;
            } else {
                flag = true;
                salary -= amount;
            }
        }
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}