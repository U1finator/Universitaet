package Switch;

public class Steuer {
	public double betrag(double gehalt)
	{
		double steuer;		//Rückgabewert
		if(gehalt <= 12000)		//Gehalt kleiner 12000
		{
			steuer = gehalt*0.12;	//Rückgabewert als Gehalt mal Steuersatz
		}
		else if(gehalt <= 20000)	//Gehalt bis einschließlich 20000 und größer als 12000
		{
			steuer = gehalt*0.15;	//Rückgabewert als Gehalt mal Steuersatz
		}
		else if(gehalt <= 30000)	//Gehalt bis einschließlich 30000und größer als 20000
		{
			steuer = gehalt*0.20;	//Rückgabewert als Gehalt mal Steuersatz
		}
		else if(gehalt > 30000)		//Gehalt über 30000
		{
			steuer = gehalt*0.25;	//Rückgabewert als Gehalt mal Steuersatz
		}
		else						//Idiotenprävention
		{
			System.out.println("Invalid input");
			steuer = 0;
		}
		return steuer;
	}
}