/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pejic.kalkulator.obrada;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Pejić
 */
public class ObradaKalkulator {
    
    
    public static int obrada(List<String> zapis){
        
        Iterator<String> itr = zapis.iterator();
        Integer rezultat=0;
        
        
        
        
        for(int i=0;i<zapis.size()-1;i++){
            
            if(zapis.get(i).equals("/")){
            
                rezultat/=Integer.parseInt(zapis.get(i+1));
                i++;
                continue;
                
            }
            if(zapis.get(i).equals("*")){
            
                rezultat*=Integer.parseInt(zapis.get(i+1));
                i++;
                continue;
                
            }
            if(zapis.get(i).equals("+")){
            
                rezultat+=Integer.parseInt(zapis.get(i+1));
                i++;
                continue;
                                               
            }
            if(zapis.get(i).equals("-")){
            
                rezultat-=Integer.parseInt(zapis.get(i+1));
                i++;
                
                
            }else{
            
                rezultat=Integer.parseInt(zapis.get(i));
            }
            
        }
       
        return rezultat;
        
        
        
    }
    
}
