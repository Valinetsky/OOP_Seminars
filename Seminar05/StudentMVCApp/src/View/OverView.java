package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/** Абстрактный класс. Предок для русского View и английского ViewEng */
public abstract class OverView implements iGetView{

    /** Вывод списка студентов */
    public void printAllStudent(List<Student> students)
    {
        /** в абстрактном классе можно и не наполнять метод */
        System.out.println("----------");
        for(Student person :students)
        {
            System.out.println(person);
        }
        System.out.println("XXXXXXXXXX");
    }

    /** Вывод сообщения message и чтение строки из консоли */
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }


}
