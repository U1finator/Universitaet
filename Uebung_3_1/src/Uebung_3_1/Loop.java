package Uebung_3_1;

public class Loop {
	public void turn()
	{
		int n = 2;
		int s = 1;
				
		while(n <= 5)
		{
			System.out.print((s*=n++) + " ");
			n++;
		}
	}
}