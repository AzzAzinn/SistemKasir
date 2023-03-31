/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasi.kasir;
import java.util.Scanner;
/**
 *
 * @author exfro
 */
public class AplikasiKasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
//         Data h = new Data();
         Kasir f = new Kasir();
         
         
         do {
            f.cetak();
             System.out.println("========================");
             System.out.println("ingin membeli lagi?(y/n)");
             a = sc.next();
        } while (a.equalsIgnoreCase("y"));
         
         
         
         
    }
    
}
