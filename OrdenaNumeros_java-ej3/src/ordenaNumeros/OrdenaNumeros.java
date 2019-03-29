package ordenaNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class OrdenaNumeros {

	public static void main(String[] args) {
		ArrayList<Integer> enteros = new ArrayList<Integer>();//Instancia de ArrayList de enteros
		Scanner teclado = new Scanner(System.in);//Instancia de Scanner
		int entero = 0;
		
		System.out.println("Debes introducir 10 enteros");
		for(int i=0;i<10;i++) {//Recorre el ArrayList y pide los enteros para llenarlo
			System.out.print("Introduce un entero> ");
			entero = teclado.nextInt();
			enteros.add(entero);//Añade entero al ArrayList
		}
		//Ordena de menor a mayor el ArrayList usando el metodo sort de la clase Collections
		Collections.sort(enteros);
		
		for(int i=0;i<10;i++) {
			System.out.println(enteros.get(i));//Extrae e imprime entero del ArrayList
		}
	}

}
