package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;

public class TeacherService implements iUserService<Teacher> {
	private int count;
	private List<Teacher> teachers;

	public TeacherService() {
		this.teachers = new ArrayList<>();
	}

	@Override
	public void create(String firstName, String secondName, int age) {
		Teacher teach = new Teacher(firstName, secondName, age, count, "");
		count++;
		teachers.add(teach);

	}

	@Override
	public List<Teacher> getAll() {
		return teachers;
	}

	public List<Teacher> getSortedByFIOStudentGroup(int numberGroup) {
		List<Teacher> teach = new ArrayList<>(teachers);
		teach.sort(new UserComparator<Teacher>());
		return teach;
	}

}
