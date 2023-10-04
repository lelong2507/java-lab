package controller;

import java.util.*;
import model.Contact;

public class ContactManagement {

    List<Contact> contactList = new ArrayList<>();

    public ContactManagement() {
        Contact con1 = new Contact(1, "Start", "Spain", "1234567890", "Casillas", "Iker");
        Contact con2 = new Contact(2, "Start", "England	", "1234567890", "John", "Terry");
        Contact con3 = new Contact(3, "Start", "Spain	", "1234567890", "Raul", "Gonzalez");
        contactList.add(con1);
        contactList.add(con2);
        contactList.add(con3);

    }

    // ------------------------- Add Contact
    public void addEle(Contact contact) {
        contactList.add(contact);
    }

    // ------------------------ Display All
    public void displayAll() {
        System.out.println("ID  Name            First Name      Last Name       Group           Address         Phone");
        for (Contact con : contactList) {
            System.out.printf("%-2s %-15s %-15s %-15s %-15s %-15s %-15s%n",
                    con.getId(), con.getFullName(), con.getFirstName(), con.getLastName(), con.getGroup().replace(" ", "_"), con.getAddress().replace(" ", "_"), con.getPhoneNumber());
        }
    }

    // ------------------------ Delete Contact
    public void deleteEle(int id) {
        boolean flag = false;
        for (int i = 0; i < contactList.size(); i++) {
            if (id == contactList.get(i).getId()) {
                contactList.remove(i);
                flag = true;
                System.out.println("Delete Success");
            }
        }

        if (flag == false) {
            System.out.println("Not Found to delete!");
        }
    }
}
