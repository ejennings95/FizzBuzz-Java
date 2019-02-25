import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

        private final FizzBuzz fizzbuzz = new FizzBuzz();

        @Test
        void testOne() {
            assertEquals(1, fizzbuzz.output(1));
        }

    }