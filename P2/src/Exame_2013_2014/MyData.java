/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exame_2013_2014;

import java.util.GregorianCalendar;
/**
 *
 * @author bruno
 */
public class MyData implements Data{

int dia, mes, ano;
    
public MyData(){
      
GregorianCalendar calendar = new GregorianCalendar(); 
    
}

public MyData(int d, int m, int a){
    
dia = d;
mes = m;
ano = a;

}
        
}
