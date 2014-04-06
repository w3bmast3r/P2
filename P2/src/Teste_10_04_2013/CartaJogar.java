
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
		
		return(this.valorCarta+"_"+this.valorNaipe);
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
        
        private void printArrayList(){
            for(i=0;i<Baralho.size();i++){
                
            }
        }
        
        
        
        
        public static void main(String[] args){
            CartaJogar c1 = new CartaJogar(10,1);
            CartaJogar c2 = new CartaJogar(10,2);
            System.out.println(c1.compareTo(10, 1));
        }
    
}
