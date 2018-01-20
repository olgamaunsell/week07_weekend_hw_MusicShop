import Shop.Accessories.DrumSticks;
import Shop.Accessories.GuitarStrings;
import Shop.Accessories.SheetMusic;
import Shop.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockItemTest {

    private DrumSticks drumSticks;
    private GuitarStrings guitarStrings;
    private SheetMusic violinSheetMusic;

    @Before

    public void before(){
        guitarStrings = new GuitarStrings("Guitar Strings(0.40)", 2.50, 0.40);
        drumSticks = new DrumSticks("Wood Tip Drumsticks", 2.50, "Wood");
        violinSheetMusic = new SheetMusic("Violin Sheet Music", 1.40, InstrumentType.Violin);
    }

    @Test

    public void canGetGuitarStringsDescription(){
        assertEquals("Guitar Strings(0.40)", guitarStrings.getDescription());
    }

    @Test

    public void canGetGuitarStringsGauge(){
        assertEquals(0.40, guitarStrings.getStringGauge(), 0.01);
    }

    @Test
    public void canGetDrumSticksWholesalePrice(){
        assertEquals(2.50, drumSticks.getWholesalePrice(), 0.01);
    }

    @Test
    public void canGetDrumSticksTip(){
        assertEquals("Wood", drumSticks.getTip());
    }

    @Test
    public void canGetViolinSheetMusicsRetailPrice(){

        double markup = violinSheetMusic.calculateMarkup(0.30);
        violinSheetMusic.setRetailPrice(markup);
        assertEquals(1.82, violinSheetMusic.getRetailPrice(), 0.01);
    }

    @Test
    public void canGetViolinSheetMusicInstrumentType(){
        assertEquals(InstrumentType.Violin, violinSheetMusic.getInstrumentType());
    }
}
