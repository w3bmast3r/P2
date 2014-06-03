package Agenda_Telefonica;

import java.util.ArrayList;

public class Contacto {
	
	private String nameContact;
	private int numberContact;
	
	ArrayList <Contacto> Lista = new ArrayList <Contacto>();
	
	public Contacto(String nameC, int numberC){
		nameContact = nameC;
		numberContact = numberC;
	}
	
	public String getnameContact(){
		return nameContact;
	}
	
	public void setnameContact(String nameC){
		nameContact = nameC;
	}
	
	public void addTelefone(Integer t){
		
	}

}
