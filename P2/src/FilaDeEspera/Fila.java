package FilaDeEspera;

import java.util.ArrayList;

public class Fila implements FilaDeEspera{
	
	private int i, c, size, maxSize;
	private String person, lineName;
	
	ArrayList <String> Al = new ArrayList <String>();
	
	public Fila(){
		size=0;
	}
	
	public Fila(int mS){
		maxSize = mS;

		for(i=0;i<maxSize;i++){											//Coloca a fila toda a null
			Al.add(null);
		}
		
	}
	
	public int getSize() {
		c = 0;
		for(i=0;i<maxSize;i++){
			if(Al.get(i)!=null){
				c++;
			}
		}
		return c;
	}
	
	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int mS) {
		maxSize = mS;
	}

	@Override
	public int maxSize() {
		return maxSize;
		
	}

	@Override
	public int places() {
		int counter=0;
		for(i=0;i<size;i++){
			if(Al.get(i)!=null){
				counter++;
			}
		}
		return counter;
		
	}

	@Override
	public void isFull() {
		if(Al.get(0)==null){
			System.out.println("Estado da lista: Não está cheia");
		}
		else{
			System.out.println("Estado da lista: Cheia");
		}
		
		/*
		for(i=0;i<maxSize;i++){
			if(Al.get(i)==null){
				System.out.println("A fila ainda não está cheia");
			}
			if(c!=null){
				System.out.println("A fila está cheia");
			}
		}
		*/
	}

	@Override
	public void isEmpty() {
		if(Al.isEmpty()){
			System.out.println("Estado da fila: VAZIA");
		}
		
	}

	@Override
	public void add(String p) {
		person = p;
		int lI = Al.lastIndexOf(null);									//Retificar
		Al.remove(lI);
		Al.add(lI, person);
	}

	@Override
	public void front() {
		System.out.println(Al.get(0));
		
	}

	@Override
	public void remove() {
		String firstElement;
		
		firstElement = Al.get(0);
		Al.remove(0);
		Al.add(0, null);
		System.out.println("Lugar " + i + ": " + firstElement);
		
	}
	
	public void getAl(){
		for(i=0;i<Al.size();i++){
			System.out.println(toString());
		}
	
	
	}
	
	public String toString(){
		return ("Lugar " + i + ": " + Al.get(i));
	}

}
