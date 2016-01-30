package NumberService;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTest {

	NumberService service = new NumberService();

	// *****************************Add Test
	// cases******************************//
	@Test

	public void addPositive() {
		int expected = 7;
		assertEquals(expected, service.addNumbers(3, 4), 0);
	}

	@Test
	public void addNegative() {
		int expected = -20;
		assertEquals(expected, service.addNumbers(-10, -10), 0);
	}

	@Test
	public void addPositiveNegative() {
		int expected = -6;
		assertEquals(expected, service.addNumbers(-10, 4), 0);
	}

	// *****************************Subtraction Test
	// cases******************************//
	public void subPositive() {
		int expected = 1;
		assertEquals(expected, service.subNumbers(3, 2), 0);
	}

	@Test
	public void subNegative() {
		int expected = 0;
		assertEquals(expected, service.subNumbers(-10, -10), 0);
	}

	@Test
	public void subPositiveNegative() {
		int expected = -14;
		assertEquals(expected, service.subNumbers(-10, 4), 0);
	}

	// *****************************MultiPlication Test
	// cases******************************//
	public void mulPositive() {
		int expected = 12;
		assertEquals(expected, service.mulNumbers(3, 4), 0);
	}

	@Test
	public void mulNegative() {
		int expected = 100;
		assertEquals(expected, service.mulNumbers(-10, -10), 0);
	}

	@Test
	public void mulPositiveNegative() {
		int expected = -40;
		assertEquals(expected, service.mulNumbers(-10, 4), 0);
	}

	@Test
	public void mulByZero() {
		int expected = 0;
		assertEquals(expected, service.mulNumbers(-10, 0), 0);
	}

	// *****************************Division Test
	// cases******************************//
	public void divPositive() {
		double expected = 5.25;
		assertEquals(expected, service.divNumbers(21, 4), 0);
	}

	@Test
	public void divNegative() {
		double expected = 1.0;
		assertEquals(expected, service.divNumbers(-10, -10), 0);
	}

	@Test
	public void divPositiveNegative() {
		double expected = -2.5;
		assertEquals(expected, service.divNumbers(-10, 4), 0);
	}

	public void divByZero() {

		try {
			service.divNumbers(2, 0);

		} catch (ArithmeticException e) {
		}

	}
}
