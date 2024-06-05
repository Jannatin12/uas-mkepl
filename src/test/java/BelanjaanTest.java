import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.example.belanjaan.Belanjaan;

public class BelanjaanTest {

    private Belanjaan belanjaan;

    @Before
    public void setUp() {
        belanjaan = new Belanjaan();
    }

    @Test
    public void testTambahItem() {
        belanjaan.tambahItem("Buku", 10000);
        assertEquals(10000, belanjaan.dapatkanTotalHarga());
    }

    @Test
    public void testHapusItem() {
        belanjaan.tambahItem("Pensil", 2000);
        belanjaan.hapusItem("Pensil");
        assertEquals(0, belanjaan.dapatkanTotalHarga());
    }

    @Test
    public void testReset() {
        belanjaan.tambahItem("Buku", 10000);
        belanjaan.reset();
        assertEquals(0, belanjaan.dapatkanTotalHarga());
    }
}