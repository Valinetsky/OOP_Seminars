package Controller;

import java.util.List;
import Model.Student;

/** интерфейс для всех любых вью */
public interface iGetView {
    void printAllStudent(List<Student> students);
    String prompt(String message);
}
