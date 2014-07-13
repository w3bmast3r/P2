
package Alarmes;

import java.util.Scanner;

public class Contacto{
    
    String nomeEmpresa, contactoEmpresa;
    char confirmacao;
    boolean arg;
    
    Scanner sC = new Scanner(System.in);

    public Contacto(){
        String nomeEmpresa = "";
        String contactoEmpresa = "";
    }
    
    public Contacto(String nE, String cE){
        nomeEmpresa = nE ;
        contactoEmpresa = cE;
    }
    
    public boolean perguntarContacto(){
        System.out.println("Qual o nome da empresa de Alarmes que pretende adicionar?\n");
        nomeEmpresa = sC.nextLine();
        
        System.out.println(nomeEmpresa + ": Confirma que é este o nome que pretende adicionar ao ficheiro? Y/N");
        confirmacao = sC.next().charAt(0);
        
        switch(confirmacao){
                case 'Y':
                    verificacao(true);
                case 'N':
                    verificacao(false);
                    
        }
    }
    
    public void verificacao(arg){
        if(arg==true){
            writeFile();
        }
        else{
            perguntarContacto();
        }
    }
    
}
