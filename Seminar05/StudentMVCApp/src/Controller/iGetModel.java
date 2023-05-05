package Controller;

import java.util.List;
import Model.Student;

/** интерфейс для всех любых моделей */
public interface iGetModel {
    public List<Student> getAllStudent();
    void addStudentToRepo(Student student);
    void deleteStudent(long studentID); 
}
