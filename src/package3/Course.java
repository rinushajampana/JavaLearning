package package3;

public class Course {

	private String name;
	Professor person;
	private double price;
	private int qty;
	
	/*
	 * Constructor of the course class
	 * @param Name of the course
	 * @param Professor associated with the course
	 * @param Price for the course
	 * 
	 */
	public Course (String name, Professor person, double price) {
		this.name = name;
		this.person = person;
		this.price = price;
		}
	/*
	 * Constructor of the Course class
	 * @param Name of the course
	 * @param Professor associated with the course
	 * @param Price for the course
	 * @param quantity for the course
	 */
	public Course (String name, Professor person, double price,int qty) {
		this.name = name;
		this.person= person;
		this.price = price;
		this.qty = qty;
	}

	/*
	 * Gets the name of the course
	 * @return Returns course name
	 */
	public String getName() {
		return name;
	}
	/*
	 * Gets the Professor details of that course
	 * @return Returns the professors details
	 */
	public Professor getPerson() {
		return person;
	}
/*
 * gets the price
 */
	public double getPrice() {
		return price;
	}
/*
 * gets the quantity
 */
	public int getQty() {
		return qty;
	}
/*
 * sets price value
 */
	public void setPrice(double price) {
		this.price = price;
	}
/*
 * Sets quatity
 */
	public void setQty(int qty) {
		this.qty = qty;
	}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		
		String str = name+"-"+person.toString();
		return str;
	}

	
}

