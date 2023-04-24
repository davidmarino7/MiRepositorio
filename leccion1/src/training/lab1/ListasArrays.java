package training.lab1;

import java.util.Arrays;

public class ListasArrays {

	public static void main(String[] args) {
		
		//comparar arrays
		int [] arr1 = {0,2,4,6,8,10};
		int [] arr2 = {0,2,4,6,8,10};
		int [] arr3 = {10,8,6,4,2,0};
		
		boolean result1 = Arrays.equals(arr1, arr2);
		System.out.println("Resultado 1: " + result1);
		
		boolean result2 = Arrays.equals(arr1, arr3);
		System.out.println("Resultado 2: " + result2);
		
		//copiar un array en otro
		
		//Array de Origen
		int [] source = {12, 1, 5, -2, 16, 18, 20, 25};
		//Array de destino
		int [] dest = Arrays.copyOfRange(source, 3, 7);
		
		
		System.out.println("Destino " + dest[0]);
		System.out.println("Destino " + dest[1]);
		System.out.println("Destino " + dest[2]);
		System.out.println("Destino " + dest[3]);
		
		
		//Método toString()
		int [] numbers = {0, 1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(numbers));
		
		//Método sort
		int [] numbers2 = {12, 1, 5, -2, 16, 14};
		Arrays.sort(numbers2);
		System.out.println("Resultado ordenado: "+ numbers2[0]);
		System.out.println("Resultado ordenado: "+ numbers2[5]);

		//Obtener longitud de un array
		int [] userAge = {21, 22, 26, 32, 40};
		int longitud = userAge.length;
		System.out.println("Longitud: " + longitud);
		
		
		
	}

}
