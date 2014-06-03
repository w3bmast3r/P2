package QQSM;

import java.io.*;
import java.util.*;

public class QQSM{
	
	int i, c, Ql1Counter, Ql2Counter, Ql3Counter, numberofQuestions, whichQuestion;
	String line, name, answer, finalAnswer;
	
	ArrayList <String> Ql1 = new ArrayList <String>();
	ArrayList <String> Ql2 = new ArrayList <String>();
	ArrayList <String> Ql3 = new ArrayList <String>();
	
	String Values[] = {"0","25","50","125","250",
						"500","750","1500","2500","5000","7500",
						"12500","25000","50000","100000","250000"};
	
	Scanner sC = new Scanner(System.in);
	Random rN = new Random();
	
	/*
	////////
	//TESTE
	////////
	public QQSM(String path) throws FileNotFoundException{
		
			Scanner in = new Scanner(new FileReader(path));
			
			while (in.hasNextLine()){
				
				line = in.nextLine();
				
			    if(line.equals("1")){
			    	c=0;
			    	while(c<7){
			    		line = in.nextLine();
	                    Ql1.add(line);
	                    c++;
	                    Ql1Counter++;
	                }
			    }
			    if(line.equals("2")){
			    	c=0;
				   	while(c<7){
				   		line = in.nextLine();
		                Ql2.add(line);
		                c++;
		                Ql2Counter++;
				   	}
			    }
				if(line.equals("3")){
					c=0;
					while(c<7){
						line = in.nextLine();
						Ql3.add(line);
						c++;
						Ql3Counter++;
					}
				}
			}
		}
	
	
	*/
	
	
	//READ FILE > ORGANIZE ALL LEVELS ON COMPATIBLE ARRAYLISTS
	public void readFile() throws FileNotFoundException{
		
		Scanner in = new Scanner(new FileReader("/home/bruno/NetBeansProjects/P2/P2/src/QQSM/perguntas.txt"));
		
		while (in.hasNextLine()){
			
			line = in.nextLine();
			
		    if(line.equals("1")){
		    	c=0;
		    	while(c<7){
		    		line = in.nextLine();
                    Ql1.add(line);
                    c++;
                    Ql1Counter++;
                }
		    }
		    if(line.equals("2")){
		    	c=0;
			   	while(c<7){
			   		line = in.nextLine();
	                Ql2.add(line);
	                c++;
	                Ql2Counter++;
			   	}
		    }
			if(line.equals("3")){
				c=0;
				while(c<7){
					line = in.nextLine();
					Ql3.add(line);
					c++;
					Ql3Counter++;
				}
			}
		}
	}
	
	
	public void counterLevel(){
		while(i<16){ //Número de níveis
			if(i<6){ // Número de questoes de primerio nível
				
				numberofQuestions = (Ql1Counter/7); //Numero de questoes de nível 1 
				whichQuestion = rN.nextInt(numberofQuestions);
				
				System.out.println("Pergunta número " + (i+1) + ": \n" + Ql1.get(whichQuestion*7)+"\n");
				
				for(c=0;c<4;c++){
					System.out.println(Ql1.get((whichQuestion*7)+c+1));
				}
				
				System.out.println("\n"+ "Introduza a opção que acha correcta: ");
				answer = sC.nextLine();
				
				convertAnswer(); //Adiciona "R: " para as duas Strings poderem ser comparadas
				
				if(finalAnswer.equals("R: Desisto")){
					System.out.println("O jogo do Quem Quer Ser Milionário terminou por hoje.\n");
					System.out.println("Levou assim para casa o prémio de " + Values[i] + " Euros");
				}
				
				if(finalAnswer.equals(Ql1.get(whichQuestion*7+(7-2)))){
					System.out.println("Resposta correcta!\n");
					System.out.println("Parabéns, acabou de ganhar "+ Values[i] + " Euros");
					i++;
				}
				
				else{
					System.out.println("O jogo do Quem Quer Ser Milionário terminou por hoje.");
					break;
				}
				
			}


			if(i>5 && i<11){
				numberofQuestions=0;
				numberofQuestions = (Ql2Counter/7); //Numero de questoes de nível 1
				
				whichQuestion = rN.nextInt(numberofQuestions); //whichQuestion > Escolher a questão aleatoriamente
				
				System.out.println("Pergunta número " + (i+1) + ": \n" + Ql2.get(whichQuestion*7)+"\n");

				for(c=0;c<4;c++){
					System.out.println(Ql2.get(whichQuestion*7)+c+1);
				}

				System.out.println("\n"+ "Introduza a opção que acha correcta: ");
				answer = sC.nextLine();
				
				convertAnswer(); //Adiciona "R: " para as duas Strings poderem ser comparadas
				
				if(finalAnswer.equals("R: Desisto")){
					System.out.println("O jogo do Quem Quer Ser Milionário terminou por hoje.\n");
					System.out.println("Levou assim para casa o prémio de " + Values[i] + " Euros");
				}
				
				if(finalAnswer.equals(Ql2.get(whichQuestion*7+(7-2)))){
					System.out.println("Resposta correcta!\n");
					System.out.println("Parabéns, acabou de ganhar "+ Values[i] + " Euros");
					i++;
				}
				
				else{
					System.out.println("O jogo do Quem Quer Ser Milionário terminou por hoje.");
					System.out.println("Levou assim para casa o prémio de " + Values[5] + " Euros");
					break;
				}

			}

			if(i>10){
				numberofQuestions=0;
				numberofQuestions = (Ql3Counter/7); //Numero de questoes de nível 1 

				whichQuestion = rN.nextInt(numberofQuestions);

				System.out.println("Pergunta número " + (i+1) + ": \n" + Ql2.get(whichQuestion*7)+"\n");

				for(c=0;c<4;c++){
					System.out.println(Ql3.get(whichQuestion*7)+c+1);
				}

				System.out.println("\n"+ "Introduza a opção que acha correcta: ");
				answer = sC.nextLine();
				
				convertAnswer(); //Adiciona "R: " para as duas Strings poderem ser comparadas
				
				if(finalAnswer.equals("R: Desisto")){
					System.out.println("O jogo do Quem Quer Ser Milionário terminou por hoje.\n");
					System.out.println("Levou assim para casa o prémio de " + Values[i] + " Euros");
				}
				
				if(finalAnswer.equals(Ql2.get(whichQuestion*7+(7-2)))){
					if(i!=15){
					System.out.println("Resposta correcta!\n");
					System.out.println("Parabéns, acabou de ganhar "+ Values[i] + " Euros");
					i++;	
					}

					else{
						System.out.println("PARABÉNS, ACABOU DE GANHAR O JOGO DO QUEM QUER SER MILIONÁRIO!\n GANHOU O PŔEMIO DE 250.000 Euros!");
					}
					
				}
				
				else{
					System.out.println("O jogo do Quem Quer Ser Milionário terminou por hoje.");
					System.out.println("Levou assim para casa o prémio de " + Values[10] + " Euros");
					break;
				}
			}
		}
	}
	
	public void convertAnswer(){
		finalAnswer = ("R: " + answer);
	}
	
	public void removeQuestion(){
		for(c=0;c<6;c++){
			Ql1.remove((whichQuestion*7)+c);
		}
	}
	
	//# 1 # PLAYER'S REGISTRATION #
	
	public void asknamePlayer(){
		System.out.println("Qual o nome do concorrente?");
		name = sC.nextLine();
		System.out.println("Bem vindo ao jogo do Quem Quer Ser Milionário " + name + "!");
		System.out.println("A qualquer momento poderá desistir escrevendo 'Desisto'");
	}
	
}