package View;

import java.util.ArrayList;
import Model.Student;

public class StudentView {

    public void printMainMenu() {
        System.out.println("\nAre you:");
        System.out.println("1. Manager");
        System.out.println("2. Student");
        System.out.println("3. Exit");
        System.out.print("Choose: ");
    }

    public void printManagerMenu() {
        System.out.println("\n--- Manager Menu ---");
        System.out.println("1. Show all students");
        System.out.println("2. Add student");
        System.out.println("3. Update student grade");
        System.out.println("4. Exit");
        System.out.print("Choose: ");
    }

    public void printStudents(ArrayList<Student> students) {
        // To-do Print Students and their grades
    }

    public void printStudent(Student student, int rank) {
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Place in class: " + rank);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
