package Random;

public class Random {
	public int rand()
	{
		int random = (int) (Math.random()*5)+1;		//eine zuf�llige Zahl zwischen 1 und einschlie�lich 5 wird generiert
		return random;								//Zufallszahl wird an main() zur�ckgegeben
	}
}