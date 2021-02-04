package Uebung_3;
import java.util.Scanner;

public class Nr2 {
	public void Nr2_a()
	{
		double number = 50;
		
		while(number > 24)		//solgane number größer als 24 ist, wird von number ausgegeben und dann 2.5 abgezogen
		{
			System.out.print(number + "; ");
			number = number -2.5;
		}
	}
	
	public void Nr2_b()
	{
		double sum = 0, average = 0, number = 50;
		int counter = 0;	//counter ist die Anzahl an Zahlen 
		
		while(number > 24)		//solgane number größer als 24 ist, wird von number ausgegeben und dann 2.5 abgezogen
		{
			System.out.print(number + "; ");
			sum = sum + number;		//sum wird um number erhöht um die Summe zu berechnen
			average = average + number; //average wird um number erhöht
			number = number -2.5;
			counter++;
		}
		average = average/counter; //mittelwert wird berechnet
		System.out.println(" "); //um eine neue Zeile zu beginnen
		System.out.println("Die Summer der Zahlen ist: " + sum);	//Ausgabe der Summe
		System.out.println("Der Mittelwert ist: " + average); //Ausgabe des Mittelwerts
	}
	
	public void Nr2_c()
	{
		Scanner scan = new Scanner(System.in);	//erstellung eines Scanners
		double sum = 0, average = 0;
		int counter = 0;	//counter ist die Anzahl an Zahlen 
		
		System.out.println("Wie hoch ist denn der Startwert?");
		double number = scan.nextDouble();	//Abfrage des Startwertes
		System.out.println("Was ist der Endwert?");
		double end = scan.nextDouble();		//Abfrage des Endwertes
		System.out.println("Wie groß ist die Schrittweite?");
		double step = scan.nextDouble();	//Abfrage der Schrittweite
		
		
		
		while(number > (end-0.1))		//solgane number größer als 24 ist, wird von number ausgegeben und dann 2.5 abgezogen
		{
			System.out.print(number + "; ");
			sum = sum + number;		//sum wird um number erhöht um die Summe zu berechnen
			average = average + number; //average wird um number erhöht
			number = number - step;
			counter++;
		}
		average = average/counter; //mittelwert wird berechnet
		System.out.println(" "); //um eine neue Zeile zu beginnen
		System.out.println("Die Summer der Zahlen ist: " + sum);	//Ausgabe der Summe
		System.out.println("Der Mittelwert ist: " + average); //Ausgabe des Mittelwerts
		scan.close();	//schließen des Scanners
	}
}