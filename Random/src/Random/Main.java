package Random;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		Random rand = new Random();				//neues Objekt der Klasse Random wird erstellt
		Scanner scan = new Scanner(System.in);	//ein Scanner für die Interfaceabfrage wird erstellt
		int number = rand.rand();				//eine zufällige Zahl wird generiert
		System.out.println("Bitte gebe eine Zahl zwischen 1 und 5 an, von der Sie denken, dass sie der Computer auswählt.");
		int guess = scan.nextInt();				//die Eingabe des Benutzers wird abgefragt
		
		if(guess == number)						//Abgleich ob Zufallszahl gleich groß ist wie die Zahl des Benutzers
		{
			System.out.println("Sie haben richtig geraten");		//Ausgabe wenn die Zufallszahl der Benutzerzahl entspricht
		}
		else
		{
			System.out.println("Das war leider nicht richtig");		//Ausgabe wenn die Zufallszahl nicht mit der Benutzerzahl übereinstimmt
			System.out.println("Die richtige Zahl ist: " + number);
		}
		System.out.println("Dieses Programm endet hier. Für einen erneuten Versuch starten sie dieses Programm neu");
	}
}