package controller;

import java.io.*;
import java.util.*;
import model.Account;

public class AccountManagement {
    private List<Account> accList = new ArrayList<>();

    public void addAccount(Account acc) {
        accList.add(acc);
    }

    // ---------------- Read File
    public void readFile() {
        try {
            FileReader fr = new FileReader("src/data/test.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                String arr[] = line.split(", ");
                String userName = arr[0];
                String passWord = arr[1];
                Account acc = new Account(userName, passWord);
                accList.add(acc);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ---------------- Write File
    public void writeFile() {
        try {
            FileWriter fw = new FileWriter("src/data/test.txt");
            String line = "";
            for (Account acc : accList) {
                line += acc.getUserName() + ", " + acc.getPassWord() + "\n";
            }
            fw.write(line);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ----------------- Not Duplicate Name
    public boolean checkDuplicate(String userName) {
        for (int i = 0; i < accList.size(); i++) {
            if (userName.equals(accList.get(i).getUserName())) {
                return false;
            }
        }
        return true;
    }

    // ----------------- Login
    public void loginAcc(String userName, String passWord) {
        writeFile();
        boolean loginSuccess = false;
        for (int i = 0; i < accList.size(); i++) {
            if (userName.equals(accList.get(i).getUserName()) &&
                passWord.equals(accList.get(i).getPassWord())) {
                loginSuccess = true;
                break; 
            }
        }
    
        if (loginSuccess) {
            System.out.println("Login success");
        } else {
            System.out.println("Your userName or passWord may be wrong!");
        }
    }
    

}
