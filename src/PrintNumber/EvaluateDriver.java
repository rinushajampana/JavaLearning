package PrintNumber;

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
	}

}
