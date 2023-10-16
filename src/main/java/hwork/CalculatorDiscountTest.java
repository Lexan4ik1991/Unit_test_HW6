package hwork;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class CalculatorDiscountTest {
    @Test
    public void testNormalDiscount() {
        assertThat(Calculator.calculateDiscount(2000, 20)).isEqualTo(1800);
    }

    @Test
    public void testZeroDiscount() {
        assertThat(Calculator.calculateDiscount(2500, 0)).isEqualTo(2500);
    }
    @Test
    public void testZeroSumProducts() {
        assertThat(Calculator.calculateDiscount(0, 50)).isEqualTo(0);
    }

    @Test
    public void testFloatSumProducts() {
        assertThat(Calculator.calculateDiscount(250.5, 50)).isEqualTo(125.25);
    }

    @Test
    public void testBigDiscount() {
        assertThatThrownBy(() -> Calculator.calculateDiscount(2000, 100))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("The discount cannot be less than 90%");
    }

    @Test
    public void testNegativeDiscount() {
        assertThatThrownBy(() -> Calculator.calculateDiscount(1000, -20))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("The discount cannot be less than 0%");
    }
    @Test
    public void testNegativeDiscountAndSumProducts() {
        assertThatThrownBy(() -> Calculator.calculateDiscount(-1000, -20))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("The discount cannot be less than 0%");
    }

    @Test
    public void testNegativeSumProduct() {
        assertThatThrownBy(() -> Calculator.calculateDiscount(-100, 20))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("The purchase amount cannot be less than 0%");
    }
}
