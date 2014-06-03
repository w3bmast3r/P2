package Zoo;

import java.util.ArrayList;

public class Aguia implements Animal, Ave, Selvagem{
	
	ArrayList <Aguia> Aguias = new ArrayList <Aguia>();
	
	String name, animalHabitat;
	int i, weight, velMax, numCounter;
	
	public Aguia(String n, int w){
		
		n = name;
		w = weight;
		
	}

	
	public void animalName(String n) {
		
		n = name;
	}
	
	
	public void animalWeight(int w) {
		
		w = weight;
		
	}

	
	public void velMax(int vM) {
	
		vM = velMax;
		
	}


	public void setHabitat(String h) {
		
		h = animalHabitat;
		
	}
	
	public void printCounter(){
		System.out.println(numCounter);
	}
}
