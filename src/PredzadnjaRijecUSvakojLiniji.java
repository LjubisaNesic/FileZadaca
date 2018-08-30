import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PredzadnjaRijecUSvakojLiniji {

    public static void main(String[] args) throws FileNotFoundException {
	/** Napisati program koji prima kao argument ime fiela. Nakon
	 *  što je program učitao file, nalazi predzadnju riječ na 
	 *  svakoj liniji teksta te ispisuje istu korisniku. 
	*/
	
	int lineCount = 1;

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
		System.out.println("Linija " + lineCount + ". predzdanja rijec: " + words[words.length - 2]);
	    }
	    inputFile.close();
	} else {
	    System.out.println("File sa tim imenom ne postoji.");
	}
    }

}
