import static java.lang.System.*;

class Student {
	String name;
	int credits;
	double gpa;
}

public class StudentDatabase {
	public static void main(String [] args) throws Exception {
		Student[] db;
		db = new Student[3];

		db[0] = new Student();
		db[0].name = "Esteban";
		db[0].credits = 43;
		db[0].gpa = 2.9;

		db[1] = new Student();
		db[1].name = "Dave";
		db[1].credits = 15;
		db[1].gpa = 4.0;

		db[2] = new Student();;
		db[2].credits = 132;
		db[2].gpa = 3.72;

		for (int i = 0; i < db.length; i++) {
			out.println("Name: " + db[i].name);
			out.println("Credits: " + db[i].credits);
			out.println("GPA: " + db[i].gpa);
		}

		int max = 0;

		for (int i = 1; i < db.length; i++)
			if (db[i].gpa > db[max].gpa)
				max = i;

		out.println(db[max].name + " has the highest GPA.");
	}
}