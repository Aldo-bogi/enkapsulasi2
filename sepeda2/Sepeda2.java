/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zahirdefault.sepeda2;

/**
 *
 * @author jauza
 */
public class Sepeda2 {
     public String kode;
    protected String merek;
    String jenis;
  private float kecepatan;
   private int gigi;
    
    
    public Sepeda2(){
        System.out.println("Objek terbentuk menggunakan kontruktor default");
        kode = merek = jenis = "KOSONG";
        kecepatan = gigi = 0;
    }
    public Sepeda2(int g){
        System.out.println("Objek terbentuk menggunakan kontruktor berparameter 1");
        kode = merek = jenis = "KOSONG";
        kecepatan = 0;
        gigi = g;
    }
    public Sepeda2(int g,float v){
        System.out.println("Objek terbentuk menggunakan kontruktor berparameter 2");
        kode = merek = jenis = "KOSONG";
        kecepatan = v;
        gigi = g;
    }
    
    public void start(){
        gigi = 1; kecepatan = 0;
    }
    private void Kurangigigi(){
        gigi--;
    }
    private void TambahGigi(){
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
        Sepeda2 s1 = new Sepeda2();
        s1.kode="5001"; s1.merek="Polygon"; s1.jenis="XC"; s1.kecepatan=0;
        s1.gigi=0;
        s1.start();
        s1.TambahKecepatan(15); s1.KurangiKecepatan(3);
        s1.Tampildata();
        Sepeda2 s2 = new Sepeda2(2);
        s2.Tampildata();
        Sepeda2 s3 = new Sepeda2 (4, 25);
        s3.Tampildata();
       
}
}
