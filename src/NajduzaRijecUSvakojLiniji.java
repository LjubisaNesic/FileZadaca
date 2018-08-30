import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NajduzaRijecUSvakojLiniji {

    public static void main(String[] args) throws FileNotFoundException {
	/**
	 * Napisati program koji prima kao argument ime filea.
	 * Nakon što je program učitao file, nalazi najdužu riječ
	 *  u svakoj liniji teksta te ispisuje istu korisniku.
	*/
	String longestWord = "";
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
		longestWord = words[0];
		
		for(int i = 0; i < words.length; i++) {
		    if (words[i].length() > longestWord.length()) {
			longestWord = words[i];
		    }
		    
		}
		System.out.println("Linija " + lineCount +". najduza rijec: "+ longestWord);
		lineCount++;
	    }
	    inputFile.close();
	} else {
	    System.out.println("File sa tim imenom ne postoji.");
	}

    }

}
