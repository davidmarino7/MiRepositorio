package training.lab1;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 5;
		int y = 10;
		x = y;
		System.out.println("Nueva asignación de x: " + x);
		System.out.println("\n");
		
		//Suma
		x = x + 2;
		System.out.println("Sumando un valor a la x: " + x);
		System.out.println("\n");
		
		x = x + 2;
		System.out.println("Sumando un valor a la x otro operador: " + x);
		System.out.println("\n");
		
		
		x++;
		System.out.println("Incrementando el valor de x: " + x);
		System.out.println("\n");

		
		x++;
		System.out.println("Incrementando el valor de x: " + x);
		System.out.println("\n");
		
		
		
		
		//Resta
		x = x - 2;
		System.out.println("Restándole 2 a x, por lo tanto x vale: " + x);
		System.out.println("\n");
		
		x -= 2;
		System.out.println("Restándole 2 a x de otra forma, por lo tanto x vale: " + x);
		System.out.println("\n");
		
		
		
		//Multiplicación
		
		x = x * 2;
		System.out.println("Multiplicando la x por 2, por lo tanto x vale:" + x);
		System.out.println("\n");
		
		
		//División
		
		x = x / 2;
		System.out.println("Dividiendo la x por 2, por lo tanto x vale:" + x);
		System.out.println("\n");	
		
		
		//Otros operadores
		//equal (==)
		int userAge = 34;
		int userAge1 = 34;
		if (userAge == userAge1) {
			System.out.println("Las edades son iguales");
		}
		System.out.println("\n");
		
		
		
		//notequal (!=)
		
		int userAge2 = 34;
		int userAge3 = 37;
		
		if (userAge2 != userAge3) {
			System.out.println("Las edades son distintas");
		}
		System.out.println("\n");
		
		
		
		//Operador AND
		
		if (userAge2 > 0 && userAge3 > 0) {
			System.out.println("Las edades son mayores que 0");
		}
		System.out.println("\n");
		
		
		//Operador OR
		
		if (userAge2 > 30 || userAge3 > 100) {
			System.out.println("Se cumple solo una condición de las edades");
		}
		System.out.println("\n");
	}

}
