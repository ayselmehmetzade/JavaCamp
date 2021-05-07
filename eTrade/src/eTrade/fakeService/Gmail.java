package eTrade.fakeService;

import java.util.ArrayList;

public class Gmail {
	
	public ArrayList<GmailClass> getByEmailAndPassword(){
		
		ArrayList<GmailClass> gmailUsers=new ArrayList<GmailClass>();
		gmailUsers.add(new GmailClass(1,"Aysel","Mehmetzade","aysel@test.com","1234567"));
		gmailUsers.add(new GmailClass(1,"Esra","Sancak","esra@test.com","7894561"));
		gmailUsers.add(new GmailClass(1,"Dilara","Saðlamol","dilara@test.com","1472583"));
		
		return gmailUsers;
	}
	

}
