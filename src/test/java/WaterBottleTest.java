import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle(100);
    }

    @Test
    public void removes10WhenUsed(){
        assertEquals(90, bottle.remove10WhenUsed());
    }

    @Test
    public void emptiesWaterBottle(){
        bottle.emptyWaterBottle();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void fillsWaterBottle(){
        bottle.fillWaterBottle();
        assertEquals(100, bottle.getVolume());
    }
}
