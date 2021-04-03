/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package girilen.gunun.karsiligini.getiren.uygulama;

import java.util.Scanner;


/**
 *
 * @author User
 */
public class GirilenGununKarsiliginiGetirenUygulama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner klavye = new Scanner(System.in);
        
        System.out.println("Lütfen haftanın gününü giriniz: ");
        
        String gun = null;
        
        int gununSayiKarsiligi = klavye.nextInt();
        
        if (gununSayiKarsiligi == 1) {
            gun = "Pazartesi";
        } else if(gununSayiKarsiligi == 2) {
            gun = "Salı";
        } else if(gununSayiKarsiligi == 3) {
            gun = "Çarşamba";
        } else if(gununSayiKarsiligi == 4) {
            gun = "Perşembe";
        } else if(gununSayiKarsiligi == 5) {
            gun = "Cuma";
        } else if(gununSayiKarsiligi == 6) {
            gun = "Cumartesi";
        } else if(gununSayiKarsiligi == 7) {
            gun = "Pazar";
        } else{
            System.out.println("Geçersiz bir gün girdiniz!!!");
            return;
        }
       
        
        
        System.out.println("Girdiğiniz sayi: "+ gun);
        
        
    }
    
}
