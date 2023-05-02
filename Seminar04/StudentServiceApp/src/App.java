import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentStream;
import StudentDomen.Teacher;
import StudentService.AverageAge;

public class App {
	public static void main(String[] args) throws Exception {
		// User u1 = new User("Сергей", "Иванов", 25);
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

		Emploee person1 = new Emploee("Иванов", "Олег", 55, 110);
		List<Emploee> listEmploee = new ArrayList<Emploee>();
		listEmploee.add(person1);
		// Student s1 = new Student("Сергей", "Иванов", 22, (long) 101);

		// EmploeeController contrEmp = new EmploeeController();
		EmploeeController.paySalary(person1);
		// contrEmp.paySalary(s1);

		Integer studHour[] = { 124, 234, 231, 1, 45 };
		System.out.println(EmploeeController.mean(studHour));

		Double emplSalary[] = { 12555.23, 34213.5, 10000.0 };
		System.out.println(EmploeeController.mean(emplSalary));

		// System.out.println(u1);
		// System.out.println(s1);
		// System.out.println(group);

		Teacher t1 = new Teacher("Teacher01", "TeacherLastName01", 33, (long) 777, "phd");
		Teacher t2 = new Teacher("Teacher02", "TeacherLastName02", 28, (long) 567, "phd");
		Teacher t3 = new Teacher("Teacher03", "TeacherLastName03", 30, (long) 765, "phd");
		Teacher t4 = new Teacher("Teacher04", "TeacherLastName04", 31, (long) 111, "phd");
		Teacher t5 = new Teacher("Teacher05", "TeacherLastName05", 25, (long) 222, "phd");

		List<Teacher> listTeacher = new ArrayList<Teacher>();

		listTeacher.add(t1);
		listTeacher.add(t2);
		listTeacher.add(t3);
		listTeacher.add(t4);
		listTeacher.add(t5);

		System.out.println();
		System.out.println("Average age of students in group: Group - groupNewGroup");
		AverageAge.getAverageAge(groupNewGroup.getStudents());

		System.out.println();
		System.out.println("Average age of teachers");
		AverageAge.getAverageAge(listTeacher);

		System.out.println();
		System.out.println("Average age of emploee");
		AverageAge.getAverageAge(listEmploee);

	}
}
