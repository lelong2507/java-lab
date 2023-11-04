package model.repository;

import java.io.*;
import java.util.*;

import model.Customer;

public class CustomerRepository {
    private Scanner sc = new Scanner(System.in);

    // Import file csv
    public void importCsvFile(List<Customer> cusList) {
        System.out.print("Enter Path: ");
        String path = sc.nextLine();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = br.readLine()) != null) {
                String arr[] = line.split(",");
                if (arr.length == 5) {
                    Customer cus = new Customer();
                    cus.setId(Integer.parseInt(arr[0].trim()));
                    cus.setName(arr[1].trim());
                    cus.setEmail(arr[2].trim());
                    cus.setPhoneNumber(arr[3].trim());
                    cus.setAddress(arr[4].trim());
                    cusList.add(cus);
                    System.out.println(cus.toString());
                }
                line = br.readLine();
            }
            System.out.println("Import: Done");
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (cusList.isEmpty()) {
            System.out.println("Ngu");
        }
    }

    // Format String
    public String normalize(String s) {
        char[] chars = s.trim().replaceAll("\\s+", " ").toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i]) || chars[i] == '-' || chars[i] == '\\') {
                found = false;
            }
        }
        return String.valueOf(s);
    }

    // format address method
    public void formatAddress(List<Customer> cusList) {
        for (Customer cus : cusList) {
            cus.setAddress(normalize(cus.getAddress()));
        }
        System.out.println("Format : Done");
    }

    // format name method
    public void formatName(List<Customer> cusList) {
        for (Customer cus : cusList) {
            cus.setName(normalize(cus.getName()));
        }
        System.out.println("Format : Done");
    }

    // export CSV
    public void exportCSV(List<Customer> cusList) {
        System.out.print("Enter path: ");
        String pathName = sc.nextLine();
        if (cusList.isEmpty()) {
            System.out.println("Ngu");
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(pathName));
            for (Customer cus : cusList) {

                System.out.println(cus.toString());
                bw.append(cus.getId() + ", ");
                bw.append(cus.getName() + ", ");
                bw.append(cus.getEmail() + ", ");
                bw.append(cus.getPhoneNumber() + ", ");
                bw.append(cus.getAddress() + "\n");
            }
            System.out.println("Export : Done");
            bw.close();
        } catch (FileNotFoundException e) {
            System.err.println("File does not exist!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
