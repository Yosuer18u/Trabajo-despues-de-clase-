package Main;

import java.util.Scanner;

public class Binario {
	
	public static void main(String[]args) {
		//Crea un programa que permita convertir un número decimal  a un número binario.
		
		try (Scanner Date = new Scanner(System.in)) {
			System.out.println("Hola Buenos Dias");
			System.out.println("Ingrese el numero entero positivo a convertir a Binario");
			int Num=Date.nextInt();
			
			String Binario = "";
			
			if(Num>0) {
				
				while(Num>0) {
					
					if(Num % 2 == 0) {
						
						Binario="0"+ Binario;
						
					}else {
						Binario="1"+ Binario;
					}
					
					Num=(int)Num/2;
				}
			}else if(Num == 0) {
				
				Binario="0";
				
			}else {
				System.out.println("Ingrese Numero entero positivo");
			}
			
			System.out.println("El numero convertido en Binario es:" + Binario);
		}
	}

}
