package Model;

import java.util.ArrayList;

public class Model {
    private ArrayList<Student> students;

    public Model() {
        students = new ArrayList<>();

        students.add(new Student("Rany", 85));
        students.add(new Student("Adam", 92));
        students.add(new Student("Lina", 88));
        students.add(new Student("Noor", 75));
    }

    // To-do : implement getStudents() function that returns ArrayList
  

    public void addStudent(String name, int grade) {
        students.add(new Student(name, grade));
    }

    public Student findStudentByName(String name) {
      // To-do find Student By Name
    }

    
    public int getStudentRank(Student student) {
        int rank = 1;

        for (Student other : students) {
            if (other.getGrade() > student.getGrade()) {
                rank++;
            }
        }

        return rank;
    }
}
