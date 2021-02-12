package arrays;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Calc calc = new Calc();		//neues Objekt der Klasse Calc
		Scanner scan = new Scanner(System.in);	//neuer Scanner
		
		System.out.println("Wie viele Zahlen möchten sie insgesamt eingeben??");
		int in = scan.nextInt();
		int[] ary = new int[in];	//Arrays der eingegeben Länge wird erstellt
		ary = calc.fill(ary);		//Methode um das Array mit Werten zu füllen
		calc.calculate(ary);	//Methode um die Summe der Zahlen auszugeben
		calc.avarge(ary);		//Methode um den Durchscnitt der Zahlen auszugeben
		
		scan.close();	//schließen des Scanners
	}
}