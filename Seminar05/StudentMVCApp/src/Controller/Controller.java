package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.jws.WebParam.Mode;

import Model.Student;
import Model.Model;
import View.View;

/** Класс взаимодействия с Model и View */
public class Controller {

    /**
     * список студентов
     */
    private List<Student> students; 
    
    private iGetView view;
        
    private iGetModel model;

    /**
     * @param view - доступ к view через интерфейс iGetView
     * @param model - доступ к model через интерфейс iGetModel
     */
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    } 

    /**
     * получение списка студентов
     */
    public void getAllStudent()
    {
        students = model.getAllStudent();
    }

    /**
     * @return - true, если в списке есть студент(ы)
     */
    public boolean testData()
    {
        if(students.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * собственно - updateView
     */
    public void updateView()
    {
        //MVP
        getAllStudent();
        if(testData())
        {
            view.printAllStudent(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }
        
        //MVC
        //view.printAllStudent(model.getAllStudent());
    }

    /**
     * главный цикл
     */
    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            System.out.println("****************");
            System.out.println("Список реализованных команд: LIST, CREATE, DELETE, EXIT");

            String command = view.prompt("Введите команду: ");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudent();
                    updateView();
                    break;
            
                // добавлен метод
                case DELETE:
                    System.out.println("Введите ID студента для удаления: ");
                    Scanner num = new Scanner(System.in);
                    Long studentId = num.nextLong();
                    model.deleteStudent(studentId);
                    break;

                // добавлен метод
                case CREATE:
                    Scanner stud = new Scanner(System.in);
                    System.out.println("Введите имя студента: ");
                    String firstName = stud.next();
                    System.out.println("Введите фамилию студента: ");
                    String secondName = stud.next();
                    System.out.println("Введите возраст студента: ");
                    int age = Integer.parseInt(stud.next());
                    System.out.println("Введите ID студента: ");
                    long ID = Long.parseLong(stud.next());
                    Student newStudent = new Student(firstName, secondName, age, ID);
                    model.addStudentToRepo(newStudent);
                    break;
            }
        }
    }
}
