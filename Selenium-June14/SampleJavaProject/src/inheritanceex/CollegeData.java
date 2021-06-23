package inheritanceex;

public class CollegeData {
	final static String UNIVERSITY_NAME = "JNTU";
	String colleName = "Law College";
	int collegeCode = 12345;
	
	void displayCollegDetails(){
		System.out.println("University Name:"+UNIVERSITY_NAME);
		System.out.println("College Name:"+colleName);
		System.out.println("College Code:"+collegeCode);
	}

}
