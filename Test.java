package gestisimal;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Test del proyecto
 * @author Alberto Miguel Martinez Jimenez
 *
 */
class Test {

	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);//instancia el objeto Scanner
		Almacen almacen = new Almacen();
		Articulo articulo = null;
		String[] opciones = {"Salir","Alta producto","Baja producto","Modificacion producto","Entrada mercancia","Salida mercancia","Mostrar productos"};
		int opcion = -1;
		
		do {
			try {
				System.out.println(opcion=menu.crearMenu("GESTISIMAL",opciones));
				switch(opcion) {
					case 0:
						System.exit(0);
					case 1:
						almacen.crearArticulo();
						break;
					case 2:
						almacen.listarElementos(almacen.almacen);
						opcion = Teclado.nextInt();
						almacen.baja(opcion);
						break;
					case 3:
						//modificación del artículo
						almacen.listarElementos(almacen.almacen);
						System.out.println("Elige el producto a modificar> ");
						opcion = Teclado.nextInt();
						almacen.modificarElemento(almacen.obtenerElemento(opcion));
						break;
					case 4:
						//entrada mercancía
						almacen.listarElementos(almacen.almacen);
						System.out.println("cantidad> ");
						int cantidad = Teclado.nextInt();
						almacen.entradaElemento(almacen.crearArticulo(), cantidad);
						almacen.listarElementos(almacen.almacen);
						break;
					case 5:
						//salida mercancía
						almacen.listarElementos(almacen.almacen);
						System.out.println("cantidad> ");
						cantidad = Teclado.nextInt();
				
					if(almacen.almacen.contains(articulo)) {
							almacen.salidaElemento(almacen.almacen,articulo,cantidad);
							almacen.listarElementos(almacen.almacen);
						}
						break;
					case 6:
						almacen.listarElementos(almacen.almacen);
						break;	
				}
			}catch(Exception e) {
				System.err.println("Has insertado un valor no valido");
			}
		}while((opcion>0)&&(opcion<opciones.length));
		
	}

}
