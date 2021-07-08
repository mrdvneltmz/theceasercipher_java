
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mr
 */
public class sezarApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        sifreleme sifrele = new sifreleme();
        sifrecoz sifre_coz = new sifrecoz();
        
     
        System.out.println("Sifrenelecek cümle giriniz: ");
        sifrele.mesaj = scan.nextLine();
        sifrele.sifrele();
        System.out.println("Orjinal: "+sifrele.mesaj);
        System.out.println("Sifrelenmis: "+sifrele.sifreli_mesaj);
        
        sifre_coz.sifreli_mesaj=sifrele.sifreli_mesaj;
        
        sifre_coz.sifre_coz();
        
        System.out.println("Sifrelenmis: "+sifre_coz.sifreli_mesaj);
        System.out.println("Cozulmus: "+sifre_coz.mesaj);
        
        
        
        
        
    }
    
}
