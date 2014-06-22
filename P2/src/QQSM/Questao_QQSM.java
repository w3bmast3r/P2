package QQSM;

import java.io.*;
import java.util.*;
	

public class Questao_QQSM extends QQSM{

    public static void main(String[] args) throws FileNotFoundException{
    	
    	Questao_QQSM newGame = new Questao_QQSM();
        newGame.asknamePlayer();
	newGame.readFile("/home/bruno/NetBeansProjects/P2/P2/src/QQSM/perguntascompleto.txt");
    	newGame.counterLevel();
    	//newGame.writeFile("/home/bruno/NetBeansProjects/P2/P2/src/QQSM/teste.txt");
        
    }
		
}	