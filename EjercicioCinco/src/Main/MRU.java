package Main;

import java.util.Scanner;

public class MRU {
	
	public static void main(String[]args) {
		
		try (Scanner Date = new Scanner (System.in)) {
			System.out.println("Hola Buenos Dias ");
			System.out.println("Para Calcular la velocida del MRU ingrese los siguiente Datos ");
			System.out.println("La distancia Recorida en km");
			double distancia=Date.nextDouble();
			System.out.println("El timepo Trascurrido en en recorres la distacia en hora ");
			double tiempo=Date.nextDouble();
			System.out.println(" La velocidad del MRU es:");
			System.out.printf("%1.2f", distancia/tiempo);
		}
		

		
	}
}
