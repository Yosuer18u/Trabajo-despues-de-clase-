package Main;

import java.util.Scanner;

public class Temperatura {

	public static void main (String[]args) {
		
		/*Crea un programa que permita convertir temperaturas
		 * 
		 * -De celcius a farenheit
 		   -De farenheit a celsius
           -De celsius a kelvin
		   -De kelvin a celsius
           -De farenheit a kelvin
           -De kelvin a fareheit
		 */
		
		try (Scanner Date = new Scanner(System.in)) {
			System.out.println("Hola Buenos Dias");
			System.out.println("Escojas el procedimiento que desea realizar");
			System.out.println("1-De celcius a farenheit");
			System.out.println("2-De farenheit a celsius");
			System.out.println("3-De celsius a kelvin");
			System.out.println("4-De kelvin a celsius");
			System.out.println("5-De farenheit a kelvin");
			System.out.println("6-De kelvin a fareheit");
			int Opc=Date.nextInt();
			
			switch (Opc) {
			
			case 1:
				
				System.out.println("Ingrese los Celcius a convertir a Farenheit");
				double Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Celcius a Farenheit son: ");
				System.out.printf("%1.2f",(Conver*1.8)+32);
				break;
			
			case 2:
				
				System.out.println("Ingrese los Farenheit a convertir a Celcius");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Farenheit a Celcius son: ");
				System.out.printf("%1.2f",(Conver-32)*5/9);
				
				break;
				
			case 3:
				
				System.out.println("Ingrese los Celcius a convertir a Kelvin");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Celcius a Kelvin son: ");
				System.out.printf("%1.2f",Conver+273.15);
				
				break;
				 
      case 4:
				
				System.out.println("Ingrese los Kelvin a convertir a Celcius");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Kelvin a Celcius son: ");
				System.out.printf("%1.2f",Conver-273.1);
				
				break;
				
      case 5:
				
				System.out.println("Ingrese los Farenheit a convertir a Kelvin");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Farenheit a kelvin son: ");
				System.out.printf("%1.2f",(Conver-32)*5/9+273.1);
				
				break;
				
      case 6:
				
				System.out.println("Ingrese los kelvin a convertir a Farenheit");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" kelvin a Farenheit son: ");
				System.out.printf("%1.2f",(Conver-273.15)*9/5+32);
				
				break;
			}
		}
	}
	
}
