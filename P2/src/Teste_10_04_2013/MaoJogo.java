
package Teste_10_04_2013;

import java.util.ArrayList;
import java.util.Scanner;

public class MaoJogo {
    
    int i;
    
    ArrayList <Integer> Mao = new ArrayList(); 
    Scanner input = new Scanner(System.in);
    
    public MaoJogo(int numeroCartas){
        
        System.out.println("Quantas cartas terá a mão do jogador?");
        int size = input.nextInt();   
        for(i=0;i<size;i++){
            Mao.add(i, 0);
        }
        
    }
    
    public void add(CartaJogar c){
        if(CartaJogar<)
            Mao.add(c);
    }
    
}
