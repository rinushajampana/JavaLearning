package NumberService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberServiceTest {

	/*
	 * Setting the value using the constructor Invoking getter and setter
	 * methods Input from System using Scanner class
	 */

	public static void main(String[] args) {

		// Using constructor and getter, setter methods

		NumberService service = new NumberService(2);
		service.evaluateNumber(service.getNumber());

		// Scanner
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = sc.nextInt();
		service.evaluateNumber(number);

		// File output Stream
		
		try {
			//********* Unable to run to : getting a FileNotFound Exception ******//
			sc = new Scanner(new File("Files/Numbers.txt"));

			while (sc.hasNext()) {
				int i = sc.nextInt();
				service.evaluateNumber(i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
