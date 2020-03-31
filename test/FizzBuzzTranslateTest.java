import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @DisplayName("Test with 1")
    @Test
    void translate() {
        int number = 1;
        String expectedResult = "N/A";
        String actualResult = FizzBuzzTranslate.translate(number);
        assertEquals(expectedResult,actualResult);
    }
}