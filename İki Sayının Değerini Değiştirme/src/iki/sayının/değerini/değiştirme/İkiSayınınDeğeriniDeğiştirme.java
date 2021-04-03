
package iki.sayının.değerini.değiştirme;

import java.util.Scanner;


public class İkiSayınınDeğeriniDeğiştirme {

  
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);
      int birinci_sayı ;
      int ikinci_sayı ;
      
        System.out.println("Birinci sayı :");
        birinci_sayı = scanner.nextInt();
        
        System.out.println("İkinci Sayı");
        ikinci_sayı = scanner.nextInt();
        
        System.out.println("Birinci sayı: " + birinci_sayı + " İkinci sayı : " + ikinci_sayı);
        int gecici = birinci_sayı;
        birinci_sayı = ikinci_sayı;
        ikinci_sayı = gecici;
        
        System.out.println("Değiştirdikten sonra ....");
        
         System.out.println("Birinci sayı: " + birinci_sayı + " İkinci sayı : " + ikinci_sayı);
               
              
      
    }
    
}
