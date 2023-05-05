package Model;

import java.util.List;

import Controller.iGetModel;

public class Model implements iGetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    /** возврат списка всех студентов */
    public List<Student> getAllStudent()
    {
        return students;
    }

    /** добавление студента */
    @Override
    public void addStudentToRepo(Student student) {
        students.add(student);
    }

    /** удаление студента */
    @Override
    public void deleteStudent(long studentID) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID() == studentID) {
                students.remove(i);
            }
        }
    }
}
