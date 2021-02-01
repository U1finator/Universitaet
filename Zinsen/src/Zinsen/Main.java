package Zinsen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Zinsen zins = new Zinsen();
		
		System.out.println("Wie hoch ist der Kontostand?");
		double stand = scan.nextDouble();
		System.out.println("Wie viele Jahre sollen berechnet werden?");
		int years = scan.nextInt();
		System.out.println("Wie hoch ist der Zinssatz? (in Dezimalschreibweise bitte)");
		double satz = scan.nextDouble();
		if(satz >= 1)
		{
			satz = satz - 1;
			zins.rechner(stand, years, satz);
		}
		else if(satz < 1)
		{
			zins.rechner(stand, years, satz);
		}
		else
		{
			System.out.println("Error");
		}
	}
}