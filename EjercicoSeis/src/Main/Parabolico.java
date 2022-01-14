package Main;

import java.util.Scanner;

public class Parabolico {
	
	//Crea un programa que permita calcular la altura máxima de un proyectil con trayectoria parabólica.
	
	public static void main (String[]args) {
		
		try (Scanner Date = new Scanner(System.in)) {
			System.out.println("Hola Buenos Dias acontinuamncio ingresa los siguiente datos ");
			System.out.println("para encontras la altura maxima de un proyectil con trayectoria parabolica");
			
			System.out.println("Ingrese el angulo con respecto al suelo ");
			double Angulo=Date.nextDouble();
			System.out.println("La velocida inicial en km/h");
			double Velocidad=Date.nextDouble();
			
			double Vo=(Velocidad*1000)/3600;
			
			double AnF=(Math.pow((Vo*Math.sin(Math.toRadians(Angulo))),2))/(2*9.8);
			
			System.out.println("La Altura Maximia de un proyectil parabolico es: ");
			System.out.printf("%1.2f",AnF );
		}
	}

}
