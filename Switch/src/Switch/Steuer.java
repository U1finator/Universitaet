package Switch;

public class Steuer {
	public double betrag(double gehalt)
	{
		double steuer;		//R�ckgabewert
		if(gehalt <= 12000)		//Gehalt kleiner 12000
		{
			steuer = gehalt*0.12;	//R�ckgabewert als Gehalt mal Steuersatz
		}
		else if(gehalt <= 20000)	//Gehalt bis einschlie�lich 20000 und gr��er als 12000
		{
			steuer = gehalt*0.15;	//R�ckgabewert als Gehalt mal Steuersatz
		}
		else if(gehalt <= 30000)	//Gehalt bis einschlie�lich 30000und gr��er als 20000
		{
			steuer = gehalt*0.20;	//R�ckgabewert als Gehalt mal Steuersatz
		}
		else if(gehalt > 30000)		//Gehalt �ber 30000
		{
			steuer = gehalt*0.25;	//R�ckgabewert als Gehalt mal Steuersatz
		}
		else						//Idiotenpr�vention
		{
			System.out.println("Invalid input");
			steuer = 0;
		}
		return steuer;
	}
}