package gestisimal;

import java.util.ArrayList;
import java.util.Scanner;

class Test {

	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);//instancia el objeto Scanner
		Almacen almacen = new Almacen();
		String[] opciones = {"Salir","Alta producto","Baja producto","Modificacion producto","Entrada mercancia","Salida mercancia","Mostrar productos"};
		int opcion = -1;
		
		
		do {
			try {
				System.out.println(opcion=menu.crearMenu("GESTISIMAL",opciones));
				switch(opcion) {
					case 0:
						//salir del menú
						System.exit(0);
					case 1:
						//dar de alta al artículo
						Articulo articulo = almacen.crearArticulo();
						almacen.almacen.add(articulo);
						System.out.println("--Articulo creado--\n");
						break;
					case 2:
						//dar de baja al artículo
						almacen.listarElementos(almacen.almacen);
						System.out.println("Elige el producto a dar de baja> ");
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
						almacen.salidaElemento(almacen.salidaElemento(), cantidad);
						almacen.listarElementos(almacen.almacen);
						break;
					case 6:
						//Mostrar los artículos
						almacen.listarElementos(almacen.almacen);
						break;

				}
			}catch(Exception e) {
				System.out.println("Has insertado un valor no valido");
			}
		}while(true);
		
	}

}