package package3;

public class TestCourse {

	public static void main(String args[])
	{
	Professor p = new Professor("ram", "abc@gmail.com", 'M');
	
	
	Course c = new Course("JAVA",p,200.0, 100);
	System.out.println(c);
	System.out.println("Price :"+c.getPrice());
	c.setPrice(10000);
	c.setQty(800);
	System.out.println("Price-Changed using setter method :"+c.getPrice());
	
	}
}
