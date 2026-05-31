import Controller.StudentController;
import View.StudentView;
import Model.Model;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        StudentView view = new StudentView();

        StudentController controller =  new StudentController(model, view);

        controller.start();
    }
}
