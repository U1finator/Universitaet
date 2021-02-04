package Uebung_3;

public class Nr5 
{
	public void part_a()
	{
		for(int i = 0; i <= 5; i++)	//Anzahl an Zeilen wird
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print("*");	//Anzahl der Zeile entspricht Anzahl an Sternen
			}
			System.out.println("");	//Zeilenumbruch
		}
	}
	
	public void part_b()
	{
		int max, ma, c, d = 1;
        System.out.println("Bitte Höhe angeben");
        max = new java.util.Scanner(System.in).nextInt();
        ma = max;
        String One, Two; 
        One = " ";
        Two = "*";
        System.out.println("" +  One.repeat(max) + Two.repeat(1));
        for(int i = 2; i <= ma; i++)
        {
            c = i;
            System.out.println("" +  One.repeat(max -1) + Two.repeat(c + d));
            max = max - 1;
            d = d + 1;
        }
	}
}