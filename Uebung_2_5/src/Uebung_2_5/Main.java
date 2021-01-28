package Uebung_2_5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Zins zins = new Zins();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bitte geben sie die Anzahl an Jahren ein:");
		int jahre = scan.nextInt();
		System.out.println("Geben sie nun bitte das Kapital an:");
		double kapital = scan.nextDouble();
		System.out.println("Wie lautet der Zinssatz? (in dezimalschreibweise bitte)");
		double zinssatz = scan.nextDouble();
		scan.close();
		
		System.out.println("Ihr Kapital nach "+ jahre + " Jahren beträgt: " + Zins.zins(jahre, kapital, zinssatz));
	}
}