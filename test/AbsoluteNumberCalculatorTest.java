import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class AbsoluteNumberCalculatorTest {

	@Test
	@DisplayName("Number zero")
	void testFindAbsolute0() {
		int number = 0;
		int expected = 0;

		int result = AbsoluteNumberCalculator.findAbsolute(number);
		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Number > 0")
	void testFindAbsolute1() {
		int number = 1;
		int expected = 1;

		int result = AbsoluteNumberCalculator.findAbsolute(number);
		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Number < 0")
	void testFindAbsoluteNegative1() {
		int number = -1;
		int expected = 1;

		int result = AbsoluteNumberCalculator.findAbsolute(number);
		assertEquals(expected, result);
	}
}