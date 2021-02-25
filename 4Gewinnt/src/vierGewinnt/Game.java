package vierGewinnt;

public class Game {
	
	final char coinSpieler1 = 'X';
	final char coinSpieler2 = 'O';
	
	public final int sizeX = 7;
	public final int sizeY = 6;
	
	int[][] feld;
	
	int currentPlayer=1;
	
	public Game()
	{
		feld = new int[sizeX][sizeY];
	}
	
	/*
	 * Rückgabewerte: 
	 * 1 oder 2: Spielerstein wurde für Spieler 1/2 gesetzt
	 * 0 konnte nicht gesetzt werden (schon voll)
	 */
	public int setCoin(int spielerID, int slot)
	{
		if(feld[slot][0] != 1 || feld[slot][0] != 2)
		{
			int i = 0;
			
			while(feld[slot][i] == 0 || i == sizeY)
			{
				i++;
			}
			if(spielerID == 1)
			{
				feld[slot][i-1] = 1;
				return 1;
			}
			else
			{
				feld[slot][i-1] = 2;
				return 2;
			}
		}
		else
		{
			return 0;
		}
	}
	
	/*
	 * Rückgabe so wie setCoin(spielerID, slot), nur dass der Spieler
	 * automatisch gewählt wird (Spieler 1 beginnt)
	 */
	public int setCoin(int slot)
	{

		int ySlot = 0;
		
		for(int i = 0; i < sizeY;i++)
		{
			if(feld[slot][i] == 0)
			{
				ySlot = i;
			}
		}
		
		if(ySlot > sizeY)
		{
			return 0;
		}
		else
		{
			this.setXY(slot, ySlot, currentPlayer);
			
			if(currentPlayer == 1)
			{
				currentPlayer = 2;
			}
			else
			{
				currentPlayer = 1;
			}
			
			return currentPlayer;
		}
	}
	
	/*
	 * 0: kein Gewinner
	 * 1/2 Spieler 1/2 hat gewonnen
	 */
	public int isWinner()
	{
		/*
		 * In dieser Methode soll geprüft werden, ob es einen Gewinner gibt.
		 * Gewinner ist die Person, die vier Steine in einer Reihe setzt. 
		 * Eine Reihe kann horizontal, vertikal oder diagonal sein. Die Grenzen
		 * des Arrays müssen jedoch berücksichtigt werden.
		 */
		int winner = 0;
		int count = 0;
		int token;
		
		for(int c = 0; c <= 1; c++)		//Schleife zum durchgehen der Spieler
		{
			if(c == 0)
			{
				token = 1;	//Token Spieler 1 = X
			}
			else
			{
				token = 2;	//Token Spieler 2 = O
			}
			/*
			 * um zu überprüfen, ob in der horizontalen eine 4rer-Kette liegt
			 */
			for(int i = 0; i < sizeX; i++)	//in der äußeren Schleife werden die Y-Werte durchgegangen
			{
				count = 0;	//der Counter wird bei jeder neuen Zeile auf 0 gesetzt
				for(int j = 0; j < sizeY; j++)	//in der inneren Schleife werden die x-Werte durchgegangen
				{
					if(feld[i][j] == token)	//wenn der Wert eines Feldes, dem Token des gesuchten Spielers entspricht
					{
						count++;	//wird der Counter um einen erhöht
					}
					else	//falls nicht
					{
						count = 0;	//ist die Kette unterbrochen und der Counter wird auf 0 gesetzt
					}
				}
				if(count >= 4)	//wenn der Counter 4 oder mehr gleiche Tokens gefunden hat
				{
					winner = c;	//wird der Gewinner festgelegt
				}
				else
				{
					winner = 0;	//ansonsten gibt es noch keinen Gewinner
				}
			}
			if(winner == 0)		//wenn es noch keinen Gewinner gibt
			{
				/*
				 * Überprüfung auf die Vertikale Kette
				 */
				for(int i = 0; i < sizeX; i++)	//in der aüßeren Schleife werden nun die X-Werte durchgangen
				{
					count = 0;		//bei jedem neuen X-Wert wird der Counter auf 0 gesetzt
					for(int j = 0; j < sizeY; j++)	//in der inneren Schleife werden die Y-Werte durchgegangen
					{
						if(feld[i][j] == token)	//wenn das überprüfte Feld mit dem des Spielers übereinstimmt
						{
							count++;		//wird der Counter um einen erhöht
						}
						else	//falls nicht
						{
							count = 0;	//wird der Counter wieder zurück auf 0 gesetzt
						}
					}
					if(count >= 4)	//wenn der Counter 4 oder mehr gleiche Tokens gefunden hat
					{
						winner = c;	//wird der Gewinner festgelegt
					}
					else
					{
						winner = 0;	//ansonsten gibt es noch keinen Gewinner
					}
				}
			}
			if(winner == 0)	//wenn immer noch kein Gewinner gefunden wurde
			{
				/*
				 * überprüfung auf die Diagonale
				 */
				for(int i = 0; i < sizeX; i++)
				{
					for(int j = 0; j < sizeY; j++)
					{
						count = 0;
						for(int delta = 0; delta < 4; delta++)		//4 weil delta nur auf 4 hintereinanderfolgende Symbole prüfen soll
						{
							if(feld[i+delta][j+delta] == token)	//wenn in der Diagonalen ein gesuchtes Token erscheint
							{
								count++;	//wird der Counter erhöht
							}
							else	//sonst ist die Kette unterbrochen
							{
								count = 0;	//und der Counter wird auf 0 zurückgesetzt
							}
						}
					}
				}
				if(count >= 4)
				{
					winner = c;
				}
				else
				{
					winner = 0;
				}
			}
			
		}
		
		return winner;
	}
	
	
	/*
	 * 0: nichts gesetzt
	 * 1: Spieler1 hat einen Coin an X,Y
	 * 2: Spieler2 hat einen Coint an X,Y
	 */
	public int getXY(int x, int y)
	{
		
		return feld[x][y];
	}
	
	public void setXY(int x, int y, int spielerID)
	{
		feld[x][y]=spielerID;
	}
	
	public String toString()
	{
		
		for (int y=sizeY-1;y>=0;y--)
		{
			StringBuffer b = new StringBuffer();
			b.append('|');
			for (int x=0;x<sizeX;x++)
			{
				if (getXY(x,y)==1)
					b.append(coinSpieler1);
				else if (getXY(x,y)==2)
					b.append(coinSpieler2);
				else
					b.append(' ');
					
			}
			b.append('|');
			System.out.println(b);
			
		}
		
		
		return "";
	}
	
	public static void main(String[] args)
	{
		
		Game g = new Game();
		
		System.out.println(g);
	}
	
}