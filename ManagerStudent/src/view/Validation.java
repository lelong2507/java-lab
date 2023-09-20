/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.regex.*;
import java.util.*;

/**
 *
 * @author longle2507
 */
public class Validation {

    // For Candidate
    public boolean isValidId(String id) {
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    public boolean isValidFirstName(String firstName) {
        String regex = "^[^\\s\\d]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean isValidLastName(String lastName) {
        String regex = "^[^\\s\\d]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean isValidBirthDay(String birthDay) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(birthDay);
        return matcher.matches();
    }

    public boolean isValidAddress(String address) {
        String regex = "^[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(address);
        return matcher.matches();
    }

    public boolean isValidPhone(String phone) {
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    public boolean isValidType(String id) {
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    // check input
    public String checkType() {
        String type = "";
        while (!isValidType(type)) {
            System.out.println("Input type: 1.Fresher || 2.Exprience || 3.Internship ");
            Scanner sc = new Scanner(System.in);
            type = sc.nextLine();
            if (!isValidType(type)) {
                System.out.println("Invalid input");
            }
        }
        return type;
    }
    
    public String checkId() {
        String id = "";
        while (!isValidId(id)) {
            System.out.println("Input ID: ");
            Scanner sc = new Scanner(System.in);
            id = sc.nextLine();
            if (!isValidId(id)) {
                System.out.println("Invalid input");
            }
        }
        return id;
    }

    public String checkFirstName() {
        String firstName = "";
        while (!isValidFirstName(firstName)) {
            System.out.println("Input firstName: ");
            Scanner sc = new Scanner(System.in);
            firstName = sc.nextLine();
            if (!isValidFirstName(firstName)) {
                System.out.println("Invalid input");
            }
        }
        return firstName;
    }

    public String checkLastName() {
        String lastName = "";
        while (!isValidLastName(lastName)) {
            System.out.println("Input lastName: ");
            Scanner sc = new Scanner(System.in);
            lastName = sc.nextLine();
            if (!isValidLastName(lastName)) {
                System.out.println("Invalid input");
            }
        }
        return lastName;
    }

    public String checkBirthDay() {
        String birthDay = "";
        while (!isValidBirthDay(birthDay)) {
            System.out.println("Input birthDay: ");
            Scanner sc = new Scanner(System.in);
            birthDay = sc.nextLine();
            if (!isValidBirthDay(birthDay)) {
                System.out.println("Invalid input");
            }
        }
        return birthDay;
    }

    public String checkAddress() {
        String address = "";
        while (!isValidAddress(address)) {
            System.out.println("Input address: ");
            Scanner sc = new Scanner(System.in);
            address = sc.nextLine();
            if (!isValidAddress(address)) {
                System.out.println("Invalid input");
            }
        }
        return address;
    }

    public String checkPhone() {
        String phone = "";
        while (!isValidPhone(phone)) {
            System.out.println("Input phone: ");
            Scanner sc = new Scanner(System.in);
            phone = sc.nextLine();
            if (!isValidPhone(phone)) {
                System.out.println("Invalid input");
            }
        }
        return phone;
    }

    public String checkEmail() {
        String email = "";
        while (!isValidEmail(email)) {
            System.out.println("Input email: ");
            Scanner sc = new Scanner(System.in);
            email = sc.nextLine();
            if (!isValidEmail(email)) {
                System.out.println("Invalid input");
            }
        }
        return email;
    }

    // For fresher
    public boolean isValidGraduation(String graduationDay) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(graduationDay);
        return matcher.matches();
    }

    public boolean isValidRank(String rank) {
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(rank);
        return matcher.matches();
    }

    public boolean isValidEducation(String education) {
        String regex = "^[^\\s\\d]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(education);
        return matcher.matches();
    }

    public String checkGraduation() {
        String graduation = "";
        while (!isValidGraduation(graduation)) {
            System.out.println("Enter graduation: ");
            Scanner sc = new Scanner(System.in);
            graduation = sc.nextLine();
            if (!isValidGraduation(graduation)) {
                System.out.println("Invalid input");
            }
        }
        return graduation;
    }

    public String checkEducation() {
        String education = "";
        while (!isValidEducation(education)) {
            System.out.println("Enter education: ");
            Scanner sc = new Scanner(System.in);
            education = sc.nextLine();
            if (!isValidEducation(education)) {
                System.out.println("Invalid input");
            }
        }
        return education;
    }

    public String checkRank() {
        String rank = "";
        while (!isValidRank(rank)) {
            System.out.println("Enter Rank: ");
            Scanner sc = new Scanner(System.in);
            rank = sc.nextLine();
            if (!isValidRank(rank)) {
                System.out.println("Invalid input");
            }
        }
        return rank;
    }
    
    // For Experience
    //year of experience (ExpInYear), Professional Skill (ProSkill). 
    public boolean isValidExpInYear(String expInYear) {
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(expInYear);
        return matcher.matches();
    }

    public boolean isValidProSkill(String proSkill) {
        String regex = "^[^\\s\\d]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(proSkill);
        return matcher.matches();
    }
    
     public String checkExpInYear() {
        String exptInYear = "";
        while (!isValidExpInYear(exptInYear)) {
            System.out.println("Enter Exp In Year: ");
            Scanner sc = new Scanner(System.in);
            exptInYear = sc.nextLine();
            if (!isValidExpInYear(exptInYear)) {
                System.out.println("Invalid input");
            }
        }
        return exptInYear;
    }

    public String checkProSkill() {
        String proSkill = "";
        while (!isValidProSkill(proSkill)) {
            System.out.println("Enter ProSkill: ");
            Scanner sc = new Scanner(System.in);
            proSkill = sc.nextLine();
            if (!isValidProSkill(proSkill)) {
                System.out.println("Invalid input");
            }
        }
        return proSkill;
    }
    
    
    // for intership
    /*
    private String majors;
    private String semester;
    private String universityName;*/
    public boolean isValidMajor(String major) {
        String regex = "^[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(major);
        return matcher.matches();
    }
    
    public boolean isValidSemester(String semester) {
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(semester);
        return matcher.matches();
    }
    
    public boolean isValidUniversityName(String universityName) {
        String regex = "^[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(universityName);
        return matcher.matches();
    }
    
    public String checkMajors() {
        String major = "";
        while (!isValidMajor(major)) {
            System.out.println("Input Major: ");
            Scanner sc = new Scanner(System.in);
            major = sc.nextLine();
            if (!isValidMajor(major)) {
                System.out.println("Invalid input");
            }
        }
        return major;
    }
    public String checkSemester() {
        String semester = "";
        while (!isValidSemester(semester)) {
            System.out.println("Input Semester: ");
            Scanner sc = new Scanner(System.in);
            semester = sc.nextLine();
            if (!isValidSemester(semester)) {
                System.out.println("Invalid input");
            }
        }
        return semester;
    }
    public String checkUniversityName() {
        String universityName = "";
        while (!isValidUniversityName(universityName)) {
            System.out.println("Input University Name: ");
            Scanner sc = new Scanner(System.in);
            universityName = sc.nextLine();
            if (!isValidUniversityName(universityName)) {
                System.out.println("Invalid input");
            }
        }
        return universityName;
    }
    public static void main(String[] args) {
        Validation val = new Validation();
        val.checkRank();
        
    }
}
