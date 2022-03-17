
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void  testMuliply(){
        Mainn main = new Mainn();
        main.multiply(3, 4);
        assertEquals(12,main.multiply(3, 4));

    }

  /*   @Test
   public void testMultiplyFail(){
        XMain main = new XMain();
        main.multiply(3, 4);
        assertEquals(9,main.multiply(3, 4));

    } */
}

