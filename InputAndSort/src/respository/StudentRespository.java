/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package respository;

import dataaccess.StudentDAO;
import java.util.List;
import model.Student;

/**
 *
 * @author longle2507
 */
public class StudentRespository implements IStudentRespository{

    @Override
    public void addStudent(List<Student> stdList) {
        StudentDAO.Instance().addStudent(stdList);
    }

    @Override
    public void showAll(List<Student> stdList) {
        StudentDAO.Instance().showAll(stdList);
    }
    
}
