import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

        private final FizzBuzz fizzbuzz = new FizzBuzz();

        @Test
        void testOne() {
            assertEquals("1", fizzbuzz.output(1));
        }

        @Test
        void testTwo() {
            assertEquals("Fizz", fizzbuzz.output(3));
        }

        @Test
        void testThree() {
            assertEquals("Buzz", fizzbuzz.output(5));
        }

        @Test
        void testFour() {
            assertEquals("FizzBuzz", fizzbuzz.output(15));
        }

    }