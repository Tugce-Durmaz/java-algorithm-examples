
package gidilen.kilometreye.göre.toplam.tutar.hesaplama;

import java.util.Scanner;


public class GidilenKilometreyeGöreToplamTutarHesaplama {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Aracınız kilometrede kaç kuruş yakıyor? (Örneğin:0.25)");
        
        double kurus = scanner.nextDouble();
        
        System.out.println("Aracınız kaç kilometre yol gitti?");
        
        int km = scanner.nextInt();
        
        System.out.println ("Toplam ödemeniz gereken tutar :" + (kurus * km) + " tl dir . ");
               
        
        
    }
    
}
