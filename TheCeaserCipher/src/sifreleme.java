/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mr
 */
public class sifreleme {
    
    String mesaj,sifreli_mesaj;
    
    
    void sifrele(){
        char[] sezarDizisi = mesaj.toCharArray();
        
        for(int i=0; i<sezarDizisi.length;i++){
            int asciiSira = (int)sezarDizisi[i];
            if(asciiSira == 32)
                sezarDizisi[i] = ' ';             
            else{
                if(asciiSira >=65 && asciiSira <=90){
                    if((asciiSira+5) >90)
                        sezarDizisi[i] = (char) (((asciiSira+5)%90) + 64);
                    else
                        sezarDizisi[i] = (char) (asciiSira+5);
                }
                if(asciiSira >=97 && asciiSira <=122){
                    if((asciiSira+5) >122)
                        sezarDizisi[i] = (char) (((asciiSira+5)%122) + 96 );
                    else
                        sezarDizisi[i] = (char) (asciiSira+5);
            }
            
        }
        
        
    } 
       sifreli_mesaj=String.valueOf(sezarDizisi);
}
}
