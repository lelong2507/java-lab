package controller;

import java.util.ArrayList;
import java.util.List;

import model.SalaryHistory;
import model.SalaryStatus;
import model.Worker;
import view.*;

public class WorkerProgram extends Menu<Worker> {

    private WorkerManagement wm;
    private Worker w;
    private SalaryHistory sh;
    private SalaryStatus ss;
    private Input in;
    private List<Worker> wList;
    private List<SalaryHistory> shList;
    private List<SalaryStatus> ssList;

    public WorkerProgram(String title, String[] mchon) {
        super(title, mchon);
        wm = new WorkerManagement();
        w = new Worker();
        sh = new SalaryHistory();
        ss = new SalaryStatus();
        in = new Input();
        wList = new ArrayList<>();
        shList = new ArrayList<>();
        ssList = new ArrayList<>();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                add();
                break;
            case 2:
                increase();
                break;
            case 3:
                decrease();
                break;
            case 4:
                displayAll(shList);
                break;
            case 5:
                System.exit(0);
        }
    }

    public void add() {
        int code = in.inputId();
        String name = in.inputName();
        int age = in.inputAge();
        double salary = in.inputSalary();
        String workLocation = in.inputWorkLocation();
        w = new Worker(code, name, age, salary, workLocation);
        wList.add(w);
    }

    public void increase() {
        String choose = "Increase";
        int code = in.inputId();
        String status = "UP";
        SalaryStatus ss = new SalaryStatus(code, status);
        double amount = in.inputSalary();
        String date = in.inputDate();
        if (wm.changeSalary(ss, code, amount, choose, date, wList) == true) {
            System.out.println("ChangeSuccess");
        } else {
            System.out.println("Not found to change");
        }
        SalaryHistory sh = new SalaryHistory(code, amount, date);
        shList.add(sh);
        ssList.add(ss);
    }

    public void decrease() {
        String choose = "Decrease";
        SalaryStatus status = new SalaryStatus();
        int code = in.inputId();
        status.setStatus("DOWN");
        status.setCode(code);
        double amount = in.inputSalary();
        String date = in.inputDate();
        if (wm.changeSalary(status, code, amount, choose, date, wList) == true) {
            System.out.println("ChangeSuccess");
        } else {
            System.out.println("Not found to change");
        }
        SalaryHistory sh = new SalaryHistory(code, amount, date);
        shList.add(sh);
        ssList.add(status);
    }

    public void displayAll(List<SalaryHistory> shList) {
        System.out.printf("%-10s %-20s %-10s %-10s %-10s %-10s\n", "Code", "Name", "Age", "Salary", "Status", "Date");

        for (Worker w : wList) {
            boolean hasSalaryHistory = false;

            for (SalaryHistory sh : shList) {
                if (sh.getCode() == w.getId()) {
                    SalaryStatus matchingStatus = findMatchingStatus(w.getId());
                    if (matchingStatus != null) {
                        hasSalaryHistory = true;
                        String formattedLine = String.format("%-10d %-20s %-10d %-10.2f %-10s %-10s",
                                w.getId(), w.getName(), w.getAge(), w.getSalary(), matchingStatus.getStatus(),
                                sh.getDate());
                        System.out.println(formattedLine);
                    }
                }
            }

            if (!hasSalaryHistory) {

            }
        }
    }

    private SalaryStatus findMatchingStatus(int code) {
        for (SalaryStatus ss : ssList) {
            if (ss.getCode() == code) {
                return ss;
            }
        }
        return null;
    }

}
