package Tarea14;
import java.util.Scanner;
public class CoreccionPrueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int np,suma=0,sumaImpar=0,cantidadImpar=0,pImpar=0;
		
		do {
			System.out.println("Introduce un numero");
			np=entrada.nextInt();
			suma=suma+np;
			sumaImpar=sumaImpar+np;
			cantidadImpar=cantidadImpar+1;
			pImpar=sumaImpar/cantidadImpar;		
		}
		while(np!=-1);
		System.out.println("La suma de todos los numeros es: "+suma);
		System.out.println("El promedio de los numeros impares es: "+pImpar);	
	}
}