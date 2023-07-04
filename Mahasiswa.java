public class Mahasiswa extends Peminjam{
    private String namaMhs;
    private String nim;

    @Override
    public void setKodePeminjam(String nim) {
        this.nim = nim;
    }

    @Override
    public String getKodePeminjam() {
        return nim;
    }

    @Override
    public void setNamaPeminjam(String namaMhs) {
        this.namaMhs = namaMhs;
    }

    @Override
    public String getNamaPeminjam() {
        return namaMhs;
    }
    
}
   