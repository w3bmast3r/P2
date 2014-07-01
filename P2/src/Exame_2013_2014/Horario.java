/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exame_2013_2014;

public class Horario {
    
    int dia;
    int horaInicio;
    int horaFim;
    
    public Horario(int d, int hI, int hF){
        dia = d;
        while(d<1 && d>7){
            System.out.println("Valor de dia inválido.");
        }
        horaInicio = hI;
        horaFim = hF;
        
    }
    
    public int primeira(int p){
        
    }
}
