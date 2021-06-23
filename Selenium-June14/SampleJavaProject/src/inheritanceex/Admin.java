package inheritanceex;

public class Admin extends CollegeData{
	String adminName = "Siva";
	
	void displayAdminDetails() {
		System.out.println("Admin Name:"+adminName);
	}
	
	public static void main(String[] args) {
		Admin admin1 = new Admin();
//		admin1.displayAdminDetails();
//		admin1.displayfacultyDetails();	
//		admin1.colleName = "Engineering college";
////		faculty1.UNIVERSITY_NAME = "Andhra Uni";
//		admin1.displayCollegDetails();
		
		System.out.println(CollegeData.UNIVERSITY_NAME);
		System.out.println(admin1.colleName);
	}

}
