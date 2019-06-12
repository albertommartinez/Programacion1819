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
		//Scanner Teclado = new Scanner(System.in);//instancia el objeto Scanner
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
						//almacen.crearArticulo();
						almacen.almacen.add(new Articulo());
						break;
					case 2:
						almacen.listarElementos(almacen.almacen);
						opcion = Teclado.leerEntero("> ");
						almacen.baja(opcion);
						break;
					case 3: 
						//modificación del artículo
						almacen.listarElementos(almacen.almacen);
						opcion = Teclado.leerEntero("Elige el producto a modificar> ");
						String descripcion = Teclado.leerCadena("Descripcion> ");
						double precioVenta = Teclado.leerDecimal("PrecioVenta> ");
						double precioCompra = Teclado.leerDecimal("PrecioCompra> ");
						almacen.modificarElemento(almacen.almacen.get(opcion),descripcion,precioVenta,precioCompra);
						break;
					case 4:
						//entrada mercancía
						almacen.listarElementos(almacen.almacen);
						//preguntar aqui el articulo 
						String mercancia = Teclado.leerCadena("Mercancia> ");
						int cantidad = Teclado.leerEntero("Cantidad> ");
						almacen.entradaElemento(articulo, cantidad);
						almacen.listarElementos(almacen.almacen);
						break;
					case 5:
						//salida mercancía
						almacen.listarElementos(almacen.almacen);
						cantidad = Teclado.leerEntero("Cantidad> ");
				
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
				System.out.println("Has insertado un valor no valido");
			}
		}while((opcion>0)&&(opcion<opciones.length));
		
	}

}
