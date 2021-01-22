package Interface;
public class Interface {
	public static void main(String[] args) {
		//eine Scannerabfrage für Name, Alter und Körpergröße
		System.out.println("Wie ist ihr Name??");
		String name = new java.util.Scanner(System.in).nextLine();	//Scannerabfrage des Namens durch Userinput
		System.out.println("Darf ich auch Ihr Alter erfahren??");
		int age = new java.util.Scanner(System.in).nextInt();		//Scannerabrafe des Alters durch Userinput
		System.out.println("Ich benoetige noch Ihre Koerpergroeße in m");
		double height = new java.util.Scanner(System.in).nextDouble();	//Scannerabfrage der Körpergröße durch Userinput
		
		System.out.println("Ihr Name ist also: " + name + " und sie sind " + age + " Jahre alt"); //Ausgabe der eingegebenen Daten
		System.out.print("Ihre Koerpergröße betraegt nach ihren Angaben: " + height);
	}
}
