package Random;

public class Random {
	public int rand()
	{
		int random = (int) (Math.random()*5)+1;		//eine zufällige Zahl zwischen 1 und einschließlich 5 wird generiert
		return random;								//Zufallszahl wird an main() zurückgegeben
	}
}