package Uebungsblatt2;
import java.util.*;

public class Nr1 
{
	public String schaltjahr()
	/*
	 * eine Methode um festzustellen od es sich bei einer Jahreszahl um ein Schaltjahr und/oder ein S�kularjahr handelt
	 */
	{
		Scanner scan = new Scanner(System.in);
		int year;
		String schalt;
		
		System.out.println("Bitte geben sie eine Jahreszahl an");
		year = scan.nextInt();		//Abfrage der Jahreszahl
		scan.close();
		if(year%4 == 0 && year%100 == 0 && year%400 == 0)	//Jahreszahl durch 4,100 und 400 teildbar, dann Schalt- und S�kularjahr
		{
			schalt = "Schalt- und S�kularjahr";
		}
		else if(year%4 == 0 && year%100==0 && year%400 != 0)  //Jahreszahl durch 4 und 100 teildbar, dann S�kularjahr
		{
			schalt = "S�kularjahr";
		}
		else if(year%4 == 0 && year%100!=0 && year%400 != 0)  //Jahreszahl nur durch 4 teildbar, dann Schaltjahr
		{
			schalt = "Schaltjahr";
		}
		else		//sonst weder Schalt- noch S�kularjahr
		{
			schalt = "kein Schaltjahr";
		}
		return schalt;
	}
}