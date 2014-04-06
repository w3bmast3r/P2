
package Teste_10_04_2013;

public class CartaJogar {
    
    int valorCarta, valorNaipe;
	
	
	//Construtor
	public CartaJogar(int valorCarta, int valorNaipe){
		
		valorCarta = this.valorCarta;
		valorNaipe = this.valorNaipe;
		
		if((valorCarta < 2 || valorCarta > 14) && (valorNaipe < 1 || valorNaipe > 4)){
			System.out.println("Valores introduzidos errados");
		}
		else{
			
			CartaJogar c1 = new CartaJogar(valorCarta, valorNaipe);
			
		}
		
	}
	
	
	private int getvalorCarta(){
		return this.valorCarta;
	}
	
	private int getvalorNaipe(){
		return this.valorNaipe;
	}
	
	private void setvalorCarta(int valorCarta){
		valorCarta = this.valorCarta;
	}
	
	private void setvalorNaipe(int valorNaipe){

		valorNaipe = this.valorNaipe;
	}
	
	
	private String toString(int valorCarta, int valorNaipe){
		
		return (valorCarta+"_"+valorNaipe);
	}
	
	private boolean equals(int valorCarta, int valorNaipe){
		if(valorCarta == this.valorCarta && valorNaipe == this.valorNaipe){
			return true;
		}
		else{
			return false;
		}
	}
	
	private int compareTo(){
		
	}
    
}
