package calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    static void setup() {
        System.out.println("Inizio dei test");
    }

    @BeforeEach
    void setupCalculator() {
        calculator = new Calculator();
        System.out.println("---------------");
    }

    @Test
    @DisplayName("Addizione - Numeri +")
    void testAdd() {
        float result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Addizione - Numeri -")
    void testAddNegative() {
        float result = calculator.add(2, -3);
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("Sottrazione - Numeri +")
    void testSubtract() {
        float result = calculator.subtract(5, 2);
        assertEquals(3, result);
    }

    @Test
    @DisplayName("Sottrazione - Numeri -")
    void testSubtractNegative() {
        float result = calculator.subtract(5, -2);
        assertEquals(7, result);
    }

    @Test
    @DisplayName("Sottrazione - Numeri +")
    void testSubtractNegativeResult() {
        float result = calculator.subtract(-5, -2);
        assertEquals(-3, result);
    }
    @Test
    @DisplayName("Divisione")
    void testDivide() {
        float result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Divisione")
    void testDivideImpossible() {
        assertThrows(
                IllegalArgumentException.class, //tipo di eccezione
                () -> calculator.divide(7, 0) //eseguo il metodo passando dati errati
        );
    }

    @Test
    @DisplayName("Moltiplicazione - Numeri +")
    void testMultiply() {
        float result = calculator.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    @DisplayName("Moltiplicazione - Numeri -")
    void testMultiplyNegative() {
        float result = calculator.multiply(2, -3);
        assertEquals(-6, result);
    }
    @AfterAll
    static void end() {
        System.out.println("Fine dei test");
    }
}