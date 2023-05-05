package View;

import java.util.List;
import Model.Student;

public class View extends OverView {

    /** переопределение вывода для русской версии */
    @Override
    public void printAllStudent(List<Student> students)
    {
        System.out.println("-----Вывод списка студентов-----");
        for(Student person :students)
        {
            System.out.println(person);
        }
        System.out.println("-----Конец списка-----");
    }
}
