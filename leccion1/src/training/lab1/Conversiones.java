package training.lab1;

public class Conversiones {

	public static void main(String[] args) {
		short age = 10;
		double myDouble = age;
		
		System.out.println("Casting de short a double: "+ myDouble);
		
		
		//ya que 20.9 es un valor de tipo double
		int x = (int) 20.9;
		System.out.println("Casting de double a int: " + x);
		
		float num1 = (float) 20.9;
		System.out.println("Casting de double a float: " + x);

	}

}
