/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahirdefault.sepeda;

/**
 *
 * @author jauza
 */
public class SepedaDemo {
     public static void main(String[]args){
        Sepeda s1 = new Sepeda();
        s1.kode="5001"; s1.merek="Polygon"; s1.jenis="XC"; s1.kecepatan=0;
        s1.gigi=0;
        s1.start();
        s1.TambahKecepatan(15); s1.KurangiKecepatan(3);
        s1.Tampildata();
       
}
}
