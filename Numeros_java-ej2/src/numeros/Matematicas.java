package numeros;

import java.util.ArrayList;

public class Matematicas {
	
	//aleatorio 0,100
	//suma media max min
	//tamaño entre 10 y 20
/**
 * Genera un valor entero aleatorio en un rango dado	
 * @param desde int
 * @param hasta int
 * @return numero int
 */
	public static int generarEnteroAleatorio(int desde,int hasta) {
		int numero;
		return numero = (int)(Math.random() * (hasta - desde + 1)) + desde;
	}
/**
 * Calcula la suma de los elementos de un arrayList
 * de numeros enteros	
 * @param lista arrayList<Integer>
 * @return suma int
 */
	public static int sumaArrayList(ArrayList<Integer> lista) {
		int suma = 0;
		for(int i=0;i<lista.size();i++) {
			suma += lista.get(i);
		}
		return suma;
	}
/**
 * Calcula la media de los elementos de un ArrayList
 * de numeros enteros
 * @param lista arrayList<Integer>
 * @return double
 */
	public static double mediaArrayList(ArrayList<Integer> lista) {
		return sumaArrayList(lista)/lista.size();
	}
/**
 * Calcula el valor maximo de un ArrayList de entero	
 * @param lista
 * @return max int
 */
	public static int maximo(ArrayList<Integer> lista) {
		int max = Integer.MIN_VALUE;//Valor minimo que puede tomar una variable entera
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i)>max) {
				max = lista.get(i);
			}
		}
		return max;
	}
/**
 * Calcula el valor minimo de un ArrayList de entero	
 * @param lista
 * @return min int
 */		
	public static int minimo(ArrayList<Integer> lista) {
		int min = Integer.MAX_VALUE;//Valor maximo que puede tomar una variable entera
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i)<min) {
				min = lista.get(i);
			}
		}
		return min;
	}
}
