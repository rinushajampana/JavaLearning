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
	}

}
