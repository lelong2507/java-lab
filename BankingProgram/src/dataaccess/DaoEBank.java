/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccess;

import view.*;

import java.util.*;

/**
 *
 * @author ASUS
 */
public class DaoEBank {

    private static DaoEBank instance = null;
    Validation sc;

    public DaoEBank() {
        sc = new Validation();
    }

    public static DaoEBank Instance() {
        if (instance == null) {
            synchronized (DaoEBank.class) {
                if (instance == null) {
                    instance = new DaoEBank();
                }
            }
        }
        return instance;
    }

    public void setLanguage(Locale locale) {
        Locale.setDefault(locale);
    }

    public void getAccount() {
        ResourceBundle myBundle = ResourceBundle.getBundle("language");
        String account = sc.getAccountNumber(myBundle.getString("account"), myBundle.getString("accountErr"));
    }

    public void getPassword() {
        ResourceBundle myBundle = ResourceBundle.getBundle("language");
        String password = sc.getPassword(myBundle.getString("passWord"), myBundle.getString("passWordErr"));
    }

    public void getCaptcha() {
        ResourceBundle myBundle = ResourceBundle.getBundle("language");
        while (true) {
            String captcha = generateCaptcha(5);
            System.out.println(myBundle.getString("captcha") + ": " + captcha);
            System.out.println(myBundle.getString("captcha"));
            String input = sc.getScanner().nextLine();
            if (checkCaptcha(captcha, input)) {
                break;
            } else {
                System.err.println(myBundle.getString("captchaErr"));
            }
        }

    }

    public boolean checkCaptcha(String captcha, String input) {
        return captcha.equals(input);
    }

    public String generateCaptcha(int n) {
        Random rand = new Random(62);
        String chrs = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String captcha = "";
        while (n-- > 0) {
            int index = (int) (Math.random() * 62);
            captcha += chrs.charAt(index);
        }
        return captcha;
    }
}