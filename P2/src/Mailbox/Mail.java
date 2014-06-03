package Mailbox;

import java.util.ArrayList;

public class Mail {
	
	private String senderID, receivedID, mailText;
	
	ArrayList <Mail> mailbox = new ArrayList <Mail>();
	
	public Mail(){
		senderID = "";
		receivedID = "";
		mailText = "";
	}
	
	public Mail(String sID, String rID, String mT){
		
		senderID = sID;
		receivedID = rID;
		mailText = mT;
		
	}
	
	public void add(){
		
	}

}
