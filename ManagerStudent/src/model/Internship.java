package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author longle2507
 */
//Majors, Semester, University name
public class Internship extends Candidate {

    private String majors;
    private String semester;
    private String universityName;

    public Internship(){
        
    }
    public Internship( String id, String firstName, String lastName, String birthDay, String address, String phone, String email,String type,String majors, String semester, String universityName) {
        super(id, firstName, lastName, birthDay, address, phone, email,type);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Internship{" + "majors=" + majors + ", semester=" + semester + ", universityName=" + universityName + '}';
    }

}
