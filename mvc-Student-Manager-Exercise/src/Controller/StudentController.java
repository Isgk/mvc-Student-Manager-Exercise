package Controller;

import java.util.Scanner;
import Model.Model;
import Model.Student;
import View.StudentView;

public class StudentController {

    private Model model;
    private StudentView view;
    private Scanner scanner;

    public StudentController(Model model, StudentView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;

        while (running) {
            view.printMainMenu();
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                managerMenu();
            } else if (choice.equals("2")) {
                studentMenu();
            } else if (choice.equals("3")){
               running = false ;  
            }else {
                view.printMessage("Invalid choice.");
            }
        }
    }

    // TO-DO
    public void managerMenu() {
        boolean running = true;

        while (running) {
            view.printManagerMenu();
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
               // TO-DO : Print the student list (using the View function)
            } else if (choice.equals("2")) {
                addStudent();
            } else if (choice.equals("3")) {
                updateStudentGrade();
            } else if (choice.equals("4")) {
                running = false;
            } else {
                view.printMessage("Invalid choice.");
            }
        }
    }

    public void studentMenu() {
        
        view.printMessage("Enter your name: ");
        String name = scanner.nextLine();

        Student student = // To-do find student by name (using the model function)

        if (student == null) {
            view.printMessage("Student not found.");
        } else {
            int rank = // To-do get Student rank by name (using the model function)
            view.printStudent(student, rank);
        }
    }

    public void addStudent() {
        view.printMessage("Enter your name: ");
        String name = scanner.nextLine();

        view.printMessage("Enter Grade : ");
        int grade = Integer.parseInt(scanner.nextLine());

        model.addStudent(name, grade);

        view.printMessage("Student added successfully.");
    }

    public void updateStudentGrade() {
        boolean updateMore = true;

        while (updateMore) {
            view.printMessage("Enter name: ");
            String name = scanner.nextLine();

            Student student = model.findStudentByName(name);

            if (student == null) {
                view.printMessage("Student not found.");
            } else {
                view.printMessage("Enter New Grade : ");
                int grade = Integer.parseInt(scanner.nextLine());

                student.setGrade(grade);

                view.printMessage("Grade updated successfully.");
            }

           view.printMessage("Update another grade? yes/no: ");
            String answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("yes")) {
                updateMore = false;
            }
        }
    }


}
