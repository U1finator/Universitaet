package Switch;

public class Alter {
	public String abfrage(int alter)
	{
		String back;
		switch(alter)
		{
		case 16:
			back = "Du darfst Mofa fahren und Bier trinken";
			break;
		case 18:
			back = "Du bist volljährig";
			break;
		default:
			back = "Das ist kein besonderes Alter";
		}
		return back;
	}
}