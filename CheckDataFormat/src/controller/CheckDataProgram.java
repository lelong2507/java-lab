package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import model.Data;
import model.IData;
import view.Validation;

public class CheckDataProgram implements IData {

    Validation val = new Validation();
    Scanner sc = new Scanner(System.in);
    Data data;

    public CheckDataProgram() {
        data = new Data();
    }

    // ------------ Read Data file
    public void readFile() {
        try {
            FileReader fr = new FileReader("src/model/input.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String arr[] = line.split(", ");
                if (arr.length != 3) {
                    System.out.println("Invalid data format: " + line);
                    continue;
                }
                String phoneNumber = arr[0];
                String email = arr[1];
                String date = arr[2];

                Data data = new Data(phoneNumber, email, date);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // --------------- Write Data file
    public void writeFile(String phoneNumber, String email, String date) {
        try {
            FileWriter fw = new FileWriter("src/model/input.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String line = phoneNumber + ", " + email + ", " + date;
            bw.write(line);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public String checkEmail(String email) {
        while (true) {
            if (val.checkEmail(email)) {
                break;
            } else {
                System.out.println("Invalid input: " + email);
            }
            System.out.print("Enter email: ");
            email = sc.nextLine();
        }
        return email;
    }

    @Override
    public String checkPhoneNumber(String phoneNumber) {
        while (true) {
            if (phoneNumber.length() < 10) {
                System.out.println("PhoneNumber must be 10 digits");
            } else if (!val.checkPhoneNumber(phoneNumber)) {
                System.out.println("Invalid input! Must be number!");
            } else {
                break; // Thoát khỏi vòng lặp khi dữ liệu hợp lệ
            }
            // Nhập lại số điện thoại từ người dùng
            System.out.print("Enter a valid phone number: ");
            phoneNumber = sc.nextLine();
        }
        return phoneNumber;
    }

    @Override
    public String checkDate(String date) {
        while (true) {
            if (val.isValidDate(date)) {
                break;
            } else {
                System.out.println("Invalid input! Must be follow this form (dd/MM/yyyy)!");
            }
            date = sc.nextLine();
        }
        return date;
    }
}
