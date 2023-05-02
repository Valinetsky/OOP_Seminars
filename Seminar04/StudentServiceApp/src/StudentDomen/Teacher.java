package StudentDomen;

public class Teacher extends User {

	private long teacherId;
	private String academicDegree;

	public Teacher(String firstName, String secondName, int age, long l, String academicDegree) {
		super(firstName, secondName, age);
		this.teacherId = l;
		this.academicDegree = academicDegree;
	}

	public long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}

	public String getLevel() {
		return academicDegree;
	}

	public void setLevel(String academicDegree) {
		this.academicDegree = academicDegree;
	}

}
