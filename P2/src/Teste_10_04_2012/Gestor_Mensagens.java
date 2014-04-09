
package Teste_10_04_2012;

import java.util.*;

public class Gestor_Mensagens extends SMS{
	
	private static int tlm;
	private static ArrayList<SMS> recebidas=new ArrayList<SMS>();
	private static ArrayList<SMS> enviadas=new ArrayList<SMS>();
	
	public Gestor_Mensagens(){
		super();
		tlm=0;
		recebidas.add(this);
		enviadas.add(this);
	}
	
	//2
	//a)
	public Gestor_Mensagens(int n){
		super();
		this.tlm=n;
		recebidas.add(this);
		enviadas.add(this);
	}
	
	//b)
	public void receber(SMS msg){
		recebidas.add(msg);
	}
	
	//c)
	public static void criar_msg(int destino, String texto){
		SMS s= new SMS(tlm,destino,texto);
		enviadas.add(s);
	}
	
	//d)
	public static String ler(int n){
		String s="";
		for(int i=0; i<recebidas.size();i++){
			if(recebidas.get(i).getDestino()==n){
				s = recebidas.get(recebidas.size()-1).getTexto();
			}	
		}
		return s;
	}
	
	//e)
	public void apagar(SMS msg){
		recebidas.remove(msg);
	}
	
	//f)
	public void limpar_recebidas(){
		recebidas.removeAll(recebidas);
	}
	
	public static void main(String[] args){
		criar_msg(962222222,"Ola");
		ler(962222222);
	}
}
