package SumUp;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		//ein Scanner zur Abfrage der Eingabe
		Sum sum = new Sum();		//neues Objekt der Klasse Sum
		
		System.out.println("Welche Zahl darf es sein?");
		int number = scan.nextInt();	//Abfrage der Zahl
		
		System.out.println("Das Ergebnis der iterativen Methode lautet: " + sum.sum_iter(number));		//die Summenberechnung durch die iterative Methode
		System.out.println("Das Ergebnis der rekursiven Methode lautet: " + sum.sum_recur(number));		//die Summenberechnung durch die rekursive Methode
		
		scan.close();		//den Scanner schlieﬂen
	}

}
