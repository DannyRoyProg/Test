import static org.junit.Assert.*;
import org.junit.Test;

public class TableauxTest {

    @org.junit.Test
    public void trierCroissantSSS() {
        int[] tab = {2, 4, 5, 3, 12, 8, 26, 41};
        int[] expectedTab = {2, 3, 4, 5, 8, 12, 26, 41};
        Tableaux.trierCroissantSSS(tab);
        assertArrayEquals(expectedTab, tab);
    }

    @org.junit.Test
    public void testTrierCroissantSSS() {
        String[] tab = {"2", "4", "5", "3", "12", "8", "26", "41"};
        String[] expectedTab = {"2", "3", "4", "5", "8", "12", "26", "41"};
        Tableaux.trierCroissantSSS(tab);
        assertArrayEquals(expectedTab, tab);
    }

    @org.junit.Test
    public void trierDeCroissantSSS() {
        int[] tab = {2, 4, 5, 3, 12, 8, 26, 41};
        int[] expectedTab = {41, 26, 12, 8, 5, 4, 3, 2};
        Tableaux.trierDeCroissantSSS(tab);
        assertArrayEquals(expectedTab, tab);
    }

    @org.junit.Test
    public void testTrierDeCroissantSSS() {
    }

    @org.junit.Test
    public void maximum() {
        int[] tab = {2, 4, 5, 3, 12, 8, 26, 41};
        int expectedResultat = 41;
        int result = Tableaux.maximum(tab);
        assertEquals(expectedResultat, result);
    }

    @org.junit.Test
    public void testMaximum() {
    }

    @org.junit.Test
    public void minimum() {
    }

    @org.junit.Test
    public void testMinimum() {
    }

    @org.junit.Test
    public void moyenne() {
    }

    @org.junit.Test
    public void testMoyenne() {
    }

    @org.junit.Test
    public void fouilleSeq() {
    }

    @org.junit.Test
    public void testFouilleSeq() {
    }
}