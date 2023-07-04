import java.time.LocalDate;

public class BukuLuar extends Buku {
     private String imporOleh;
     private LocalDate tglImpor;

    public BukuLuar(String idBuku, String namaBuku){
        super(idBuku, namaBuku);

 }
    public void setImporOleh(String imporOleh){
        this.imporOleh = imporOleh;
        
 }
    public String getImporOleh(){
        return imporOleh;

 }
    public void SetTglImpor(LocalDate tglImpor){
        this.tglImpor = tglImpor;

 }
    public LocalDate getTglImpor(){
        return tglImpor;

 }
 
}