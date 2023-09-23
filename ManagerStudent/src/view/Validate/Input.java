package ManagerStudent.src.view.Validate;

import java.util.ArrayList;
import java.util.Scanner;

import ManagerStudent.src.model.Student;

public class Input {
    private Validation val = new Validation();

    public String checkId() {
        String id = "";
        while (!val.checkInt(id)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ID Student: ");
            id = sc.nextLine();
            if (!val.checkInt(id)) {
                System.out.println("Invalid input");
            }
        }
        return id;
    }

    public String checkName() {
        String name = "";
        while (!val.checkString(name)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name Student: ");
            name = sc.nextLine();
            if (!val.checkString(name)) {
                System.out.println("Invalid input");
            }
        }
        return name;
    }

    public String checkSemester() {
        String semester = "";
        while (!val.checkInt(semester)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter semester: ");
            semester = sc.nextLine();
            if (!val.checkInt(semester)) {
                System.out.println("Invalid input");
            }
        }
        return semester;
    }

    public String checkCouserName() {
        String nameCouser = "";
        while (!val.checkString(nameCouser)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter course name");
            nameCouser = sc.nextLine();
            if (!val.checkString(nameCouser)) {
                System.out.println("Invalid input");
            }
        }
        return nameCouser;
    }

    public String checkContinue(){
        String yesOrNo = "";
        while(!val.checkChar(yesOrNo)){
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to continue: Y || N");
            yesOrNo = sc.nextLine();
            if(!val.checkChar(yesOrNo)){
                System.out.println("Invalid input");
            }
        }
        return yesOrNo;
    }
}
