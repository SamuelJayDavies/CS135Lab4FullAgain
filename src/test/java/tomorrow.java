import static org.junit.Assert.*;

import org.junit.Test;

public class tomorrow {

    @Test
    public void T1() {
        assertEquals("15.6.---2000", NextDateFunction.computeTomorrow(6, 14, 2000));
    }

    @Test
    public void T2() {
        assertEquals("15.6.---1996", NextDateFunction.computeTomorrow(6, 14, 1996));
    }

    @Test
    public void T3() {
        assertEquals("15.6.---2002", NextDateFunction.computeTomorrow(6, 14, 2002));
    }

    @Test
    public void T4() {
        assertEquals("30.6.---2000", NextDateFunction.computeTomorrow(6, 29, 2000));
    }

    @Test
    public void T5() {
        assertEquals("30.6.---1996", NextDateFunction.computeTomorrow(6, 29, 1996));
    }

    @Test
    public void T6() {
        assertEquals("30.6.---2002", NextDateFunction.computeTomorrow(6, 29, 2002));
    }

    @Test
    public void T7() {
        assertEquals("1.7.---2000", NextDateFunction.computeTomorrow(6, 30, 2000));
    }

    @Test
    public void T8() {
        assertEquals("1.7.---1996", NextDateFunction.computeTomorrow(6, 30, 1996));
    }

    @Test
    public void T9() {
        assertEquals("1.7.---2002", NextDateFunction.computeTomorrow(6, 30, 2002));
    }

    @Test
    public void T10() {
        assertEquals("Invalid input date", NextDateFunction.computeTomorrow(6, 31, 2000));
    }

    @Test
    public void T11() {
        assertEquals("Invalid input date", NextDateFunction.computeTomorrow(6, 31, 1996));
    }

    @Test
    public void T12() {
        assertEquals("Invalid input date", NextDateFunction.computeTomorrow(6, 31, 2002));
    }

    @Test
    public void T13() {
        assertEquals("15.7.---2000", NextDateFunction.computeTomorrow(7, 14, 2000));
    }

    @Test
    public void T14() {
        assertEquals("15.7.---1996", NextDateFunction.computeTomorrow(7, 14, 1996));
    }

    @Test
    public void T15() {
        assertEquals("15.7.---2002", NextDateFunction.computeTomorrow(7, 14, 2002));
    }

    @Test
    public void T16() {
        assertEquals("30.7.---2000", NextDateFunction.computeTomorrow(7, 29, 2000));
    }

    @Test
    public void T17() {
        assertEquals("30.7.---1996", NextDateFunction.computeTomorrow(7, 29, 1996));
    }

    @Test
    public void T18() {
        assertEquals("30.7.---2002", NextDateFunction.computeTomorrow(7, 29, 2002));
    }

    @Test
    public void T19() {
        assertEquals("31.7.---2000", NextDateFunction.computeTomorrow(7, 30, 2000));
    }

    @Test
    public void T20() {
        assertEquals("31.7.---1996", NextDateFunction.computeTomorrow(7, 30, 1996));
    }

    @Test
    public void T21() {
        assertEquals("31.7.---2002", NextDateFunction.computeTomorrow(7, 30, 2002));
    }

    @Test
    public void T22() {
        assertEquals("1.8.---2000", NextDateFunction.computeTomorrow(7, 31, 2000));
    }

    @Test
    public void T23() {
        assertEquals("1.8.---1996", NextDateFunction.computeTomorrow(7, 31, 1996));
    }

    @Test
    public void T24() {
        assertEquals("1.8.---2002", NextDateFunction.computeTomorrow(7, 31, 2002));
    }

    @Test
    public void T25() {
        assertEquals("15.2.---2000", NextDateFunction.computeTomorrow(2, 14, 2000));
    }

    @Test
    public void T26() {
        assertEquals("15.2.---1996", NextDateFunction.computeTomorrow(2, 14, 1996));
    }

    @Test
    public void T27() {
        assertEquals("15.2.---2002", NextDateFunction.computeTomorrow(2, 14, 2002));
    }

    @Test
    public void T28() {
        assertEquals("1.3.---2000", NextDateFunction.computeTomorrow(2, 29, 2000));
    }

    @Test
    public void T29() {
        assertEquals("1.3.---1996", NextDateFunction.computeTomorrow(2, 29, 1996));
    }

    @Test
    public void T30() {
        assertEquals("Invalid input date", NextDateFunction.computeTomorrow(2, 29, 2002));
    }

    @Test
    public void T31() {
        assertEquals("Invalid input date", NextDateFunction.computeTomorrow(2, 30, 2000));
    }

    @Test
    public void T32() {
        assertEquals("Invalid input date", NextDateFunction.computeTomorrow(2, 30, 1996));
    }

    @Test
    public void T33() {
        assertEquals("Invalid input date", NextDateFunction.computeTomorrow(2, 30, 2002));
    }

    @Test
    public void T34() {
        assertEquals("Invalid input date", NextDateFunction.computeTomorrow(2, 31, 2000));
    }

    @Test
    public void T35() {
        assertEquals("Invalid input date", NextDateFunction.computeTomorrow(2, 31, 1996));
    }

    @Test
    public void T36() {
        assertEquals("Invalid input date", NextDateFunction.computeTomorrow(2, 31, 2002));
    }
}
