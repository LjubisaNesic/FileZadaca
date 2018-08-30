import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SkraceneRecenice {

    public static void main(String[] args) throws FileNotFoundException {

	/**
         * Napisati program koji kao argument prima ime filea. Nakon što je korisnik
         * unio ime filea, program prolazi kroz file te ispisuje 
         * rečenice iz filea po sljedećim pravilima: 
         * a. Ukoliko je dužina rečenice manja od 55 karaktera, ispisati rečenicu bez ikakvih promjena. 
         * b. Ukoliko je dužina rečenice veća od 55 karaktera, promijeniti rečenicu na sljedeći način:
         	* I. Smanjiti dužinu rečenice na 40 karaktera
         	* II. Dodati string ... <Read More> na kraj rečenice
         	* III. Ispisati promjenjenu rečenicu na konzoli
        */

	String dodaniString = "... <Read More>";

	Scanner inputConsole = new Scanner(System.in);
	System.out.print("Unesite ime filea: ");
	String fileName = inputConsole.nextLine();
	File file = new File(fileName);
	inputConsole.close();

	if (file.exists()) {

	    Scanner inputFile = new Scanner(file);

	    while (inputFile.hasNextLine()) {
		String line = inputFile.nextLine();
		if (line.length() > 55) {
		    	System.out.print(line.substring(0, 40));
		    	System.out.print(dodaniString);
		    	System.out.println();
		} else {
		    System.out.println(line);
		}
	    }
	    inputFile.close();
	} else {
	    System.out.println("File sa tim imenom ne postoji.");
	}
    }

}