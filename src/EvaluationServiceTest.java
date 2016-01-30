import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EvaluationServiceTest {

	/*
	 * Setting the value using the constructor Invoking getter and setter
	 * methods Input from System, using Scanner class
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// **Constructor**
		EvaluationService service = new EvaluationService(2);
		service.evaluateSubjectMarks(service.getSubjectMarks());
		service.setSubjectMarks(80);
		System.out.println(service.getSubjectMarks());
		service.evaluateSubjectMarks(service.getSubjectMarks());
		// **Scanner**
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = sc.nextInt();
		service.evaluateSubjectMarks(number);
	try {
		sc = new Scanner(new File("src/Files/numbers.txt"));
		System.out.println("***Reading from File***");
		
		while (sc.hasNext()) {
			int i = sc.nextInt();
			service.evaluateSubjectMarks(i);;
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}
