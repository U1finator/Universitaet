package SumUp;

public class Sum {
	public int sum_iter(int number)		//die iterative Methode zur Summenberechnung
	{
		int sum = 0;	//Initialisierung und Deklarierung einer Summenvariable
		for(int i = 1; i <= number; i++)	//Schliefe die i immer um einen hochrechnet bis i gleich gro� ist wie number
		{
			sum = sum + i;		//Summe + den Wert von i
		}
		return sum;		//Summe wird zur�ckgegeben
	}
	
	public int sum_recur(int number)	//die rekursive Methode zur Summenberechnung
	{
		if(number == 1)		//wenn number 1 ist, wird 1 zur�ckgegeben
		{
			return 1;
		}
		else	//sonst wird number + Ergebnis von der rekursiven Methode mit number-1, gerechnet
		{
			return number + sum_recur(number-1);
		}
	}
}