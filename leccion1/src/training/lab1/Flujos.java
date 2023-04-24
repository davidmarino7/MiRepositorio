package training.lab1;

public class Flujos {

	public static void main(String[] args) {

		System.out.println("Sentencia for");
		for (int i=0; i<5; i++) {
			System.out.println(i);
			System.out.println("\n");
		}
		
		
		int [] myNumbers = {10, 20, 30, 40, 50};
		
		for (int i=0; i < myNumbers.length; i++) {
			System.out.println(myNumbers[i]);
			System.out.println("\n");
		}
		
		
		for (int i=0; i < 5; i++) {
			System.out.println("i = " + i);
			
			if (i==2) {
				break;
			}
			
		}
		System.out.println("\n");
		
		
		
		
		System.out.println("Sentencia while");
		int counter = 5;
		while (counter > 0) {
			System.out.println("Counter = " + counter);
			counter--;
		}
		
		System.out.println("\n");
		
		System.out.println("Sentencia do while");
		int counter2 = 10;
		do {
			System.out.println("Counter2 = "+ counter2);
			counter2++;
		}while (counter2<0);
		
		
		
	}

	

}
