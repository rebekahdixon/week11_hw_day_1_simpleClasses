import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void canPrint(){
        printer.print(3,5);
        assertEquals(85, printer.getPaper());
    }

    @Test
    public void canRefillPaper(){
        printer.refillPrinterPaper();
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void usesTonerWhenPrinting(){
        printer.print(2,4);
        assertEquals(92, printer.getToner());
    }
}
