/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi.kasir;
import java.util.Scanner;
/**
 *
 * @author exfro
 */
public class Kasir extends Data {
    Scanner sc = new Scanner (System.in);
   
    
    public void cetak(){
        System.out.println("lika ");
        System.out.println("===========");
        super.stok();
        System.out.println("ingin membeli apa?(1/2)");
        super.pBarang(sc.nextInt());
        System.out.println("ingin membeli berapa?");
        super.pjumlah(sc.nextInt());
        
        if (super.getpB()==1&&super.stok1()>=super.getJumlah()){
            super.syaratbarang();
        }
        else if (super.getpB()==2&&super.stok2()>=super.getJumlah()) {
            super.syaratbarang();  
        }
        else{
            System.out.println("stok habis");
        }
        
    
    }
    
}
