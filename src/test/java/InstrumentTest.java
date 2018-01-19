import Shop.Instruments.Brass.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {


    Trumpet trumpet;


    @Before

    public void before(){
        trumpet = new Trumpet(
                "Silver Trumpet(3)",
                99.99,
                199.99,
                "Brass",
                "Silver",
                "Silver Plated",
                3
        );


    }

   @Test

   public void canGetCategory(){
        assertEquals("Brass", trumpet.getCategory());
   }

   @Test
   public void canGetValves(){
       assertEquals(3, trumpet.getValves());
   }
}
