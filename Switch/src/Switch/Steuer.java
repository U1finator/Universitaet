package Switch;

public class Steuer {
	public double betrag(double gehalt)
	{
		double steuer;
		if(gehalt <= 12000)
		{
			steuer = gehalt*0.12;
		}
		else if(gehalt <= 20000)
		{
			steuer = gehalt*0.15;
		}
		else if(gehalt <= 30000)
		{
			steuer = gehalt*0.20;
		}
		else if(gehalt > 30000)
		{
			steuer = gehalt*0.25;
		}
		else
		{
			System.out.println("Invalid input");
			steuer = 0;
		}
		return steuer;
	}
}