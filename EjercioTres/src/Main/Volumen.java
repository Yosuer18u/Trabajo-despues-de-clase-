package Main;

import java.util.Scanner;

public class Volumen {
	
	public static void main(String[]args) {
		
		/*Crea un programa que permita convertir volumenes
         -Gal�n a metros c�bicos
         -metros c�bicos a gal�n
         -litros a gal�n
         -galones a litros
		  */
		
		try (Scanner Date = new Scanner(System.in)) {
			
			
			System.out.println("Hola Buenos Dias");
			System.out.println("Escojas el procedimiento que desea realizar");
			System.out.println("1-De Galon a Metros Cubicos");
			System.out.println("2-De Metros Cubicos a Galon");
			System.out.println("3-De Litro a Galon");
			System.out.println("4-De Galon a Litro");
			
			int Opc=Date.nextInt();
			
			switch (Opc) {
			
			case 1:
				
				System.out.println("Ingrese los Galones a convertir a Metros Cubicos");
				double Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Galones a Metros Cubicos son: ");
				System.out.printf("%1.2f",Conver/264);
				break;
			
			case 2:
				
				System.out.println("Ingrese los Metros Cubicos a convertir a Galon");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Metros Cubicos a Galon son: ");
				System.out.printf("%1.2f",Conver*264);
				
				break;
				
			case 3:
				
				System.out.println("Ingrese los Litros a convertir a Galon");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Litros a Galones son: ");
				System.out.printf("%1.2f",Conver/3.785);
				
				break;
				 
			case 4:
				
				System.out.println("Ingrese los Galon a convertir a Litros");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Glones a Litros son: ");
				System.out.printf("%1.2f",Conver*3.785);
				
				break;
			}
		
		}
	  
	}
	
		
   }		