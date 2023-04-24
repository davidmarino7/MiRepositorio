package training.lab1;

import java.util.Scanner;

public class Laboratorio3 {

	public static void main(String[] args) {
		
		Scanner newScanner = new Scanner(System.in);
		System.out.println("Introduzca un peso: ");
		int pesoUsuario = newScanner.nextInt();
		System.out.println("Introduzca una altura: ");
		double altUsuario = newScanner.nextDouble();
		double elevado = Math.pow(altUsuario, 2);
		
		double formula = pesoUsuario/elevado;
		System.out.println("El IMC es de: " + formula);
		
		if(formula<18.5) {
			System.out.println("Bajo peso");
			
		}else if(formula>=18.5 && formula <24.9){
			System.out.println("peso normal");
		}else if(formula>=25 && formula <29.9){
			System.out.println("sobrepeso");
		}
		else if(formula>=30){
			System.out.println("Obesidad");
		}

	}

	

}
