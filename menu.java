package gestisimal;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Clase menu
 * @author Alberto Miguel Martinez Jimenez
 *
 */
class menu {
/**
 * Pinta en pantalla un menu con el titulo
 * y las opciones pasadas por parametro	
 * @param titulo String
 * @param opciones String[]
 * @return opcion int
 */
	public static int crearMenu(String titulo,String[] opciones) {
		Scanner teclado = new Scanner(System.in);//instancia el objeto Scanner
		int longitudOpciones = opciones.length;
		int opcion=0;
		
		try {
			do {//Vuelve a mostrar menu si la opcion no es valida
				int i=0;
				System.out.println("..::-- "+titulo+" --::..");
				do {//Bucle que pinta el menu
					System.out.println("      "+i+"."+opciones[i]);
					i++;
				}while((i>-1)&&(i<longitudOpciones));
				System.out.print("\n");
				System.out.println("Introduce opcion> ");
				opcion = teclado.nextInt();//Recoge opcion
			}while((opcion<0)||(opcion>longitudOpciones-1));
		}catch(Exception e){
			System.out.println("Ha ocurrido un error referente al menu");
		}
		return opcion;//Devuelve opcion
	}
	
}

