import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Fizz Buzz Tests 😇")
class FizzBuzzTest {

    private FizzBuzz main;
    private List<String> fizzBuzz;

    @BeforeEach
    void setUp() {
        main = new FizzBuzz(100);
        fizzBuzz = main.fizzBuzz();
    }

    @ParameterizedTest
    @DisplayName("should have list of integer of size length")
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testListBuild(int length) {
        main = new FizzBuzz(length);
        assertEquals(main.getIntegerList().count(), length);
    }

    @Test
    @DisplayName("should verify length positiv sign")
    void testNegativeLength() {
        assertThrows(AssertionError.class, () -> main = new FizzBuzz(-1));
    }

    @ParameterizedTest
    @DisplayName("should display \"Fizz\" for multiples of 3")
    @ValueSource(ints = { 0, 3, 15, 21, 66, 99 })
    void testFizzBuzzModulo3(int n) {
        assertEquals("Fizz", fizzBuzz.get(n));
    }

    @ParameterizedTest
    @DisplayName("should display \"Buzz\" for multiples of 5")
    @ValueSource(ints = { 5, 10, 25, 50, 70, 95 })
    void testFizzBuzzModulo5(int n) {
        assertEquals("Buzz", fizzBuzz.get(n));
    }

    @ParameterizedTest
    @DisplayName("should display \"Fizz Buzz\" for multiples of 3 and 5 (should never happen because modulo 3 is before)")
    @ValueSource(ints = { 0, 15, 45, 75 })
    void testFizzBuzzModulo3and5(int n) {
        assertNotEquals("Fizz Buzz", fizzBuzz.get(n));
    }

    @ParameterizedTest
    @DisplayName("should display \"It's a trap\" for multiples of 7")
    @ValueSource(ints = { 7, 14, 28, 49, 56, 77 })
    void testFizzBuzzModulo7(int n) {
        assertEquals("It's a trap", fizzBuzz.get(n));
    }

    @Test
    @DisplayName("should display \"La grande question sur la vie, l'univers et le reste\" for 42")
    void testFizzBuzz42() {
        assertEquals("La grande question sur la vie, l'univers et le reste", fizzBuzz.get(42));
    }
}