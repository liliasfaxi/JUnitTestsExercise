import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestFactoriel {
    Factorial fact;
    @BeforeEach
    void setUp() {
        fact = new Factorial();
    }

    @Test
    void factorial() {
        assertEquals(0,fact.factorial(0));

    }
    @Test
    void fact(){
        assertEquals(0,fact.factorial(-1));
        assertEquals(1,fact.factorial(1));
        assertEquals(6,fact.factorial(3));
    }
}
