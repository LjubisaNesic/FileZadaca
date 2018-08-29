import java.io.File;
import java.util.Scanner;

public class ObrnutRedoslijedRijeci {

    public static void main(String[] args) throws Exception {
	/**
	 * Napisati program koji kao argument prima ime filea. U fileu – jedna linija,
	 * jedna rečenica. Ispisati sve rečenice iz filea u obrnutom redosljedu riječi.
	 * (Npr. ukoliko je prva rečenica u fileu “Hello World“ program treba da ispiše
	 * “World Hello“)
	 */

	Scanner inputConsole = new Scanner(System.in);
	System.out.print("Unesite ime filea(obrnutRedoslijed): ");
	String fileName = inputConsole.nextLine();
	File file = new File(fileName);
	inputConsole.close();

	if (file.exists()) {

	    Scanner inputFile = new Scanner(file);
	    
	    while (inputFile.hasNextLine()) {
		String line = inputFile.nextLine();
		String[] words = line.split(" ");
		
		for (int i = words.length - 1; i >= 0; i--) {
		    System.out.print(words[i] + " ");
		}
		System.out.println();
		
	    } inputFile.close();
	} else {
	    System.out.println("File sa tim imenom ne postoji.");
	}

    }

}
