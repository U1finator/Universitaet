package Zinsen;

public class Zinsen {
	public void rechner(double stand, int jahre, double satz)
	{
		for(int i = 1; i <= jahre; i++)
		{
			stand = stand * (1 + satz);
			System.out.println("Nach " + i + " Jahren beträgt der Kontostand: " + stand + "€");
		}
	}
}