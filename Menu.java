package gestisimal;

import java.util.ArrayList;
import java.util.Scanner;

class menu {
/**
 * Pinta en pantalla un menu con el titulo
 * y las opciones pasadas por parametro	
 * @param titulo
 * @param opciones
 * @return opcion int
 */
	public static int crearMenu(String titulo,String[] opciones) {
		Scanner teclado = new Scanner(System.in);//instancia el objeto Scanner
		int longitudOpciones = opciones.length;
		int opcion=0;
		do {//Vuelve a mostrar menu si la opcion no es valida
			int i=0;
			try {
				
					System.out.println("..::-- "+titulo+" --::..");
					do {//Bucle que pinta el menu
						System.out.println("      "+i+"."+opciones[i]);
						i++;
					}while((i>-1)&&(i<longitudOpciones));
					System.out.print("\n");
					System.out.println("Introduce opcion> ");
					opcion = teclado.nextInt();//Recoge opcion
				
			}catch(Exception e){
				System.out.println("Ha ocurrido un error referente al menu");
			}
		}while((opcion<0)||(opcion>longitudOpciones-1));
		return opcion;//Devuelve opcion
	}
	
}

