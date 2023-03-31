/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi.kasir;

/**
 *
 * @author exfro
 */
public class Data {
    void cetak(int a){
             total+=harga[a]*getJumlah();
             stok[a]-=jumlah;
             System.out.println("anda memilih "+jenis[a]);
             System.out.println("anda membeli : "+jumlah);
             System.out.println("total harga : "+total);
             stok();
             System.out.println("terimakasih telah berbelanja :)");
    }
    int total;
    private int stok[]={10,20};
    private int harga[]={50000,40000};
    
    private String jenis []={"baju","celana"};
    
    public void syaratbarang(){
        if (pB==1) {
             cetak(0);
        }
        else if (pB==2) {
            cetak(1);
        }
    }
  
   
  
    public int stok1() {
        return stok[0];
    }
     public int stok2() {
        return stok[0];
    }

   
    
    private int pB;
    private int jumlah;

   

   
    

    public int getpB() {
        return pB;
    }

    public int getJumlah() {
        return jumlah;
    }
    
    
    
    
    
    
    
    
    public void stok(){
        
        System.out.println("stok yang ada :");
        for (int i = 0; i < stok.length; i++) {
            System.out.println((i+1)+". "+jenis[i]+" : "+stok[i]+"\nHarga : "+harga[i]);
            ;
        }
    }
    public void pBarang(int a){
    pB=a;
    }
    public void pjumlah(int a){
    jumlah = a;
    }
    
    
    
    
    
    
    
    
    
    
}
