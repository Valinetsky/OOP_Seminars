package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/** 
 * расширение класса Model
 * принимает список студентов, переливает его в HashMap:
 * то есть, если в списке были студенты с одинаковым ID,
 * в HashMap попадет только последний (попадет каждый,
 * но будет замещен последующим, с таким же ID)
 */
public class ModelHashMap extends Model {

    private HashMap<Long, Student> studentsMap;

    /**
     * @param students - список студентов для создания HashMap
     */
    public ModelHashMap(List<Student> students) {
        super(students);
        this.studentsMap = new HashMap<>();
        for (Student person : students) {
            studentsMap.put(person.getStudentID(), person);
        }
    }

    public List<Student> getAllStudent() {
        List<Student> studentsList = new ArrayList<Student>(studentsMap.values());
        return studentsList;
    }

    public void addStudentToRepo(Student student) {
        studentsMap.put(student.getStudentID(), student);        
        }

    public void deleteStudent(long studentID) {
        // Ищем студента в HashMap по ID
        Student student = studentsMap.get(studentID);
        if (student == null) {
            System.out.println("В списке нет студента с таким ID");
        }
        if (student != null) {
            studentsMap.remove(studentID);
            System.out.println("Cтудент удален из списка");
        }
    }
}
