/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118021.latihan5.kambingglobal;

/**
 *
 * @author Arvan
 * NAMA     : M Arvan Nurcahyana
 * KELAS    : IF-1
 * NIM      : 10118021
 * Deskripsi Program :Kambing Global
 */
public class IF110118021Latihan5KambingGlobal {
    //variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    //method menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + 
                jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IF110118021Latihan5KambingGlobal kambingSusu = new IF110118021Latihan5KambingGlobal();
        
        //menampilkan jumlah kmabing yang ada saat program pertama kx berjalan
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
