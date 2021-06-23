package sample;

public class ChainigOfMethods {

	String firstName;
	String lastName;
	String fullName;

	public ChainigOfMethods setFirstName(String firstName) {
		this.firstName = firstName;		
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public ChainigOfMethods setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFullName() {
		this.fullName = this.getFirstName()+" "+this.getLastName();
		return fullName;
	}

	public static void main(String[] args) {
		ChainigOfMethods obj1 = new ChainigOfMethods();
		
//		obj1.setFirstName("Raju");
//		obj1.setLastName("Chelle");
//		System.out.println(obj1.getFullName());
		
		System.out.println(obj1.setFirstName("Raju").setLastName("Chelle").getFullName());
		
	}

}
