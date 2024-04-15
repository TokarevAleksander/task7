import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        calc.setNum1(5);
        calc.setNum2(3);
        assertEquals(8, calc.add(), 0.0001);
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        calc.setNum1(5);
        calc.setNum2(3);
        assertEquals(2, calc.subtract(), 0.0001);
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        calc.setNum1(5);
        calc.setNum2(3);
        assertEquals(15, calc.multiply(), 0.0001);
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        calc.setNum1(6);
        calc.setNum2(3);
        assertEquals(2, calc.divide(), 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        calc.setNum1(6);
        calc.setNum2(0);
        calc.divide();
    }

    @Test
    public void testCalculateAddition() {
        Calculator calc = new Calculator();
        calc.setNum1(5);
        calc.setNum2(3);
        assertEquals(8, calc.calculate('+'), 0.0001);
    }

    @Test
    public void testCalculateSubtraction() {
        Calculator calc = new Calculator();
        calc.setNum1(5);
        calc.setNum2(3);
        assertEquals(2, calc.calculate('-'), 0.0001);
    }

    @Test
    public void testCalculateMultiplication() {
        Calculator calc = new Calculator();
        calc.setNum1(5);
        calc.setNum2(3);
        assertEquals(15, calc.calculate('*'), 0.0001);
    }

    @Test
    public void testCalculateDivision() {
        Calculator calc = new Calculator();
        calc.setNum1(6);
        calc.setNum2(3);
        assertEquals(2, calc.calculate('/'), 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateDivisionByZero() {
        Calculator calc = new Calculator();
        calc.setNum1(6);
        calc.setNum2(0);
        calc.calculate('/');
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateInvalidOperation() {
        Calculator calc = new Calculator();
        calc.calculate('%');
    }
}
