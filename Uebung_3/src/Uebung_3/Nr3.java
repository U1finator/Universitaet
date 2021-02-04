package Uebung_3;
import java.util.Scanner;

public class Nr3 
{
	public void half()
	{
		Scanner scan = new Scanner(System.in);		//neuer Scanner
		double number = 0;
		do		//Abfrage einer Zahl die zwischen 1 und 100 liegt und überprüft ob die Eingabe korrekt ist
		{
		System.out.println("Geben sie eine Zahl zwischen 1 und 100 ein");	
		number = scan.nextDouble();
		}while(number <= 100 && number >=1);
		
		while(number >= 0.001)	//solange die Eingabe größer gleich 0.001 ist
		{
			System.out.println(number + ";"); 	//gib die Zahl aus
			number = number/2;	//halbiere die Zahl
		}
		
		boolean again = false;	
		int input;
		do	//Abfrage zum Programmneustart
		{
			System.out.println("Zum Neustart des Programms geben sie '1' ein.");
			input = scan.nextInt();
			if(input == 1)
			{
				again = true;	//wenn again true ist kann wird das Programm neugestartet
				half();
			}
			else
			{
				again = false; 		//ansonsten wird again auf false gesetzt und das Programm wird beendet
			}
		}while(again = true);
		scan.close();	//schließen des Scanners
	}
}