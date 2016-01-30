package package3;

public class Person {

	private String name;
	private String email;
	private char gender;
	
	/* Constructor of the Person class
	 * @param Persons name
	 * @param Email address of the person
	 * @param Gender of the person	 
	 */
	public Person(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
/*
 * @return Returns name of the person
 */
	public String getName() {
		return name;
	}
/*
 * @return Return persons Email address
 */
	public String getEmail() {
		return email;
	}
/*
 * Returns gender of the person
 */
	public char getGender() {
		return gender;
	}
/*
 * Sets persons email address
 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/*
	 * 
	 * @Override Prints out person information
	 */
	public String toString()
	{
	String str = name+" ("+gender+") at "+email;	
	return str;	
	}
}
