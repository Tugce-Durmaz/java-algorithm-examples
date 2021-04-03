
package koşullarla.beden.kitlesi.hesaplama;

import java.util.Scanner;


    class KoşullarlaBedenKitlesiHesaplama {

    
    
    public static void main(String[] args) {
     
        /* Beden Kitle İndeksi : Kilo / Boy(m) * Boy(m)
        
        BKİ 18.5'un altındaysa -----> Zayıf 
        
        BKİ 18.5 ile 25 arasındaysa -----> Normal 
        
        BKİ 25 ile 30 arasındaysa -----> Fazla Kilolu 
        
        BKİ 30'un üstündeyse -----> Obez 
        
        */
    
     Scanner scanner = new Scanner(System.in);
     
        System.out.println("Kilonuzu Giriniz : ");
        int Kilo = scanner.nextInt();
        
        System.out.println("Boyunuzu Giriniz (Örnek : 1,68");
        double Boy = scanner.nextDouble();
        
        double bki =  Kilo / (Boy * Boy);
        
        if ( bki < 18.5) {
            
            System.out.println(" Zayıf ");
            
         }
     
        else if ( bki >= 18.5 && bki < 25 ){
            System.out.println(" Normal ");
    
        }
    
        else if ( bki >= 25 && bki < 30) {
            System.out.println(" Fazla Kilolu "); 
            
        }
        
        else {
            System.out.println(" Obez ") ;
                    }
    }
    }
    
    
   
    

