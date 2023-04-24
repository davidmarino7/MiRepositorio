package training.lab1;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myName = "Hello World " + " Mi nombre es David";
		System.out.println(myName);
		
		
		//Métodos de String
		
		System.out.println("Hello World".length());
		
		//todo en minúscula
		System.out.println("Hello World".toLowerCase());
		
		//todo en mayúscula
		System.out.println("Hello World".toUpperCase());
		
		String firstSubstring = "Hello World".substring(6);
		System.out.println(firstSubstring);
		
		String secondSubstring = "Hello World".substring(1,8);
		System.out.println(secondSubstring);
		
		//seleccionar un caracter en específico
		char myChar = "Hello World".charAt(4);
		System.out.println(myChar);
		
		//Salto de pág
		System.out.println("Escape Secuences --- " + "Hello\nWorld");
		
		boolean equalsOrNot = "This is Jamie".equals("This is Jamie");
		boolean equalsOrNot2 = "This is Jamie".equals("Hello World");
		
		System.out.println(equalsOrNot);
		System.out.println(equalsOrNot2);
		
		System.out.println("\n");
		
		String names = "Peter, John, Andy, David";
		String[] splitNames = names.split(", ");
		
		System.out.println(names);
		System.out.println(splitNames[0]);
		System.out.println(splitNames[2]);
	}

}
