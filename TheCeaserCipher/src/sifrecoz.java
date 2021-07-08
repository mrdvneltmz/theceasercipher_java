/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mr
 */
public class sifrecoz {
    
    String mesaj,sifreli_mesaj; 
    
    
    void sifre_coz(){
       String cozulmus_metin="";
    
        for(int i = 0; i< sifreli_mesaj.length(); ++i){
		char harf = sifreli_mesaj.charAt(i);
			
			if(harf >= 'a' && harf <= 'z'){
	            harf = (char)(harf - 5);
	            
	            if(harf < 'a'){
	                harf = (char)(harf + 'z' - 'a' + 1);
	            }
	            
	            cozulmus_metin += harf;
	        }
	        else if(harf >= 'A' && harf <= 'Z'){
	            harf = (char)(harf - 5);
	            
	            if(harf < 'A'){
	                harf = (char)(harf + 'Z' - 'A' + 1);
	            }
	            
	            cozulmus_metin += harf;
	        }
	        else {
	        	cozulmus_metin += harf;
	        }
		}
    mesaj=cozulmus_metin;
}
}