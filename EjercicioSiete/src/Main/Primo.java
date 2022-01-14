package Main;

import java.util.Scanner;

public class Primo {
	
	public static void main(String[]args) {
		
		//Crea un programa que permita identificar si un número es primo.
		
		try (Scanner Date = new Scanner(System.in)) {
			System.out.println("Hola Buenos dias ");
			System.out.println("Por favor Ingrsar el numero a comprobar si es Primo");
			int Num=Date.nextInt();
			
			int Contador=0;
			
			for(int i=1;i<=Num;i++) { 
				
				if(Num%i==0) {
					
					Contador++;
		
				}
			}
			
			if(Contador!=2) {
					System.out.println("EL Numero digitado no es primo");
				}else {
					System.out.println("El Numero digitado es primo");
				}
		}
	}

}
