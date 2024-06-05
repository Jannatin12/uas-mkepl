import com.example.belanjaan.Belanjaan;

public class DriverBelanjaan {

    public static void main(String[] args) {

        Belanjaan belanjaan = new Belanjaan();

        belanjaan.tambahItem("Buku", 10000);
        belanjaan.tambahItem("Pensil", 2000);
        belanjaan.tambahItem("Penghapus", 1500);
        
        belanjaan.tampilkanItem();

        System.out.println("Total harga: " + belanjaan.dapatkanTotalHarga() + "\n");

        belanjaan.hapusItem("Pensil");
        
        belanjaan.tampilkanItem();

        System.out.println("Total harga setelah pensil dihapus: " + belanjaan.dapatkanTotalHarga()  + "\n"  );

        belanjaan.reset();
        
        belanjaan.tampilkanItem();

        System.out.println("Total harga setelah reset: " + belanjaan.dapatkanTotalHarga());
    }
}