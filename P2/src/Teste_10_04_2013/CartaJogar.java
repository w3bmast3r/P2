
package Teste_10_04_2013;

import java.util.ArrayList;

public class CartaJogar {
    
    int i, valorCarta, valorNaipe;

    ArrayList <Integer> Baralho = new ArrayList();
    
	//Construtor
    
    public CartaJogar(){
        
    }
    
	public CartaJogar(int valorCarta, int valorNaipe){
		
		this.valorCarta = valorCarta;
                this.valorNaipe = valorNaipe;
                
                }
	
	
	private int getvalorCarta(){
		return valorCarta;
	}
	
	private int getvalorNaipe(){
		return valorNaipe;
	}
	
	private void setvalorCarta(int valorCarta){
		this.valorCarta = valorCarta;
	}
	
	private void setvalorNaipe(int valorNaipe){

		this.valorNaipe = valorNaipe;
	}
	
	
	public String toString(int valorCarta, int valorNaipe){
		if(valorNaipe==1){
                    return(valorCarta+"_Copas");
                }
                if(valorNaipe==2){
                    return(valorCarta+"_Paus");
                }
                if(valorNaipe==3){
                    return(valorCarta+"_Espadas");
                }
                else{
                    return(valorCarta+"_Ouros");
                }
	}
	
	private boolean equals(int valorCarta, int valorNaipe){
		if(valorCarta == this.valorCarta && valorNaipe == this.valorNaipe){
			return true;
		}
		else{
			return false;
		}
	}
	
	private int compareTo(int valorCarta, int valorNaipe){
		if(this.valorCarta>valorCarta && this.valorNaipe==valorNaipe){
                    return 1;
                }
                if(this.valorCarta<valorCarta){
                    return -1;
                }
                else{
                    return 0;
                }
        }
        
        private boolean vermelha(){
            if(valorNaipe==3 || valorNaipe==4){
                return true;
            }
            else{
                return false;
            }
        }
        
        private boolean preta(){
            if(valorNaipe==1 || valorNaipe==2){
                return true;
            }
            else{
                return false;
            }
        }
        
        
        
        
        public static void main(String[] args){
            CartaJogar c1 = new CartaJogar();
            System.out.println(c1.toString(10, 2));
        }
    
}
