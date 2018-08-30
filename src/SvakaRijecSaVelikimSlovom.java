import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SvakaRijecSaVelikimSlovom {

    public static void main(String[] args) throws FileNotFoundException {
	/**
	 * Napisati program koji čita rečenice iz filea i vraća svaku 
	 * riječ u rečenicu sa početnim velikim slovom. Da li će program
	 *  da prima ime filea kao argument ili ne, na vama je. 
	 */
	
	Scanner inputConsole = new Scanner(System.in);
	System.out.print("Unesite ime filea: ");
	String fileName = inputConsole.nextLine();
	File file = new File(fileName);
	inputConsole.close();
	
	if (file.exists()) {
	    Scanner inputFile = new Scanner(file);
	    
	    while(inputFile.hasNextLine()) {
		String line = inputFile.nextLine();
		String[] words = line.split(" ");
		
		for (String string : words) {
		    string = string.substring(0, 1).toUpperCase() + string.substring(1);
		    System.out.print(string + " ");
		}
		System.out.println();
	    }
	    
	    inputFile.close();
	} else {
	    System.out.println("File sa tim imenom ne postoji.");
	}
	

    }

}
