
public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numOfStu;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numOfStu] = student;
		numOfStu++;
		 
	}
	//getters
	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numOfStu;
	}

	public String getCourseName() {
		return courseName;
	}

	
	public void dropStudent(String student) {
		int index = findStudent(student);
		//find student index and removes from roster
		if (index >= 0) {
			dropStudent(index);
		}
		else {
			System.out.println(student + " is not in the course: " + courseName);
		}
	}

	
	private void dropStudent(int index) {
		String[] s = new String[students.length - 1];
		for (int i = 0, j = 0; i < s.length; i++, j++) {
			if (i == index) {
				j++;
			}
			s[i] = students[j];
		}
		this.students = s;
		numOfStu--;
	}

	//new roster
	public void clear() {
		students = new String[1];
		numOfStu = 0;
	}
	//find index of student 
	private int findStudent(String student) {
		for (int i = 0; i < numOfStu; i++) {
			if (students[i].equals(student)) {
				return i;
			}
		}
		return -1;
	}
}