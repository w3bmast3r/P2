package Mailbox;

import java.util.ArrayList;

public class Mailbox {
	
	private int i;
	private String ID;
	
	ArrayList <Mail> mensagensRecebidas = new ArrayList <Mail>();
	
	public Mailbox(){
		
		ID = "";
		
	}
	
	public Mailbox(String iD){
		ID = iD;
	}
	
	public void addMail(){
		for(i=0;i<mensagensRecebidas.size();i++){
			
		}
	}

	
	
}
