/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aldodefault.sepeda;

/**
 *
 * @author aldo
 */
public class Sepeda {
    public String kode;
    protected String merek;
    String jenis;
  public float kecepatan;
   public int gigi;
    
    
    }
    public void start(){
        gigi = 1; kecepatan = 0;
    }
    public void Kurangigigi(){
        gigi--;
    }
    public void TambahGigi(){
        gigi++;
    }
    public void TambahKecepatan(float v){
        kecepatan += v;
        if(v>10)
            TambahGigi();
    }
    public void KurangiKecepatan(float v){
        kecepatan -= v;
        if(v>5.5)
            Kurangigigi();
    }
    public void stop(){
        kecepatan = 0; gigi = 0;
    }
    public void Tampildata(){
        System.out.println("KODE = " +kode);
        System.out.println("MEREK = " +merek);
        System.out.println("JENIS = " +jenis);
        System.out.println("KECEPATAN = " +kecepatan);
        System.out.println("GIGI = " +gigi);
    }
    public static void main(String[]args){
        Sepeda s1 = new Sepeda();
        s1.kode="5001"; s1.merek="Polygon"; s1.jenis="XC"; s1.kecepatan=0;
        s1.gigi=0;
        s1.start();
        s1.TambahKecepatan(15); s1.KurangiKecepatan(3);
        s1.Tampildata();
        Sepeda s2 = new Sepeda(2);
        s2.Tampildata();
        Sepeda s3 = new Sepeda (4, 25);
        s3.Tampildata();
     
}

