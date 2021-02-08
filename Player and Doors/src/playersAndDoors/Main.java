package playersAndDoors;

import java.util.Random;
import java.util.Scanner;

public class Main 
{
	public static void main (String[] args)
	{	
		java.awt.Point player = new java.awt.Point();	//ein neuer Spieler wird erstellt
		player.x = player.y = 0;	//Koordinaten des Spielers sind (0,0)
		
		Random rand = new Random();
		
		java.awt.Point door = new java.awt.Point();		//eine neue Tür zum Suchen wird erstellt
		door.setLocation(rand.nextInt(10),  rand.nextInt(10));	//die Tür wird an eine zufällige Koordinate gestellt wobei 0<= x <= 10 und 0<= y <= 10
		
		System.out.println("Abstand von Tür zum Spieler ist " + player.distance(door));		//der Abstand von Spieler und Tür wird ausgegeben
		
		Scanner scan = new Scanner(System.in);
		int xplus = 0;
		int yplus = 0;
		while(player.equals(door) != true)	//solange der Player nicht auf der Tür steht
		{
			System.out.println("Bitte geben Sie auf welche x Koordinate Sie gehen möchten");
			xplus = scan.nextInt();
			System.out.println("Bitte geben Sie auf welche y Koordinate Sie gehen möchten");
			yplus = scan.nextInt();
			player.move(xplus, yplus);
			if(player.equals(door) == true)	//wenn die Tür gefunden wurde wird eine Erfolgsmeldung ausgegeben
			{
				System.out.println("Sie haben die Tür gefunden");
				break;
			}
			else if(player.equals(door) != true)
			{
				System.out.println("Sie haben die Tür nicht gefunden");
				System.out.println("Die Tür ist noch " + player.distance(door) + "m enternt");
				System.out.println("Ihre Aktuelle Position: " + player.getLocation());
			}
		}
	}
}