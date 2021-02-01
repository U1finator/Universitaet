package Switch;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		//neuer Scanner
		Alter age = new Alter();		//neues Objekt der Klasse Alter
		Steuer tax = new Steuer();		//neues Objekt der Klasse Steuer
		
		System.out.println("Wie hoch ist ihr Jahresgehalt??");		//Abfrage nach der Höhe des Gehaltes
		int gehalt = scan.nextInt();		//Gehaltseingabe wird abgefragt
		System.out.println("Ihre Steuern sind: " + tax.betrag(gehalt) + "€");		//Die Höhe der Steuern wird ausgegeben
		
		System.out.println("Wie alt sind Sie?");	//Frage die man keiner Frau stellen darf
		int alter = scan.nextInt();		//Abfrage der Usereingabe
		System.out.println(age.abfrage(alter));		//Ausgabe ob Alter ein besonderes Alter ist oder nicht
		scan.close();		//Ende der Usereingabeabfrage
	}
}