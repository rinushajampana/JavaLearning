
public class EvaluationService {

	private int subjectMarks;

	/*
	 * parameterized constructor
	 */
	public EvaluationService(int subjectMarks) {
		// TODO Auto-generated constructor stub
		this.subjectMarks = subjectMarks;
	}

	/*
	 * no-argument constructor
	 */
	public EvaluationService() {

	}

	/*
	 * returns subject marks
	 */
	public int getSubjectMarks() {
		return subjectMarks;
	}

	/*
	 * Sets subject marks
	 */
	public void setSubjectMarks(int subjectMarks) {
		this.subjectMarks = subjectMarks;
	}

	/*
	 * Evaluates Subject Marks
	 */
	public void evaluateSubjectMarks(Integer subjectMarks) {

		if (subjectMarks >= 50) {
			System.out.println("PASS");
		} else
			System.out.println("FAIL");
	}

}
