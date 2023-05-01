import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentStream;
import StudentDomen.User;

public class App {
	public static void main(String[] args) throws Exception {
		User u1 = new User("Сергей", "Иванов", 25);
		Student s1 = new Student("Сергей", "Иванов", 22, (long) 101);
		Student s2 = new Student("Андрей", "Сидоров", 22, (long) 111);
		Student s3 = new Student("Иван", "Петров", 22, (long) 121);
		Student s4 = new Student("Игорь", "Иванов", 23, (long) 301);
		Student s5 = new Student("Даша", "Цветкова", 23, (long) 171);
		Student s6 = new Student("Лена", "Незабудкина", 23, (long) 104);
		Student s7 = new Student("Student07", "StuLastName07", 9, (long) 777);
		Student s8 = new Student("Student08", "StuLastName08", 8, (long) 877);
		Student s9 = new Student("Student09", "StuLastName09", 7, (long) 977);

		List<Student> listStud = new ArrayList<Student>();

		listStud.add(s1);
		listStud.add(s2);
		listStud.add(s3);
		listStud.add(s4);
		listStud.add(s5);
		listStud.add(s6);

		// Создание группы с именем "Group - group"
		StudentGroup group = new StudentGroup("Group - group", listStud, 100);

		List<Student> listStudNewGroup = new ArrayList<Student>();
		listStudNewGroup.add(s7);
		listStudNewGroup.add(s8);
		listStudNewGroup.add(s9);

		// Создание группы с именем "Group - groupNewGroup"
		StudentGroup groupNewGroup = new StudentGroup("Group - groupNewGroup", listStudNewGroup, 10);

		// for (Student stud : group) {
		// System.out.println(stud);
		// }

		// System.out.println("============= после сортировки =============");
		// Collections.sort(group.getStudents());

		// for (Student stud : group) {
		// System.out.println(stud);
		// }

		// System.out.println(u1);
		// System.out.println(s1);
		// System.out.println(group);
		// System.out.println(groupNewGroup);

		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("+++++++ НОВЫЙ ЗАПУСК ++++++");
		System.out.println("+++++++++++++++++++++++++++");

		// Создание потока студентов с именем "MSU"
		StudentStream lomonosov = new StudentStream("MSU", 1);
		// Наполнение потока
		lomonosov.addGroupToStream(group);
		lomonosov.addGroupToStream(groupNewGroup);

		// Вывод потока студентов переопределенным toString
		System.out.println(lomonosov);

		// Вывод содержимого потока студентов перебором элементов в цикле
		for (StudentGroup item : lomonosov) {
			System.out.println(item);
		}

		// Сортировка элементов потока студентов по размеру групп
		Collections.sort(lomonosov.getStudentsGroups());

		System.out.println("After sort");
		// Повторный вывод отсортированных элементов потока студентов
		for (StudentGroup item : lomonosov) {
			System.out.println(item);
		}

	}
}
