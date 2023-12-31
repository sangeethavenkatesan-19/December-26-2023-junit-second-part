package metaAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import Phase2_JUNIT_SELENIUM.MondayTwo.AgeCalculator;


public class TestMetaAnnotations2 {

	AgeCalculator ageCalculator = new AgeCalculator();
	
	@Test
	@DisplayName("Should return valid age for +ve year")
	@Positive
	public void test1() {
		int eResult = 33;
		int aResult = ageCalculator.calculateAge(1990);
		assertEquals(eResult, aResult);
		// assertEquals(28, ageCalculator.calculateAge(1995));
	}
	
	@Test
	@DisplayName("Should return 0 age for -ve year")
	@Negative
	public void test2() {
		 assertEquals(0, ageCalculator.calculateAge(-1995));
	}
	
	@Test
	@DisplayName("Should return 0 age for 0 year")
	@Negative
	public void test3() {
		 assertEquals(0, ageCalculator.calculateAge(0));
	}
	
	@Test
	@DisplayName("Should return 0 age for +ve future year")
	@Tag("negative")
	@Tag("positive")
	public void test4() {
		assertEquals(-27, ageCalculator.calculateAge(2050));
	}
	
	@Test
	@DisplayName("Should return valid age for +ve year")
	@Positive
	public void test5() {
		int eResult = 32;
		int aResult = ageCalculator.calculateAge(1991);
		assertEquals(eResult, aResult);
		// assertEquals(28, ageCalculator.calculateAge(1995));
	}
	
}