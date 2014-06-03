package QQSM;

import java.io.*;
import java.util.*;
	

public class Questao_QQSM extends QQSM{

    public static void main(String[] args) throws FileNotFoundException{
    	
    	Questao_QQSM newGame = new Questao_QQSM();
		newGame.readFile();
    	newGame.counterLevel();
    	
    }
		
}	