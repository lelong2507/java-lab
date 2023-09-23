package ManagerStudent.src.common;

import java.util.*;

import ManagerStudent.src.model.Student;
import ManagerStudent.src.view.Validate.Input;

public class Algorithm {
    protected Input input = new Input();
    static ArrayList<Student> stdList = new ArrayList<>();

    // -------------------------------------------------------- Add Student List
    public ArrayList addStudentList(ArrayList<Student> stdList) {
        Scanner sc = new Scanner(System.in);
        boolean continueAdding = true;

        while (continueAdding) {
            System.out.println("Enter the number of student (0 to exit): ");
            int n = Integer.parseInt(sc.nextLine());

            if (n <= 0) {
                continueAdding = false;
                break;
            }

            for (int i = 0; i < n; i++) {
                System.out.println("Student[" + (i + 1) + "]");
                String id = input.checkId();
                String name = input.checkName();
                String semester = input.checkSemester();
                String courseName = input.checkCouserName();

                Student student = new Student(id, name, semester, courseName);
                stdList.add(student);

                if (stdList.size() >= 10) {
                    System.out.print("Do you want to continue (Y/N)? ");
                    String choice = input.checkContinue().trim().toUpperCase();

                    if (choice.equals("N")) {
                        continueAdding = false;
                        break;
                    } else if (!choice.equals("Y")) {
                        System.out.println("Invalid choice. Continuing...");
                    }
                }
            }
        }
        return stdList;
    }

    // -------------------------------------------------------- Find and Sort
    public void findAndSort(ArrayList<Student> stdList) {
        if (stdList.isEmpty()) {
            System.out.println("No students to find or sort.");
            return;
        }

        System.out.println("Unsorted Student List:");
        report(stdList);

        System.out.println("Sort by: ID (I) || Name (N) || Semester (S) || Course Name (C)");
        Scanner sc = new Scanner(System.in);
        char option = sc.next().charAt(0);
        switch (option) {
            case 'I':
                Collections.sort(stdList, new StudentComparatorByID());
                break;
            case 'N':
                Collections.sort(stdList, new StudentComparatorByName());
                break;
            case 'S':
                Collections.sort(stdList, new StudentComparatorBySemester());
                break;
            case 'C':
                Collections.sort(stdList, new StudentComparatorByCourseName());
                break;
            default:
                System.out.println("Invalid option.");
                return;
        }

        System.out.println("Sorted Student List:");
        report(stdList);
    }

    //--------------------- Implements phương thức của Comparator để sắp xếp theo thứ tự của ID
    class StudentComparatorByID implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getId().compareTo(student2.getId());
        }
    }

    //--------------------- Implements phương thức của Comparator để sắp xếp theo thứ tự của Name
    class StudentComparatorByName implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getName().compareTo(student2.getName());
        }
    }

    //--------------------- Implements phương thức của Comparator để sắp xếp theo thứ tự của Semester
    class StudentComparatorBySemester implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getSemester().compareTo(student2.getSemester());
        }
    }

    //--------------------- Implements phương thức của Comparator để sắp xếp theo thứ tự của Course
    class StudentComparatorByCourseName implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getCourseName().compareTo(student2.getCourseName());
        }
    }

    //--------------------------------------------------------  Update and Delete Student
    public void updateAndDelete(ArrayList<Student> stdList) {
        System.out.println("Two options: Update (U) || Delete (D)?");
        Scanner sc = new Scanner(System.in);
        char option = sc.next().charAt(0);

        if (stdList.isEmpty()) {
            System.out.println("No students to update or delete.");
            return;
        }

        String id = input.checkId();
        boolean found = false;

        for (Student student : stdList) {
            if (student.getId().equals(id)) {
                found = true;

                switch (option) {
                    case 'U':
                        System.out.println("You want to update: Name (N) || Semester (S) || Course (C)");
                        char choose = sc.next().charAt(0);
                        switch (choose) {
                            case 'N':
                                student.setName(input.checkName());
                                break;
                            case 'S':
                                student.setSemester(input.checkSemester());
                                break;
                            case 'C':
                                student.setCourseName(input.checkCouserName());
                                break;
                            default:
                                System.out.println("Invalid option.");
                                break;
                        }
                        break;
                    case 'D':
                        stdList.remove(student);
                        System.out.println("Delete Success!");
                        break;
                    default:
                        System.out.println("Invalid option. Please choose U or D.");
                        break;
                }

                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    //--------------------------------------------------------  Display all Student
    public void report(ArrayList<Student> stdList) {
        for (Student student : stdList) {
            System.out.println(student.toString());
        }
    }

}
