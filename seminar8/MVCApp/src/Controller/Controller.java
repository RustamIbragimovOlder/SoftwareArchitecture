package Controller;

// MVC

// import Model.ModelStudent;
// import View.ViewStudent;

// public class Controller {

//     private ModelStudent model;
//     private ViewStudent view;

//     public Controller(ModelStudent model, ViewStudent view) {
//         this.model = model;
//         this.view = view;
//     }

//     public void update() {
//         view.printAllStudent(model.getAllStudents());
//     }

// }

// MVP-1

// import java.util.List;

// import Model.ModelStudent;
// import Model.Domain.Student;
// import View.ViewStudent;

// public class Controller {

//     private ModelStudent model;
//     private ViewStudent view;

//     public Controller(ModelStudent model, ViewStudent view) {
//         this.model = model;
//         this.view = view;
//     }

//     private List<Student> students;

//     private boolean testData(List<Student> studs) {
//         if (studs.size() > 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public void update() {
//         students = model.getAllStudents();
//         if (testData(students)) {
//             view.printAllStudent(students);
//         } else {
//             System.out.println("Список студентов пуст!");
//         }
//     }

// }

// MVP-2 (с границами через интерфейсы)

import java.util.List;

import Controller.Interface.iGetModel;
import Controller.Interface.iGetView;
import Model.Domain.Student;

public class Controller {

    private iGetModel model;
    private iGetView view;

    private List<Student> students;

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> studs) {
        if (studs.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        students = model.getAllStudents();
        if (testData(students)) {
            view.printAllStudent(students);
        } else {
            System.out.println("Список студентов пуст!");
        }
    }

}