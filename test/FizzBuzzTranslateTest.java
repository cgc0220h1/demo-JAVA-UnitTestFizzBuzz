import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @DisplayName("Test with 1")
    @Test
    void testTranslateCase1() {
        int number = 1;
        String expectedResult = "N/A";
        String actualResult = FizzBuzzTranslate.translate(number);
        assertEquals(expectedResult,actualResult);
    }

    @DisplayName("Test with 9")
    @Test
    void testTranslateCase2() {
        int number = 9;
        String expectedResult = "Fizz";
        String actualResult = FizzBuzzTranslate.translate(number);
        assertEquals(expectedResult,actualResult);
    }

    @DisplayName("Test with 15")
    @Test
    void testTranslateCase3() {
        int number = 15;
        String expectedResult = "Buzz";
        String actualResult = FizzBuzzTranslate.translate(number);
        assertEquals(expectedResult,actualResult);
    }
}