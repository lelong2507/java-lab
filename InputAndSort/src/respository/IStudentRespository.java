/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package respository;

import java.util.List;
import model.Student;

/**
 *
 * @author longle2507
 */
public interface IStudentRespository {

    void addStudent(List<Student> stdList);

    void showAll(List<Student> stdList);
}
