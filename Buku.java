public class Buku {
    private String idBuku;
    private String namaBuku;
    
    public Buku(String idBuku, String namaBuku){
        this.idBuku = idBuku;
        this.namaBuku = namaBuku;

    }
    protected String getidBuku(){
     return idBuku;

    }
    protected String getNamaBuku(){
        return namaBuku;

    }
}