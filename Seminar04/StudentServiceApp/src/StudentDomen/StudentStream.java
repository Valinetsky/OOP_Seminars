package StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * класс потока студентов
 */
public class StudentStream implements Iterable<StudentGroup> {
	/**
	 * получение массива групп студентов
	 */
	private List<StudentGroup> studentsGroups;
	/**
	 * название потока
	 */
	private String streamName;
	/**
	 * идентификационный номер потока
	 */
	private long studentStreamId;

	/**
	 * счетчик количества групп
	 */
	private int groupsContains;

	/**
	 * @param name - название потока
	 * @param id   - идентификатор потока
	 */
	public StudentStream(String name, long id) {
		this.streamName = name;
		this.studentStreamId = id;
		this.studentsGroups = new ArrayList<StudentGroup>();
	}

	/**
	 * @return - название потока
	 */
	public String getStreamName() {
		return streamName;
	}

	/**
	 * @return - идентификатор потока
	 */
	public long getStudentStreamId() {
		return studentStreamId;
	}

	/**
	 * @param streamName - присваивание потоку названия (имени)
	 */
	public void setStreamName(String streamName) {
		this.streamName = streamName;
	}

	/**
	 * @return - возврат массива групп
	 */
	public List<StudentGroup> getStudentsGroups() {
		return studentsGroups;
	}

	/**
	 * @param group - добавление группы к потоку
	 */
	public void addGroupToStream(StudentGroup group) {
		this.studentsGroups.add(group);
		this.groupsContains++;
	}

	/**
	 * @return - количество групп в потоке
	 */
	public int getGroupsContains() {
		return this.groupsContains;
	}

	@Override
	public Iterator<StudentGroup> iterator() {
		return new Iterator<StudentGroup>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < studentsGroups.size();
			}

			@Override
			public StudentGroup next() {
				if (!hasNext()) {
					return null;
				}
				return studentsGroups.get(index++);
			}
		};
	}

	@Override
	public String toString() {
		String streamText = new String();
		streamText = String.format("\nПоток студентов %s, №%d, включающий групп: %d\n", this.streamName,
				this.studentStreamId, this.groupsContains);
		for (StudentGroup studentGroup : studentsGroups) {
			streamText = streamText + studentGroup.getGroupName() + "\n" + studentGroup.getStudents() + "\n";
		}
		return streamText;
	}
}
