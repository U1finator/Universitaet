package Uebung_2_5;

public class Zins {
	public static double zins(int jahre, double kapital, double zinssatz)
	{
		zinssatz++;
		for(int i = 0; i < jahre; i++)
		{
			kapital *= zinssatz;
		}
		return Math.round(kapital*100.0)/100.0;
	}
}