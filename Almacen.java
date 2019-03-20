 package gestisimal;

import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {
	ArrayList<Articulo> almacen = new ArrayList<Articulo>();
	Scanner Teclado = new Scanner(System.in);//instancia el objeto Scanner
/**
 * Pregunta al usuario los valores de los
 * campos del objeto	
 * @return campos Object[]
 */
	public String[] recogerDatos() {
		//Campo descripcion
		System.out.println("Introduce campo descripcion> ");
		String descripcion = Teclado.next();
		//Campo precioCompra
		System.out.println("Introduce campo precioCompra> ");
		String precioCompra = Teclado.next();
		//Campo precioVenta
		System.out.println("Introduce campo precioVenta> ");
		String precioVenta = Teclado.next();
		//Campo stock
		System.out.println("Introduce campo stock> ");
		String stock = Teclado.next();
		String[] campos = {descripcion,precioCompra,precioVenta,stock};
		return campos;
	}
/**
 * Crear objeto Articulo	
 * @param descripcion String
 * @param precioCompra double
 * @param precioVenta double
 * @param stock int
 * @return Articulo
 */
	public Articulo crearArticulo() {
		String[] campos = recogerDatos();
		String descripcion = campos[0];
		Double precioCompra = Double.parseDouble(campos[1]);
		Double precioVenta = Double.parseDouble(campos[2]);
		int stock = Integer.parseInt(campos[3]);
		Articulo articulo = new Articulo(descripcion,precioCompra,precioVenta,stock);
		return articulo;
	}
/**
 * Annade elemento al arrayList	
 * @param articulo
 * @return boolean
 */
	public boolean alta(Articulo articulo) {
		try {
		if(!almacen.contains(articulo)) {
			almacen.add(articulo);
		}
		}catch(Exception e) {
			System.err.println("El articulo ya existe");
			return false;
		}
		return true;
	}
/**
 * Obtiene elemento del almacen(ArrayList)	
 * @param indice
 * @return Articulo
 */
	public Articulo obtenerElemento(int indice) {
		if((indice<almacen.size())&&(indice>-1)) {
			return almacen.get(indice);
		}
		return null;
	}
/**
 * Borra el elemento del indice pasado por parametro	
 * @param indice
 * @return boolean
 */
	public boolean baja(int indice) {
		if((indice<almacen.size()-1)&&(indice>-1)) {
			almacen.remove(indice);
			return true;
		}
		return false;
	}
/**
 * modifica los valores de un elemento
 * @param articulo
 * @return boolean
 */
	public boolean modificarElemento(Articulo articulo) { 
		  boolean respuesta = false;
		  System.out.println("Modifica de nuevo la descripcion");
		  articulo.setDescripcion(Teclado.next());
		  
		  
		  System.out.println("Modifica de nuevo el precioCompra");
		  articulo.setPrecioCompra(Teclado.nextDouble());
		 
		  
		  System.out.println("Modifica de nuevo la precioVenta");
		  articulo.setPrecioVenta(Teclado.nextDouble());
		  return respuesta=true;
		  
		}
	
/**
 * Aumenta la entrada de articulo. Si no existe lo crea
 * @param elemento
 * @param cantidad
 * @return boolean
 */
	public boolean entradaElemento(Articulo elemento,int cantidad) {
		try {
			if(almacen.contains(elemento)) {
				elemento.setStock(elemento.getStock()+cantidad);
			}else{
				this.alta(elemento);
				elemento.setStock(elemento.getStock()+cantidad);
			}
		}catch(Exception e) {
			return false;
		}
		return true;
	}
/**
 * Cuenta elementos de un tipo en un arraylist	
 * @param arrayList
 * @param articulo
 * @return cantidad int
 */
	private int contarElementos(ArrayList arrayList,Articulo articulo) {
		int cantidad = 0;
		for(int i=0;i<arrayList.size();i++) {
			if(articulo.equals(arrayList.get(i))) {
				cantidad++;
			}
		}
		return cantidad;
	}
/**
 * Lista todos los articulos del almacen	
 */
	public void listarElementos(ArrayList arrayList) {
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(i+"."+arrayList.get(i));	
		}
		
	}
/**
 * Elimina una cantidad de un tipo de articulo
 * del almacen	
 * @param arrayList
 * @param articulo
 * @param cantidad
 * @return boolean
 */
	public boolean salidaElemento(ArrayList arrayList,Articulo articulo,int cantidad) {
		if(almacen.contains(articulo)) {
			if(cantidad >= contarElementos(arrayList,articulo)) {
				articulo.setStock(articulo.getStock()-cantidad);
			}else {
				System.err.println("No hay suficientes articulos");
			}
		}else {
			System.err.println("No existe el articulo en almacen");
		}
		return true;
	}
}
