package training.lab1;

public class Laboratorio2 {


	public static void main(String[] args) {
		int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int numeroIngresado = 6;
		
		for(int i = 0; i<array.length; i++) {
			System.out.println(i);
			if (i==numeroIngresado) {
				break;
			}
			
		}
	}

}
