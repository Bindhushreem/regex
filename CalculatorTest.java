import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calc =new Calculator();

    @Test
    @DisplayName("assert equal testing")
    void add() {
        Assertions.assertEquals(4,calc.add(2,2));
        Assertions.assertNotEquals(3,calc.add(2,2));
    }



    @Test
    @DisplayName("Assert Exception Test")
    public void assertException(){
        Assertions.assertThrows(ArithmeticException.class,()->calc.div(1,0));

    }
    @Test
    @DisplayName("Assert Alll Test")
    public void assertAllTest(){
        Assertions.assertAll(
                ()->Assertions.assertEquals(4,calc.add(1,3)),
                ()->Assertions.assertEquals(2,calc.add(-1,3)),
                ()->Assertions.assertEquals(-4,calc.add(-1,-3)),
                ()->Assertions.assertEquals(1,calc.add(1,0))
        );
    }





}