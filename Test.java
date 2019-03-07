package coleccionDiscos;

import java.util.Scanner;

class Test {

	public static void main(String[] args) {
		String[] opciones = {"Mostrar Discos","Añadir discos","Borrar discos","Salir"};//Vector opciones
		Coleccion coleccion = new Coleccion();//instancia objeto bjeto coleccion
		int opcion;
		int result = 0;
		Scanner Teclado = new Scanner(System.in);//instancia el objeto Scanner
		//do {
			opcion = coleccion.pintarMenu(opciones);//Crea menu de opciones
			switch(opcion) {
				case 1://Opcion1 muestra discos
					/*int i=0;
					Disco elemento;
						do {
							elemento = coleccion.obtener(i);
							System.out.println(elemento.getTitulo()+"-"+elemento.getAutor());
						}while(coleccion.obtener(i)!= null);*/
					coleccion.mostrarColeccion();
				case 2://Opcion2 añade discos
					System.out.println("Introduce Titulo del disco> ");
					String titulo = Teclado.next();
					System.out.println("Introduce el autor del disco> ");
					String autor = Teclado.next();
					
					Disco disco = new Disco(titulo,autor);
					coleccion.annadir(disco);
				case 3://Opcion3 borra discos
					int j=0;
					do {
						//elemento = coleccion.obtener(j);
						//System.out.println(j+"."+elemento.toString());
					}while(coleccion.obtener(j)!= null);
					do {
						if(result==1){System.out.println("Ha ocurrido un error al borrar el disco");}
						System.out.println("Introduce numero de elemento a borrar> ");
						opcion = Teclado.nextInt();
						result = coleccion.borrar(opcion);
					}while(result==1);
			}
		//}while((opcion<1)||(opcion>opciones.length-1));
	}

}
