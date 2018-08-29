import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PonavljanjeSlova {

    public static void main(String[] args) {
	/** Napisati program koji pita korisnika da unese ime filea.
	 *  Nakon što je korisnik unio ime filea, program vraća koliko
	 *  se puta koje slovo ponovilo u fileu. Program pravi razliku
	 *  između velikih i malih slova – to jeste, vraća koliko puta se
	 *  ponovilo slovo 'a' i koliko se puta ponovilo slovo 'A'.
	*/

	java.util.Scanner input = new java.util.Scanner(System.in);
	System.out.print("Unseite ime file-a: ");
	String fileName = input.next();
	
	java.io.File file = new java.io.File(fileName);
	
	try {
	    brojMalihSlova(file);
	    brojVelikihSlova(file);
	    
	} 
	catch (FileNotFoundException e) {
	    System.out.println(e.getMessage());
	}
		
	input.close();
	
    }
    
    /** metoda za prebrojavanje i ispisivanje malih slova iz prosledjenog file-a */
    public static void brojMalihSlova(File file) throws FileNotFoundException {
	int[] brojacMalihSlova = new int[26]; // niz u koji ce se brojiti slova indeks 0 ce biti 'a'
	@SuppressWarnings("resource")
	Scanner input = new Scanner(file); // Scanner za file
	
	// probrojati mala slova i povecati brojac
	while(input.hasNextLine()) {
	    String line = input.nextLine();
	    for (int i = 0; i < line.length(); i++) {
		if(Character.isLowerCase(line.charAt(i))) {
		    brojacMalihSlova[line.charAt(i) - 'a']++;
		}
	    }
	}
	// ispisati slova 5 karaktera po liniji
	for (int i = 0; i < brojacMalihSlova.length; i++) {
	    if((i + 1) % 5 == 0) {
		System.out.println((char) (i + 'a') + ": " + brojacMalihSlova[i]);
	    } else {
		System.out.print((char)(i + 'a') + ": " + brojacMalihSlova[i] + ",\t");
	    }
	}
	System.out.println();
    }

    /** metoda za prebrojavanje i ispisvanje vellikih slova iz prosledjenog file-a */
    public static void brojVelikihSlova(File file) throws FileNotFoundException {
	int[] brojacVelikihSlova = new int[26]; // niz u koji ce se brojiti slova indeks 0 ce biti 'A'
	@SuppressWarnings("resource")
	Scanner input = new Scanner(file); // Scanner za file
	
	// preobrojati velika slova i povecati brojac
	while(input.hasNextLine()) {
	    String line = input.nextLine();
	    for (int i = 0; i < line.length(); i++) {
		if(Character.isUpperCase(line.charAt(i))) {
		    brojacVelikihSlova[line.charAt(i) - 'A']++;
		}
	    }
	}
	
	// ispisati slova 5 karaktera po liniji
	for (int i = 0; i < brojacVelikihSlova.length; i++) {
	    if((i + 1) % 5 == 0) {
		System.out.println((char)(i + 'A') + ": " + brojacVelikihSlova[i]);
	    } else {
		System.out.print((char)(i + 'A') + ": " + brojacVelikihSlova[i] + ",\t");
	    }
	}
	System.out.println();
    }
    
}
