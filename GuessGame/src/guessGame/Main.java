package guessGame;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		Guesser guess = new Guesser();	//neues Objekt der Klasse Guesser
		boolean again = false;	//Wahrheitswert f�r die Abfrage ob nochmal gespielt werden soll
		int temp;
		
		System.out.println("Dies ist ein Spiel, indem Sie eine Zahl zwischen 1 und 100 erraten m�ssen.");	//Erkl�rung des Spiels
		System.out.println("Daf�r haben sie 10 Versuche!");
		System.out.println("Viel Gl�ck");
		guess.guess(guess.randit());	//Start des Spiels
	}
}