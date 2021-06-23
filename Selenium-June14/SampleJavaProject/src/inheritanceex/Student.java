package inheritanceex;

public class Student extends CollegeData{

	String studentName = "Ram";
	int studentRollNo = 1123;

	void displayStudentDetails() {
		System.out.println("Student Name:" + studentName);
		System.out.println("Student Roll No:" + studentRollNo);
	}
	
	public static void main(String[] args) {
		Student studen1 = new Student();
		studen1.displayCollegDetails();
		
	}
	

}
