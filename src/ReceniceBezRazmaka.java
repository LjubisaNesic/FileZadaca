import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReceniceBezRazmaka {

    public static void main(String[] args) throws FileNotFoundException {
	/**
	 * Napisati program koji prima kao argument ime filea. Nakon 
	 * što je program učitao file, vraća korisniku sve rečenice 
	 * iz filea sa razmacima između riječi uklonjenim. 
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
		System.out.println(line.replace(" ", ""));
	    }
	    inputFile.close();
	} else {
	    System.out.println("File sa tim imenom ne postoji.");
	}

    }

}
