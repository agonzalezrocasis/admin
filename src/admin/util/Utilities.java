/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.util;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import admin.model.dto.Contacto;

/**
 *
 * @author Alberto
 */
public class Utilities {
    
    private static final String hint1 = "class=\"ng-binding\">";
    private static final String hint2 = "</a>";
    
    public static void main(String args[]) {
		
        String currentLine = null;
	BufferedReader br = null;
	FileReader fr = null;
	int regCounter = 1;
	int lineCounter = 0;
	Map<Integer, Contacto> mapaContactos = new HashMap<Integer, Contacto>();
	Contacto contacto = null;
        String dato = null;
        
	try {			
            fr = new FileReader("emails.html");
            br = new BufferedReader(fr);
			
            while ((currentLine = br.readLine()) != null) {
		switch(lineCounter) {
                    case 0:
			contacto = new Contacto();                                                
			lineCounter++;
			break;
                    case 1:                        
                        contacto.setNombre(Utilities.getSubstring(currentLine));
                        lineCounter++;
			break;
                    case 2:
                        contacto.setApellidoPaterno(Utilities.getSubstring(currentLine));
			lineCounter++;
			break;
                    case 3:
                        contacto.setApellidoMaterno(Utilities.getSubstring(currentLine));
			lineCounter++;
			break;
                    case 4:
                        contacto.setEmail(Utilities.getSubstring(currentLine));
			lineCounter++;
			break;
                    case 5:
                        contacto.setTelefono(Utilities.getSubstring(currentLine));
			lineCounter++;
                        break;
                    case 6:
                        contacto.setGrupo(Utilities.getSubstring(currentLine));
                        mapaContactos.put(regCounter, contacto);
			lineCounter = 0;
			regCounter++;
			break;
		}				
            }

            System.out.println("Hashmap created!");
            System.out.println("Number of rows: " + regCounter);
            System.out.println("Size of the Hashmap: " + mapaContactos.size());
			
	} catch(IOException e) {
            System.out.println(e);			
	} finally {
            try {
		if (br != null)
                    br.close();
		if (fr != null)
                    fr.close();				
            } catch(IOException e) {
                System.out.println(e);
            }			
	}		
		
    }
    
    public static String getSubstring(String line) {        
        int indexSubstring = line.indexOf(hint1);
        int leftIndex = indexSubstring + hint1.length();        
        int rightIndex = line.indexOf(hint2);
        String substring = line.substring(leftIndex, rightIndex);
        // System.out.println(substring);
        return substring;
    }
    
    
    
}
