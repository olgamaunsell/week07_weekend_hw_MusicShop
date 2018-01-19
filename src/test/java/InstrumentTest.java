import Shop.Instruments.Brass.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {


    Trumpet trumpet;


    @Before

    public void before(){
        trumpet = new Trumpet("Brass", "Silver", "Silver Plated");

    }

   @Test

    public void canGetCategory(){
        assertEquals("Brass", trumpet.getCategory());
   }
}
