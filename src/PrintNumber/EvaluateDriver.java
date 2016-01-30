package PrintNumber;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EvaluateDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using Constructor and getter setter methods
		Evaluate evaluate = new Evaluate(5);
		evaluate.evaluateNumber(110);
		evaluate.evaluateNumber(evaluate.getChoice());

		// Scanner
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = sc.nextInt();
		evaluate.evaluateNumber(number);
		// File output Stream
				System.out.println("***Reading from File***");
				try {
					sc = new Scanner(new File("src/Files/numbers.txt"));

					while (sc.hasNext()) {
						int i = sc.nextInt();
						evaluate.evaluateNumber(i);
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
