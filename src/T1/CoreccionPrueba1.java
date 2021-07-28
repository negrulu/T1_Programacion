package Tarea14;
import java.util.Scanner;
public class CoreccionPrueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int np,suma=0,cantidadN=0;
		
		do {
			System.out.println("Introduce un numero");
			np=entrada.nextInt();
			suma=suma+np;
			cantidadN=cantidadN+1;
		}
		while(np!=0);
		System.out.println("La suma de todos los numeros es: "+suma);
		System.out.println("La cantidad de numeros ingresados por el usuario fueron: "+cantidadN);	
	}
}