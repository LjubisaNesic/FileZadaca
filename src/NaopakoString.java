import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NaopakoString {

    public static void main(String[] args) throws Exception {
	/**
	 * Napisati program koji pita korisnika da unese neki string. Kada korisnik
	 * unese string, program sprema isti string u file te ispisuje korisniku sve
	 * stringove iz filea naopako.
	 */

	ArrayList<String> ucitaniStringovi = new ArrayList<>(); // lista u koju snimam vec unsesene stringove ako postoje

	// piatit korisnika za string i incijalizirati String
	java.util.Scanner input = new java.util.Scanner(System.in);
	System.out.print("Unesite neki String: ");
	String uneseniString = input.nextLine();

	// instacizirati file u koji ce biti spremljeni stringovi
	java.io.File file = new java.io.File("StringoviNaopako.txt");

	if (file.exists()) { // ako postoji file ocitaj stringove i dodaj u listu
	    Scanner fileInput = new Scanner(file);
	    while (fileInput.hasNextLine()) {
		ucitaniStringovi.add(fileInput.nextLine());
	    }
	    ucitaniStringovi.add(uneseniString); // dodaj uneseni string u listu
	    fileInput.close();
	} else {
	    ucitaniStringovi.add(uneseniString); // dodaj unseni string ako ne postoji
	}

	try (java.io.PrintWriter output = new java.io.PrintWriter(file);) {
	    for (int i = 0; i < ucitaniStringovi.size(); i++) {
		output.println(ucitaniStringovi.get(i));

	    }
	}

	// pozvati metodu za ispisivanje stringova naopako
	try {
	    ispisiStringoveNaopako(file);
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}

	input.close();

    }

    /**
     * metoda za ispisivanje stringova naopako
     * 
     * @throws FileNotFoundException
     */
    public static void ispisiStringoveNaopako(File file) throws Exception {

	ArrayList<String> listaStringova = new ArrayList<>(); // niz u koji ce biti spremljeni String-ovi

	@SuppressWarnings("resource")
	Scanner input = new Scanner(file);

	while (input.hasNextLine()) { // dodaji Stringove iz file dok ih ima u niz
	    String line = input.nextLine();
	    listaStringova.add(line);
	}
	
	for (int i = (listaStringova.size() - 1); i >= 0; i--) { // ispisi na konzoli pocev od kraja
	    System.out.println(listaStringova.get(i));

	}
    }
}
