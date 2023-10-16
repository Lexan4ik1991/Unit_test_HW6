package hwork3Test;

import hwork3.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testEvenOddNumber {
    private Main main;
    @BeforeEach
    public void beforeEach() {
        main = new Main();
    }

    @Test
    public void testEvenNumber() {
        assertTrue(main.evenOddNumber(6));
    }

    @Test
    public void testOddNumber() {
        assertFalse(main.evenOddNumber(7));
    }
}