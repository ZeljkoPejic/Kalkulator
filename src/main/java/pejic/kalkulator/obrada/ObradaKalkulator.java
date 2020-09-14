/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pejic.kalkulator.obrada;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Pejić
 */
public class ObradaKalkulator {
    
    
    public static String obrada(List<Double> zapisOne,List<String> zapisTwo){
        
        DecimalFormat df = new DecimalFormat("0.#");
        Double rezultat;
        int x=0;
                
             
        while(true){
            
            if(zapisTwo.contains("/")){
                
                x=zapisTwo.indexOf("/");
                rezultat=zapisOne.get(x)/zapisOne.get(x+1);
                zapisOne.remove(x+1);
                zapisOne.remove(x);
                zapisTwo.remove(x);
                zapisOne.add(rezultat);
            }
            if(zapisTwo.contains("*")){
                
                x=zapisTwo.indexOf("*");
                rezultat=zapisOne.get(x)*zapisOne.get(x+1);
                zapisOne.remove(x+1);
                zapisOne.remove(x);
                zapisTwo.remove(x);
                zapisOne.add(rezultat);
            }
            if(zapisTwo.contains("+")){
                
                x=zapisTwo.indexOf("+");
                rezultat=zapisOne.get(x)+zapisOne.get(x+1);
                zapisOne.remove(x+1);
                zapisOne.remove(x);
                zapisTwo.remove(x);
                zapisOne.add(rezultat);
            }
            if(zapisTwo.contains("-")){
                
                x=zapisTwo.indexOf("-");
                rezultat=zapisOne.get(x)-zapisOne.get(x+1);
                zapisOne.remove(x+1);
                zapisOne.remove(x);
                zapisTwo.remove(x);
                zapisOne.add(rezultat);
            }
            
            if(zapisTwo.isEmpty()){
                rezultat=zapisOne.get(0);
                break;
            }
          
        }
        
        return df.format(rezultat);
               
    }
    
}
