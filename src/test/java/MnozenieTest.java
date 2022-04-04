import org.junit.Test;

import static org.junit.Assert.*;

public class MnozenieTest {

    @Test
    public void mnozenie() {
        Mnozenie mnozenie=new Mnozenie();
        assertEquals(25,mnozenie.mnoze(5,5));
    }

}