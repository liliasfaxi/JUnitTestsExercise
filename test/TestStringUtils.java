import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestStringUtils {

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll - Execute once before all test methods in this class.");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach - Executed before each test method in this class.");
    }

    @DisplayName("Test add user successfully.")
    @Test
    void testAddUserSuccess() {
        System.out.println("Test add user successfully");

    }

    @DisplayName("Test add user with passed argument is null.")
    @Test
    void testAddUserNull() {
        System.out.println("Test add null user.");

    }

    @Test
    @Disabled("Not implemented yet.")
    void testDeleteUser() {}

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach - This method is called after each test method.");

    }

    @AfterAll
    static void done() {
        System.out.println("@AfterAll - This method is called after all test methods.");
    }

    @Test
    public void testConvertToDoubleOK() {
        // Test case with the age is a numeric string
        String age = "1990";
        Double expAge = 22.2; //Double.valueOf(age);
        Double actual = StringUtils.convertToDouble(age);

        assertAll("Do many assertions.", () -> {
            assertNotNull(actual);
            assertEquals(expAge, actual);
        });

        // Or Java 8 Lambdas style

        assertAll("Do many assertions.Java 8 Lambdas style", () -> {
            assertNotNull(actual, () -> "The actual is NULL");
            assertEquals(expAge, actual,
                    () -> "The expected is: " + expAge + " while the actual is:" + actual);
        });

    }
}
