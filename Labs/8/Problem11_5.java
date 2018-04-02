
public class Problem11_5 {
	public static void main(String[] args) {
		ClassesTaken course1 = new ClassesTaken("Math");
		ClassesTaken course2 = new ClassesTaken("Global Issues");

		course1.addStudent("Jake Tank");
		course1.addStudent("Kyle Brain");
		course1.addStudent("Ernie Daley");

		course2.addStudent("Seth Saracino");
		course2.addStudent("Mike Wallace");

		System.out.println("Number Students in Math: "
			+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");

		System.out.println();
		System.out.print("Number Students in Global Issues: " + course2.getNumberOfStudents());
	}

}
