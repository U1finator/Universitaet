package SumUp;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		//ein Scanner zur Abfrage der Eingabe
		Sum sum = new Sum();		//neues Objekt der Klasse Sum
		
		String again = "n";
		do
		{
			System.out.println("Welche Zahl darf es sein?");
			int number = scan.nextInt();	//Abfrage der Zahl
		
			System.out.println("Das Ergebnis der iterativen Methode lautet: " + sum.sum_iter(number));		//die Summenberechnung durch die iterative Methode
			System.out.println("Das Ergebnis der rekursiven Methode lautet: " + sum.sum_recur(number));		//die Summenberechnung durch die rekursive Methode
			
			System.out.println("Zum Neustart 'ja' eingeben");
			again = scan.next();		//Abfrage ob das Programm Neugestartet werden soll
		}while(again == "ja");	//wenn die Eingabe 'ja' ist, wird das Programm von vorne gestartet
		
		scan.close();		//den Scanner schlie�en
	}
}