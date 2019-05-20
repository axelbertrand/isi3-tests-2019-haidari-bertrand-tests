import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Fizz Buzz Tests 😇")
class FizzBuzzTest {

    private FizzBuzz main;


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
    @DisplayName("should display numbers according to rules")
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testFizzBuzz(int length) {
        main = new FizzBuzz(length);

        List<String> fizzBuzz = main.fizzBuzz();
        fizzBuzz.stream().forEach(System.out::println);
        for(int i = 0; i < length; i++) {
            if(i == 42) {
                assertEquals("La grande question sur la vie, l'univers et le reste", fizzBuzz.get(i));
            }
            else if(i % 3 == 0) {
                assertEquals("Fizz", fizzBuzz.get(i));
            }
            else if(i % 3 == 0 && i % 5 == 0) {
                assertEquals("Fizz Buzz", fizzBuzz.get(i));
            }
            else if(i % 5 == 0) {
                assertEquals("Buzz", fizzBuzz.get(i));
            }
            else if(i % 7 == 0) {
                assertEquals("It's a trap", fizzBuzz.get(i));
            }
            else {
                assertEquals(i, Integer.parseInt(fizzBuzz.get(i)));
            }
        }
    }

    @ParameterizedTest
    @DisplayName("should display \"Fizz\" for multiples of 3")
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testFizzBuzzModulo3(int length) {
        main = new FizzBuzz(length);

        List<String> fizzBuzz = main.fizzBuzz();
        for(int i  = 0; i < length; i++) {
            if(i % 3 == 0 && i != 42) {
                assertEquals("Fizz", fizzBuzz.get(i));
            }
        }
    }

    @ParameterizedTest
    @DisplayName("should display \"Buzz\" for multiples of 5")
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testFizzBuzzModulo5(int length) {
        main = new FizzBuzz(length);

        List<String> fizzBuzz = main.fizzBuzz();
        for(int i  = 0; i < length; i++) {
            if(i % 5 == 0 && i % 3 != 0 && i % 7 != 0) {
                assertEquals("Buzz", fizzBuzz.get(i));
            }
        }
    }

    @ParameterizedTest
    @DisplayName("should display \"Fizz Buzz\" for multiples of 3 and 5")
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testFizzBuzzModulo3and5(int length) {
        main = new FizzBuzz(length);

        List<String> fizzBuzz = main.fizzBuzz();
        for(int i  = 0; i < length; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                assertEquals("Fizz Buzz", fizzBuzz.get(i));
            }
        }
    }

    @ParameterizedTest
    @DisplayName("should display \"It's a trap\" for multiples of 7")
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testFizzBuzzModulo7(int length) {
        main = new FizzBuzz(length);

        List<String> fizzBuzz = main.fizzBuzz();
        for(int i  = 0; i < length; i++) {
            if(i % 7 == 0) {
                assertEquals("It's a trap", fizzBuzz.get(i));
            }
        }
    }

    @ParameterizedTest
    @DisplayName("should display \"La grande question sur la vie, l'univers et le reste\" for 42")
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testFizzBuzz42(int length) {
        main = new FizzBuzz(length);

        List<String> fizzBuzz = main.fizzBuzz();
        for(int i  = 0; i < length; i++) {
            if(i == 42) {
                assertEquals("La grande question sur la vie, l'univers et le reste", fizzBuzz.get(i));
            }
        }
    }
}