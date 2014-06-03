package Zoo;

public class Cobra implements Animal, Selvagem{

	String name, animalHabitat;
	int weight;
	
	public Cobra(String n, int w){
		n = name;
		w = weight;
	}

	
	public void animalName(String n) {
		n = name;
	}
	
	
	public void animalWeight(int w) {
		w = weight;
		
	}


	@Override
	public void setHabitat(String h) {
		
		h = animalHabitat;
		
	}
		
}
