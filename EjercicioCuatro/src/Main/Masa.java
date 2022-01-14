package Main;

import java.util.Scanner;

public class Masa {
	
	public static void main(String[]args) {
		
		/*Crea un programa que permita convertir masa
		 * -Libras a gramos
		 * -gramos a libras
		 * -libras a onzas
		 * -onzas a libras
		 * -onzas a gramos
		 * -gramos a onzas
		 * -Kilos a libras
		 * -libras a kilos
		 * -Kilos a onzas
		 * -onzas a kilos
		 */
		
		try (Scanner Date = new Scanner(System.in)) {
			System.out.println("Hola Buenos Dias");
			System.out.println("Escojas el procedimiento que desea realizar");
			System.out.println("1-De Libra a Gramo");
			System.out.println("2-De Gramos a Libra");
			System.out.println("3-De Libra  a Onza");
			System.out.println("4-De Onza a Libra");
			System.out.println("5-De Onza  a Gramo");
			System.out.println("6-De Gramos a Onza");
			System.out.println("7-De Kilo a Libra");
			System.out.println("8-De Libra a Kilo");
			System.out.println("9-Kilo a Onza");
			System.out.println("10-Onza aKilo");
			int Opc=Date.nextInt();
			
			switch (Opc) {
			
			case 1:
				
				System.out.println("Ingrese las Libras a convertir Gramo");
				double Conver=Date.nextDouble();
				System.out.println("Las "+Conver+" Libras a Gramos son: ");
				System.out.printf("%1.2f",(Conver*454));
				break;
			
			case 2:
				
				System.out.println("Ingrese los Gramos a convertir a Libras");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Gramo a Libras son: ");
				System.out.printf("%1.2f",Conver/454);
				
				break;
				
			case 3:
				
				System.out.println("Ingrese las Libras a convertir a Onza");
				Conver=Date.nextDouble();
				System.out.println("Las "+Conver+" Libras a Onza son: ");
				System.out.printf("%1.2f",Conver*16);
				
				break;
				 
			case 4:
				
				System.out.println("Ingrese las Onza a convertir a Libras");
				Conver=Date.nextDouble();
				System.out.println("Las "+Conver+" Onza a Libra son: ");
				System.out.printf("%1.2f",Conver/16);
				
				break;
				
			case 5:
				
				System.out.println("Ingrese las Onza a convertir a Gramos");
				Conver=Date.nextDouble();
				System.out.println("Las "+Conver+" Onza a Gramos son: ");
				System.out.printf("%1.2f",Conver*28.35);
				
				break;
				
			case 6:
				
				System.out.println("Ingrese los Gramos a convertir a Onza");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Gramos a Onza son: ");
				System.out.printf("%1.2f",Conver*28.35);
				
				break;
				
			case 7:
			
				System.out.println("Ingrese los Kilos a convertir a Libras");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Kilos a Libras son: ");
				System.out.printf("%1.2f",Conver*2.205);
			
				break;
		
			
			case 8:
					
				System.out.println("Ingrese las Libras a convertir a Kilos");
				Conver=Date.nextDouble();
				System.out.println("Las "+Conver+" Libras a Kilos son: ");
				System.out.printf("%1.2f",Conver/2.205);
					
				break;
				
			case 9:
				
				System.out.println("Ingrese los Kilos a convertir a Onza");
				Conver=Date.nextDouble();
				System.out.println("Los "+Conver+" Kilos a Onza son: ");
				System.out.printf("%1.2f",Conver*35.274);
					
				break;
				
			case 10:
				
				System.out.println("Ingrese las Onza a convertir a Kilos");
				Conver=Date.nextDouble();
				System.out.println("Las "+Conver+" Onza a Kilos son: ");
				System.out.printf("%1.2f",Conver/35.274);
					
				break;
		}
	}
  }

}
