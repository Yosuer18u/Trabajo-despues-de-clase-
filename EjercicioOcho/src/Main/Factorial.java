package Main;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[]args) {
		
		try (Scanner Date = new Scanner(System.in)) {
			System.out.println("Hola Buneos dias ");
			System.out.println("Porfavot Ingresar el numero a averiguar el factorial");
			
			int Num=Date.nextInt();
			
			int Factorial=1;
			
			for(int i=1;i<=Num;i++) {
				Factorial = Factorial*i;
			}
			
			System.out.println("El Factorial del numero ingresado: "+Factorial);
		}
	}

}
