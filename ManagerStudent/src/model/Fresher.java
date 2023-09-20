/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author longle2507
 */
public class Fresher extends Candidate {
    private String graduationDate;
    private String rank;
    private String education;

    public Fresher(){
        
    }
    public Fresher(String id, String firstName, String lastName, String birthDay, String address, String phone, String email,String type,String graduationDate, String rank, String eduction) {
        super(id, firstName, lastName, birthDay, address, phone, email,type);
        this.graduationDate = graduationDate;
        this.rank = rank;
        this.education = eduction;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getEduaction() {
        return education;
    }

    public void setEduaction(String eduction) {
        this.education = eduction;
    }

    @Override
    public String toString() {
        return "Fresher{" + "graduationDate=" + graduationDate + ", rank=" + rank + ", eduction=" + education + '}';
    }
    
}
