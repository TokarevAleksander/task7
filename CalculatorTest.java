import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class task_7 {
    
    // Тест для метода сложения
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.add(2.0, 3.0)); // Проверяем, что результат сложения 2 и 3 равен 5
    }
    
    // Тест для метода вычитания
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.subtract(5.0, 3.0)); // Проверяем, что результат вычитания 5 и 3 равен 2
    }
    
    // Тест для метода умножения
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6.0, calculator.multiply(2.0, 3.0)); // Проверяем, что результат умножения 2 на 3 равен 6
    }
    
    // Тест для метода деления
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(6.0, 3.0)); // Проверяем, что результат деления 6 на 3 равен 2
    }
    
    // Тест для деления на ноль
    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(6.0, 0.0); // Проверяем, что при делении на ноль выбрасывается исключение ArithmeticException
        });
    }
}
