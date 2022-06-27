package jana60;

public class Utente {
	
	//ATTRIBUTI
	private String name, surname, email, password;
	private int age;
	
	
	
	//COSTRUTTORI
	public Utente(String name, String surname, String email, String password, int age) throws Exception
	{
		//Controllo eccezioni
		isEmailValid(email);
		isPasswordValid(password);
		isAgeValid(age);		
		
		//Assegno i valori 
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.age = age;		
	}

	
	
	//GETTERS / SETTERS

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	//METODI
	
	private void isEmailValid(String emailInput) throws Exception
	{
		//Eccezione di email che non contengono il carattere "@"
				if (!emailInput.contains("@") || !emailInput.contains("."))
				throw new Exception("L'indirizzo deve contenere il carattere \"@\" e un \".\" ");
	}
	
	private void isPasswordValid(String passwordInput) throws Exception
	{
		//Eccezione per password con meno di 8 caratteri e più di 12 caratteri
		if (passwordInput.length() < 8)
			throw new Exception("La password deve contenere almeno 8 caratteri");
		if (passwordInput.length() > 12)
			throw new Exception("La password deve contenere massimo 12 caratteri");
	}
	
	private void isAgeValid(int ageInput) throws Exception
	{
		//Eccezione per età inferiore ai 18 anni
		if (ageInput < 18)
			throw new  Exception("Devi avere almeno 18 anni per registrarti");
	}
	
	@Override
	public String toString() 
	{
		return 	"\n"	+ name 	+ " " 	+ surname 	+
				"\n" 	+ email + "	"	+ password	+
				"\n"	+ age						;
	}

	
	
	

}
