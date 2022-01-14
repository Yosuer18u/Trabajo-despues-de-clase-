package main;

import java.util.Scanner;

public class Longitud {

	public static void main(String[]args) {
		/*
		 * Crea un programa que permita convertir longitudes
          -cm a metros
          -metros a centimetros
          -metros a kilometros
          -kilometros a metros
          -metros a millas
          -millas a metros
          -kilometros a millas
          -millas a kilometros
		 */
		
		try (Scanner Date = new Scanner(System.in)) {
			System.out.println("Hola Buenos Dias");
			System.out.println("Escojas el procedimiento que desea realizar");
			System.out.println("1-De Centimetros a Metros");
			System.out.println("2-De Metros a Centimetros");
			System.out.println("3-De Metros a Kilometros");
			System.out.println("4-De Kilometros a Metros");
			System.out.println("5-De Metros a Millas");
			System.out.println("6-De Millas a Metros");
			System.out.println("7-Kilometros a Millas");
			System.out.println("8-Millas a kilometros");
			int Opc=Date.nextInt();
			
			switch (Opc) {
			
			case 1:
				
				System.out.println("Ingrese los Centimetros a convertir a Metros");
				double Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Centimetros a Metros son: ");
				System.out.printf("%1.2f",Conver/100);
				break;
			
			case 2:
				
				System.out.println("Ingrese los Metros a convertir a Centimetros");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Metros a Centimetros son: ");
				System.out.printf("%1.2f",Conver*100);
				
				break;
				
			case 3:
				
				System.out.println("Ingrese los Metros a convertir a Kilometros");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Metros a Kilometros son: ");
				System.out.printf("%1.2f",Conver/1000);
				
				break;
				 
			case 4:
				
				System.out.println("Ingrese los Kilometros a convertir a Metros");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Kilometros a Metros son: ");
				System.out.printf("%1.2f",Conver*1000);
				
				break;
				
			case 5:
				
				System.out.println("Ingrese los Metros a convertir a Millas");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Metros a Millas son: ");
				System.out.printf("%1.2f",Conver/1609);
				
				break;
				
			case 6:
				
				System.out.println("Ingrese las Millas a convertir a Metros");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Millas a Metros: ");
				System.out.printf("%1.2f",Conver*1609);
				
				break;
				
			case 7:
			
				System.out.println("Ingrese los Kilometros a convertir a Millas");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Kilometros a Millas: ");
				System.out.printf("%1.2f",Conver/1.609);
			
				break;
			
			case 8:
				
				System.out.println("Ingrese las Millas convertir a Kilometros");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Millas a Kilometros  : ");
				System.out.printf("%1.2f",Conver*1.609);
			
				break;
	
			}
		}
	}
		
}
