package arrays;

import java.util.Scanner;

public class Calc 
{
	public void calculate(int[] number)	//Methode um die Summe der Zahlen in dem Array zu berechnen
	{
		int sum = 0;	//eine Summenvariable deklarieren und initialisieren
		
		for(int i = 0; i< number.length; i++)
		{
			sum = sum + number[i];	//der Wert der Variable wird mit dem Wert des Arrays an der Stelle i addiert
		}
		System.out.println("Die Summe aller Zahlen ist: " + sum);	//Ausgabe der Summe
	}
	
	public void avarge(int[] number)		//eine Methode um den Durchschnitt zu berechnen
	{
		int sum = 0;
		
		for(int i = 0; i< number.length; i++)		//siehe calculate
		{
			sum = sum + number[i];
		}
		System.out.println("Der Durchschnitt beträgt: " +sum/number.length);	//Berechnung und ausgabe des Durchschnitts
	}

	public int[] fill(int[] ary) 
	{
		int j = 1;
		Scanner scanner = new Scanner(System.in);
		
		
		for(int i = 0; i < ary.length; i++)	//Der User wird nach Zahlen für sein Array gefragt
		{
			System.out.println("wie lautet die " + j + ". Zahl?");
			ary[i] = scanner.nextInt();		//der eingegebene Wert wird einer Stelle im Array hinzugewiesen
			j++;
		}
		scanner.close(); //den Scanner schließen
		return ary;		//das gefüllt Array wird zurückgegeben
	}
}