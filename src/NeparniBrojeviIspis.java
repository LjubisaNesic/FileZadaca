import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NeparniBrojeviIspis {

    public static void main(String[] args) throws FileNotFoundException {
	/**
	 * Napisati program koji učitava neodređen broj brojeva iz
	 * filea te ispisuje samo neparne brojeve. File možete nasumičpno
	 *  generisati. Program može da prima ime filea kao argument a i ne mora. Na vama je. 
	 */
	
	Scanner inputConsole = new Scanner(System.in);
	System.out.print("Unesite ime filea: ");
	String fileName = inputConsole.nextLine();
	File file = new File(fileName);
	inputConsole.close();
	
	if (file.exists()) {
	    Scanner inputFile = new Scanner(file);
	    int count = 0;
	    while(inputFile.hasNext()) {
		int ocitaniBroj = inputFile.nextInt();
		if (ocitaniBroj % 2 != 0) {
		    
		    if (count % 10 == 0)
		    System.out.println(ocitaniBroj + " ");
		    count++;
		} else {
		    System.out.print(ocitaniBroj + " ");
		    count++;
		}
	
	    }
	    inputFile.close();
	} else {
	    System.out.println("File sa tim imenom ne postoji.");
	}
	    

    }

}
