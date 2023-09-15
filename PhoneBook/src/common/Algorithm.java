/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.*;
import java.util.Map.*;

/**
 *
 * @author longle2507
 */
public class Algorithm {
    private Map<String,String> data = new HashMap<String,String>();
    
    //Add new phoneNumber
    
    public String addNewPhone(String phoneNumber, String nameUser){
        return this.data.put(phoneNumber, nameUser);
    }
    
    // Delete phoneNumber
    public String deletePhone(String phoneNumber){
        return this.data.remove(phoneNumber);
    }
    
    // Display User
    public String displayUser(String phoneNumber){
        StringTokenizer stz = new StringTokenizer(phoneNumber, " ");
        String userName = this.data.get(phoneNumber);
        while(stz.hasMoreTokens()){
            String readUser = stz.nextToken();
            if(data.containsKey(readUser)){
                System.out.println("Username: " + userName);
                return userName;
            }
        }
        return "Not Found";
    }
    
    // Display all phoneNumber and User
    public void displayAll(){
        Set<Entry<String,String>> allEle = data.entrySet();
        for(Entry<String,String> entry : allEle){
            String phoneNumber = entry.getKey();
            String userName = entry.getValue();
            System.out.println("[PhoneNumber: " + phoneNumber + " UserName: " + userName + "]");
        }
    }
    
    // Delete all phoneNumber
    public void deleteAll(){
        this.data.clear();
    }
}
