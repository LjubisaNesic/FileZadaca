import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePropetis {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	/**
	 * Napisati program koji kao argument prima ime filea te:
	 * a. vraca broj karaktera u datom fileu 
	 * b. vraca broj rijeci u datom fileu 
	 * c. vraca broj linija teksta u datom fileu
	 * 
	 * Rijeci su razdvojene jednim spaceom.
	 */

	java.util.Scanner input = new java.util.Scanner(System.in);
	System.out.print("Unesite ime filea: ");
	String fileName = input.nextLine();

	java.io.File file = new java.io.File(fileName);

	try {
	    System.out.println("Broj karaktera: " + brojKaraktera(file) + ", broj rijeci: " + brojRijeci(file)
		    + ", broj linija: " + brojLinija(file));
	} catch (Exception ex) {
	    System.out.println(ex.getMessage());
	}
	
	input.close();

    }

    /** metoda koja broji reci iz prosledjenog file-a */
    public static int brojRijeci(File file) throws FileNotFoundException {
	@SuppressWarnings("resource")
	Scanner input = new Scanner(file);
	int brojRijeci = 0;
	while (input.hasNext()) {
	    brojRijeci++;
	    input.next();
	}
	return brojRijeci;
    }

    /** metoda koja broji karaktere iz prosledjenog file-a */
    public static int brojKaraktera(File file) throws FileNotFoundException {
	@SuppressWarnings("resource")
	Scanner input = new Scanner(file);
	int brojKarakera = 0;
	while (input.hasNextLine()) {
	    String line = input.nextLine();
	    brojKarakera += line.length();
	}
	return brojKarakera;
    }

    /** metoda koja broji linije iz prosledjenog file-a */
    public static int brojLinija(File file) throws FileNotFoundException {

	@SuppressWarnings("resource")
	Scanner input = new Scanner(file);
	int brojLinija = 0;

	while (input.hasNextLine()) {
	    brojLinija++;
	    input.nextLine();
	}
	return brojLinija;
    }

}
