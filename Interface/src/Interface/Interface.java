package Interface;
public class Interface {
	public static void main(String[] args) {
		//eine Scannerabfrage f�r Name, Alter und K�rpergr��e
		System.out.println("Wie ist ihr Name??");
		String name = new java.util.Scanner(System.in).nextLine();	//Scannerabfrage des Namens durch Userinput
		System.out.println("Darf ich auch Ihr Alter erfahren??");
		int age = new java.util.Scanner(System.in).nextInt();		//Scannerabrafe des Alters durch Userinput
		System.out.println("Ich benoetige noch Ihre Koerpergroe�e in m");
		double hight = new java.util.Scanner(System.in).nextDouble();	//Scannerabfrage der K�rpergr��e durch Userinput
		
		System.out.println("Ihr Name ist also: " + name + " und sie sind " + age + " Jahre alt"); //Ausgabe der eingegebenen Daten
		System.out.print("Ihre Koerpergr��e betraegt nach ihren Angaben: " + hight);
	}
}