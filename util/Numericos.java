package util;

public class Numericos {
//Métodos
/**
 * Genera un entero aleatorio respecto a un rango
 * @param limiteInferior
 * @param limiteSuperior
 * @return aleatorio
 */
	public static int enteroAleatorio(int limiteInferior,int limiteSuperior){
	int aleatorio = (int)(Math.random())*(limiteSuperior+limiteInferior)-limiteInferior;
	return aleatorio;
	}
/**
 * Genera un doble  aleatorio respecto a un rango	
 * @param limiteInferior
 * @param limiteSuperior
 * @return aleatorioFinal
 */
	public static double doubleAleatorio(int limiteInferior,int limiteSuperior,int nDecimales) {
	int multiplicador = 10000;
		for(int i=0;i<nDecimales;i++){
			multiplicador = multiplicador/10;
		}
	int aleatorio = (int)((Math.random())*(limiteSuperior+limiteInferior)-limiteInferior);
	double aleatorioFinal = (double)(aleatorio/multiplicador);
	return aleatorioFinal;
	}
/**
 * Calcula la media de valores enteros
 * de un vector dado por parámetro
 * @param vector
 * @return int sumatorio
 */
	public static int mediaVector(int[] vector) {
	int media=0;
	int sumatorio = 0;
	int i;
		for(i=0;i<vector.length;i++) {
		sumatorio = sumatorio + vector[i];
		}
	media = sumatorio/i;
	return media;
	}
	
/**
 * Calcula la media de valores doubles
 * de un vector dado por parámetro
 * @param vector
 * @return int sumatorio
 */
	public static double mediaVector(double[] vector) {
	double media=0;
	double sumatorio = 0;
	int i;
		for(i=0;i<vector.length;i++) {
		sumatorio = sumatorio + vector[i];
		}
	media = sumatorio/i;
	return media;
	}	
}
