package Uebung_3;

public class Nr4 
{
	public void mod3()
	{
		int number = 1;
		while(number <= 100)
		{
			if(number%3 == 0)	//wenn eine Zahl ohne Rest durch 3 teilbar ist
			{
				System.out.println(number + " ist durch 3 teilbar");		//füge den Zusatz 'ist durch 3 teilbar' hinzu
			}
			else
			{
				System.out.println(number);		//ansonsten gib nur die Zahl aus
			}
		}
	}
}