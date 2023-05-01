package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * класс студенческой группы
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
	/**
	 * название группы
	 */
	private String groupName;
	/**
	 * массив студентов
	 */
	private List<Student> students;
	/**
	 * идентификационный номер группы
	 */
	private long groupID;

	/**
	 * @param groupName - название группы
	 * @param students  - массив студентов
	 * @param id        - идентификационный номер группы
	 */
	public StudentGroup(String groupName, List<Student> students, long id) {
		this.groupName = groupName;
		this.students = students;
		this.groupID = id;
	}

	// public StudentGroup(List<Student> students) {
	// this.students = students;
	// }

	/**
	 * @param students - массив студентов
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	// ==========================================================
	/**
	 * @return - название группы
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @return - идентификационный номер группы
	 */
	public long getGroupID() {
		return groupID;
	}

	/**
	 * @return - количество студентов в группе
	 */
	public long getGroupSize() {
		return this.students.size();
	}

	/**
	 * @param groupName - назначение названия группы
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * @return - массив студентов
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * @param student - добавление студента в массив студентов
	 */
	public void addStudentToGroup(Student student) {
		this.students.add(student);
	}
	// ==========================================================

	// @Override
	// public Iterator<Student> iterator() {
	// return new StudentGroupIterator(students);
	// }

	@Override
	public Iterator<Student> iterator() {
		return new Iterator<Student>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < students.size();
			}

			@Override
			public Student next() {
				if (!hasNext()) {
					return null;
				}
				// counter++;
				return students.get(index++);
			}

		};
	}

	@Override
	public String toString() {
		System.out.printf("Group #%d %s\n", this.groupID, this.groupName);
		for (Student student : students) {
			System.out.println(student);
		}
		return String.format("> Count of members: %d\n", students.size());
	}

	/**
	 * метод сравнения групп по количеству студентов
	 */
	@Override
	public int compareTo(StudentGroup o) {
		if (this.getGroupSize() == o.getGroupSize()) {
			return 0;
		}
		if (this.getGroupSize() < o.getGroupSize()) {
			return -1;
		}
		return 1;
	}
}
