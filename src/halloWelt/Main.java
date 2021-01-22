package halloWelt;

public class Main 
{
	public static void main(String[] args) // gibt tolle Zitate aus
	{
		String[] ary = new String[10]; //erstellt ein neues Array
		fill(ary); //übergibt das leere Array an die Methode fill()
		for(int i = 0; i < ary.length; i++)  //gibt die einzelnen Werte des Arrays aus
		{
			System.out.println(ary[i]);
		}
	}
	public static void fill(String[] ary) 
	{
		//füllt den Array mit Zitaten aus Serien und Filmen
		ary[0] = "I'm Batman";
		ary[1] = "I have the high ground";
		ary[2] = "I'll be back!";
		ary[3] = "My name is Bond. James Bond.";
		ary[4] = "Hello, I'm the doctor.";
		ary[5] = "He is beginning to believe.";
		ary[6] = "You're a wizard, Harry.";
		ary[7] = "I Do That Quite A Lot Yet People Are Always Surprised.";
		ary[8] = "Isn't there somewhere a captain missing?";
		ary[9] = "yippee ki yay motherfucker";		
	}
}