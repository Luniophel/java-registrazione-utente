package jana60;

import java.util.Scanner;

public class Registrazione {

	public static void main(String[] args) {
		
		//IMPORTS
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Benvenuto su Jana60.com\nPer registrarti, inserisci i tuoi dati.");
		
	
		System.out.print("Nome: ");
		String name = scan.nextLine();
		
		
		System.out.print("Cognome: ");
		String surname = scan.nextLine();
		
		
		try {
			System.out.print("E-mail: ");
			String email = scan.nextLine();
			System.out.print("Password: ");
			String password = scan.nextLine();
			System.out.print("Età: ");
			int age = Integer.parseInt(scan.nextLine());
			
			System.out.println("TEST");
			Utente user = new Utente(name, surname, email, password, age);
			System.out.println(user.toString());

		}
		catch (NumberFormatException nfe)
		{
			System.out.println("Impossibile completare la registrazione:");
			System.out.println(nfe.getMessage());
		}
		catch (Exception e) 
		{
			System.out.println("Impossibile completare la registrazione:");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Fine");
		}
		
		System.out.println("Account registrato con successo!");
		
		scan.close();
	}

}
