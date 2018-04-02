import java.util.ArrayList;

public class ClassesTaken {

	private String courses;
	private ArrayList<String> students;
	// Constructor
	public ClassesTaken(String courseName) {
		this.courses = courseName;
		students = new ArrayList<String>();
	}
	// Methods
	public void addStudent(String student) {
		students.add(student);
	}
	public String[] getStudents() {
		String[] a = new String[students.size()];
		return students.toArray(a);
	}
	public int getNumberOfStudents() {
		return students.size();
	}
	public String getCourseName() {
		return courses;
	}
	public void dropStudent(String student) {
		students.remove(student);
	}
}


