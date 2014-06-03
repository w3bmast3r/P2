package Zoo;

public class Gato implements Animal, Mamifero{

	String name;
	int weight, numDias;
	
	
	public Gato(String n, int w){
		n = name;
		w = weight;
	}

	
	public void animalName(String n) {
		n = name;
	}
	
	
	public void animalWeight(int w) {
		w = weight;
		
	}

	
	public void numDias(int d) {
		d = numDias;
		
	}

}
