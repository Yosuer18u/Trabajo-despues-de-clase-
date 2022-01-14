package Main;
import java.util.Random;
import java.util.Scanner;

public class Menu {
	
	public static void main(String[]args) {
		
		
		/*Crea un programa que muestre en pantalla un menú con las siguientes opciones:
		 * -Generar número aleatorio
		 * -Sumar 2 números
		 * -Salir
		 */
		
		try (Scanner Date = new Scanner(System.in)) {
			boolean salir = false;
			
			while(!salir) {
				
				System.out.println("1-Generar numero aleatorio");
			    System.out.println("2-Sumar 2 numeros ");
			    System.out.println("3-Salir");
			    int Opc=Date.nextInt();
			    
			    switch(Opc) {
			    case 1:
			    	Random Aleatorio=new Random();
			    	int Num=Aleatorio.nextInt();
			    	System.out.println("El numero Aleatorio seleccionado es: "+Num);
			    	break;
			    
			    case 2:
			    	
			    	System.out.println("Escribe el Primer numero: ");
			    	int Num1=Date.nextInt();
			    	
			    	System.out.println("Escribe el Primer numero: ");
			    	int Num2=Date.nextInt();
			    	
			    	System.err.println("La suma de ambos numero es: "+(Num1+Num2));
			    	
			    	break;
			    	
			    case 3:
			    	salir=true;
			    	break;
			    	
			    default:
			    	System.out.println("La opcion seleccionada no se encuentra disponible ");
			    }
			    
			    System.out.println("Adios!");
			}
		}
	}
}
