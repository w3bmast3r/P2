
package Alarmes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ficheiro extends Contacto{

    String line;
    
    
    
    public void readFile(String path) {

        try {
            Scanner in = new Scanner(new FileReader(path));
            while (in.hasNextLine()) {
                line = in.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        }

    }
    
    public void writeFile(String path) throws IOException {
 
        try {
            File archive = new File(path);
            if (archive.exists()) {
                FileWriter fw = new FileWriter(archive, true);
                BufferedWriter bw = new BufferedWriter(fw);
            }
            
            perguntarContacto();
        
            bw.close();
            fw.close();
            } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        }
}
