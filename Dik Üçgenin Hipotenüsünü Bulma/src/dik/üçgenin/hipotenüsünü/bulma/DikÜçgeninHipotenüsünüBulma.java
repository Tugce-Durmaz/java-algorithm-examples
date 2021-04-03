
package dik.üçgenin.hipotenüsünü.bulma;

import java.util.Scanner;

public class DikÜçgeninHipotenüsünüBulma {
    

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        
        System.out.println("Birinci Kenar : ");
        a = scanner.nextInt();
        
        System.out.println("İkiinci Kenar : ");
        b = scanner.nextInt();
        
        double h = Math.sqrt( a * a + b * b);
        System.out.println("Hipotenüs : " + h);
               
               
    }
    
}
