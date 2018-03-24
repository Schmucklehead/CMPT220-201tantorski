
public class Problem10_9 {
	public static void main(String[] args) {
		// making the school class
		Course class1 = new Course("English Class");

		// students of the class
		class1.addStudent("Jake");
		class1.addStudent("Bryan");
		class1.addStudent("Sam");

		// remove sam
		class1.dropStudent("Sam");

		// Displays the students in the course
		System.out.println("\nStudents: " + class1.getCourseName());
		String[] students = class1.getStudents();
		for (int i = 0; i < class1.getNumberOfStudents(); i++) {
			System.out.print(students[i] + " ");
		}
		System.out.println();
	}

}
