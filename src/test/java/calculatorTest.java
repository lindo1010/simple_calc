import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatorTest {

    @Test
    public void addNumber(){
        calculator calc = new calculator();
        assertEquals(3,calc.add(3));
    }

    @Test
    public void addTwoNumbers(){
        calculator calc = new calculator();
        assertEquals(3,calc.add(1,2));
    }

    @Test
    public void addNegativeNumbers(){
        calculator calc = new calculator();
        assertEquals(-2,calc.add(-1,-1));
    }

    @Test
    public void addMultipleNumbers(){
        calculator calc = new calculator();
        assertEquals(15,calc.add(1,2,3,4,5));
    }

    @Test
    public void multipleTwoNumbers(){
        calculator calc = new calculator();
        assertEquals(3,calc.multiply(1,3));
    }

    @Test
    public void multipleNegativeNumbers(){
        calculator calc = new calculator();
        assertEquals(-3,calc.multiply(-1,3));
    }

    @Test
    public void multipleMultipleNumbers(){
        calculator calc = new calculator();
        assertEquals(120,calc.multiply(1,2,3,4,5));
    }
}
