public class Main {
    public static void main(String[] args) {

        Buku buku1 = new Buku("B001", "Pemrograman Java");
        Buku buku2 = new Buku("B002", "Pemrograman C++");
        BukuLuar buku3 = new BukuLuar("B003", "Harry Potter");

        Petugas petugas1 = new Petugas("Ali", "P001");
        Peminjam peminjam1 = new Mahasiswa();
        peminjam1.setNamaPeminjam("Apip");
        peminjam1.setKodePeminjam("M001");

        peminjam1.doLogin();
        //peminjam1.doLogout();

        try{
        Peminjaman peminjaman1 = new Peminjaman(peminjam1, petugas1, buku1);

        System.out.println("Peminjaman: " + peminjaman1.getPeminjam().getNamaPeminjam());
        System.out.println("Petugas: " + peminjaman1.getPetugas().getNamaPetugas());
        System.out.println("Buku: " + peminjaman1.getBuku().getNamaBuku());
        System.out.println("Nama Buku: " + peminjaman1.getBuku().getNamaBuku() );
        } catch (Exception e) {
        System.out.println("terjadi kesalahan: " + e.getMessage());
        } finally {
        System.out.println("Pemograman Selesai");
        }
 
    }
}