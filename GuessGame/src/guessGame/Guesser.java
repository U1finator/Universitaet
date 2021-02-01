package guessGame;

import java.util.Scanner;

public class Guesser 
{
	public int randit()	//Methode zur generierung einer zuf�lligen Zahl
	{
		int rand = (int) (Math.random()*100)+1;		//generiere eine zuf�llige ganze Zahl zwischen 1 und 100
		return rand;
	}
	public void guess(int number)	//das Ratespiel
	{
		boolean guessed = false;	//Wahrheitswert, ob die Zahl erraten wurde oder nicht
		Scanner scan = new Scanner(System.in);	//neuer Scanner zur Inputabfrage
		int counter = 0;	//Z�hler wie oft geraten wurde
		
		while(guessed != true && counter < 10)	//solange die Zahl nicht erraten wurde und es noch nicht 10mal Versucht wurde
		{
			System.out.println("Auf welche Zahl zwischen 1 und einschlie�lich 100 tippen Sie?");
			int test = scan.nextInt();	//Abfrage der geratenen Zahl
			
			if(test == number)	//wenn Zahl erraten wurde
			{
				System.out.println("Gl�ckwunsch, das war richtig");
				guessed = true; //Wahrheitswert auf wahr setzen um zu zeigen, dass die Zahl erraten wurde
			}
			else if(test < number) //wenn die geratene Zahl kleiner als die gesuchte Zahl ist
			{
				System.out.println("Leider falsch. Die gesuchte Zahl ist gr��er");
				counter++;	//Versuchsz�hler um einen erh�hen
			}
			else if(test > number) //wenn die geratene Zahl gr��er als die gesuchte Zahl ist
			{
				System.out.println("Leider falsch. Die gesuchte Zahl ist kleiner");
				counter++;	//Versuchsz�hler um einen erh�hen
			}
		}	
		System.out.println("M�chten sie es nochmal versuchen?");
		System.out.println("F�r ja dr�cken sie die 1, f�r nein dr�cken sie die 2");
		int temp =  scan.nextInt();	//Abfrage des Userinputs
		
		if(temp == 1)	//input == 1, dann wird das Spiel neugestartet
		{
			guess(randit());
		}
		else	//input nicht gleich 1, dann wird das Programm beendet
		{
			System.out.println("Vielen Dank f�r das Spielen");
		}
		scan.close();	//den Scanner schlie�en
	}
}