
package beden.kitle.ındeksi.hesaplama;

import java.util.Scanner;


public class BedenKitleIndeksiHesaplama {


    public static void main(String[] args) {
 
        // Beden Kitle İndeksi = kilo / ( boy * boy )
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Kilonuzu giriniz :");
        int kilo = scanner.nextInt();
        
        System.err.println("Boyunuzu giriniz :");
        double boy = scanner.nextDouble();
        
        double bki = kilo / (boy * boy);
        
        System.out.println("Beden Kitle Indeksiniz :" + bki);
       
                
       
    }
    
}
