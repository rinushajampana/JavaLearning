package NumberService;

public class NumberService {

	private int number;

	/*
	 * returns number
	 */
	public int getNumber() {
		// TODO Auto-generated method stub
		return number;
	}

	/*
	 * sets number
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/*
	 * Parameterized constructor
	 */
	public NumberService(int number) {
		super();
		this.number = number;
	}

	/*
	 * Evaluates the number
	 */
	public void evaluateNumber(int number) {
		// TODO Auto-generated method stub
		if (number % 2 != 0) {
			System.out.println("ODD");
		} else
			System.out.println("EVEN");
	}

	/*
	 * Returns sum of two numbers
	 */
	public int addNumbers(int num1, int num2) {
		return num1 + num2;
	}

	/*
	 * Returns difference of two numbers
	 */
	public int subNumbers(int num1, int num2) {
		return num1 - num2;
	}

	/*
	 * Returns Multiplication of two numbers
	 */
	public int mulNumbers(int num1, int num2) {
		return num1 * num2;
	}

	/*
	 * Returns division of two numbers
	 */
	public int divNumbers(int num1, int num2) {
		return num1 / num2;
	}

}
