/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author longle2507
 */
public class Exprience extends Candidate {
    private String expInYear;
    private String proSkill;

    public Exprience(){
        
    }
    public Exprience(String id, String firstName, String lastName, String birthDay, String address, String phone, String email, String type,String expInYear, String proSkill) {
        super(id, firstName, lastName, birthDay, address, phone, email, type);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    

    public String getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(String expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Exprience{" + "expInYear=" + expInYear + ", proSkill=" + proSkill + '}';
    }
    
    
}
