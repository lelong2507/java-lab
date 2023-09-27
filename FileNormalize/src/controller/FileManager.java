/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

/**
 *
 * @author longle2507
 */
public class FileManager {

    // -------------------------------------------------------------- Input File
    public String inputFile(String input) {
        StringBuffer sb = new StringBuffer();
        try {
            File file = new File("src/model/" + input + ".txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    // ------------------------------------------------------------- Output file
    public void outputFile(String text, String input) {
        try {
            File file = new File("src/model/" + input + ".txt");
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            pw.print(text);
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //----------------------------------------------------------- Normalize File
    public String normalizeFile(String text) {
        text = text.replaceAll("[\\s&&[^\\n]]+", " ") // Khoảng trống và xuống hàng
                .replaceAll("\\s*,\\s*", ", ") // Sau dấu phẩy sẽ khoảng trắng 
                .replaceAll("\\s*:\\s*", ": ") // Sau dấu hai chấm khoảng trắng
                .replaceAll("\\n+", "\n")
                .replaceAll("^\n|\n$", "")
                .replaceAll("\\s*\\s", " ");
        String temp = "";
        String[] str = text.split("\\.");
        for (String string : str) {
            String toUpperCase = string.substring(0, 1).toUpperCase();
            String lineUpper = toUpperCase + string.substring(1);
            temp += lineUpper + ".";
        }
        text = temp;
        return text;
    }
}
