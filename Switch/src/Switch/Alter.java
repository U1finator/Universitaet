package Switch;

public class Alter {
	public String abfrage(int alter)
	{
		String back;	//Rückgabe String
		switch(alter)	//Switch-Case Abfrage nach Altern
		{
		case 16:		//mit 16 Jahren
			back = "Du darfst Mofa fahren und Bier trinken";
			break;
		case 18:		//mit 18 Jahren
			back = "Du bist volljährig";
			break;
		default:		//sonstige Eingaben
			back = "Das ist kein besonderes Alter";
		}
		return back;
	}
}