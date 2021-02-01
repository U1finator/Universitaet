package Switch;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Alter age = new Alter();
		Steuer tax = new Steuer();
		
		System.out.println("Wie hoch ist ihr Gehalt??");
		int gehalt = scan.nextInt();
		System.out.println("Ihre Steuern sind: " + tax.betrag(gehalt) + "€");
		
		System.out.println("Wie alt sind Sie?");
		int alter = scan.nextInt();
		System.out.println(age.abfrage(alter));
	}
}