package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ProgramManagement {
    Scanner sc = new Scanner(System.in);

    public int f1(File f, String word) {
        int bout = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line = "";
            while ((line = br.readLine()) != null) {
                if (line.replaceAll("\\W", "").equals(word)) {
                    bout++;
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return bout;
    }

    public void f2(File folder,String word) {
        System.out.println("--------File Name --------");
        try {
            File arr[] = folder.listFiles();
            for (int i = 0; i < arr.length; i++) {
                if (f1(arr[i],word) > 0) {
                    System.out.println(arr[i].getName());
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
