package gestisimal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Objeto Almacen
 * @author Alberto Miguel Martinez Jimenez
 *
 */
 class Almacen {
	protected ArrayList<Articulo> almacen = new ArrayList<Articulo>();
	private Scanner Teclado = new Scanner(System.in);//instancia el objeto Scanner
	private String[] ivas = {iva.GENERAL.toString(),iva.REDUCIDO.toString(),iva.SUPER_REDUCIDO.toString()};
	private String[] campos; //= new String[5];
	

/**
 * escribe por pantalla los campos de un articulo pasado por parametro	
 * @param articulo Articulo
 */
	protected void imprimirArticulo(Articulo articulo) {
		System.out.println("----------------------------------------------------");
		System.out.println(" Descripcion........."+articulo.getDescripcion());
		System.out.println(" Precio de compra:..."+articulo.getPrecioCompra());
		System.out.println(" Precio de venta:...."+articulo.getPrecioVenta());
		System.out.println(" Stock:.............."+articulo.getStock());
		System.out.println(" I.V.A:.............."+articulo.getIva());
		System.out.println("----------------------------------------------------");
	}
/**
 * Crear objeto Articulo	
 * @param descripcion String
 * @param precioCompra double
 * @param precioVenta double
 * @param stock int
 * @return Articulo
 */
	protected Articulo crearArticulo(String descripcion,double precioCompra,double precioVenta,int stock,iva tipoIva) {
		//String[] campos = recogerDatos();
		
		Articulo articulo = new Articulo(descripcion,precioCompra,precioVenta,stock,tipoIva);
		
		imprimirArticulo(articulo);
		return articulo;
	}
/**
 * Annade elemento al arrayList	
 * @param articulo
 * @return boolean
 */
	protected boolean alta(Articulo articulo) {
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
	protected Articulo obtenerElemento(int indice) {
		if((indice<almacen.size()-1)&&(indice>-1)) {
			return almacen.get(indice);
		}
		return null;
	}
/**
 * Borra el elemento del indice pasado por parametro	
 * @param indice
 * @return boolean
 */
	protected boolean baja(int indice) {
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
	protected boolean modificarElemento(Articulo articulo,String descripcion,double precioCompra,double precioVenta) { 
		  boolean respuesta = false;
		  articulo.setDescripcion(descripcion);
		  articulo.setPrecioCompra(precioCompra);
		  articulo.setPrecioVenta(precioVenta);
		  return respuesta=true;
		  
		}
	
/**
 * Aumenta la entrada de articulo. Si no existe lo crea
 * @param elemento
 * @param cantidad
 * @return boolean
 */
	protected boolean entradaElemento(Articulo elemento,int cantidad) {
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
	protected int contarElementos(ArrayList arrayList,Articulo articulo) {
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
	protected void listarElementos(ArrayList<Articulo> arrayList) {
		if(arrayList.size()>0) {
			for(int i=0;i<arrayList.size();i++) {
				System.out.println(i+"."+arrayList.get(i));	
			}
		}else{
				System.out.println("No hay articulos registrados");
		}
	}

/**
 * Elimina un una cantidad de un tipo de articulo
 * del almacen	
 * @param arrayList
 * @param articulo
 * @param cantidad
 * @return boolean
 */

	protected boolean salidaElemento(ArrayList arrayList,Articulo articulo,int cantidad) {
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
@Override
public String toString() {
	return "Almacen [almacen=" + almacen + ", Teclado=" + Teclado + ", ivas=" + Arrays.toString(ivas) + ", campos="
			+ Arrays.toString(campos) + "]";
}
	
	
}
