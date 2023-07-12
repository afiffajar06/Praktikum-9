public class Denda {
    private Peminjaman peminjaman;
    private int hariTerlambat ;
    private int TARIF_DENDA = 10000 ;
    private int hapus;


    public Denda(Peminjaman peminjaman, int hariTerlambat) {

        this.peminjaman = peminjaman;
        this.hariTerlambat = hariTerlambat * TARIF_DENDA;
        this.hapus = 0;
    }
    
    public Peminjaman getPeminjaman(){
        return peminjaman;
    }
    
    
    public int getTagihan(){
        return hariTerlambat;
    }
    
     public int getHapus() {
        return hapus;
    }
}
