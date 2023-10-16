package hwork3Test;
import hwork3.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class NumberInIntervalTest {


    public static class testNumberInInterval {

        private Main main;

        @BeforeEach
        public void beforeEach() {
            main = new Main();
        }

        @Test
        public void testInInterval() {
            assertTrue(main.numberInInterval(26));
        }

        @Test
        public void testNotInInterval() {
            assertFalse(main.numberInInterval(0));
        }
    }
}