package gestisimal;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Objeto Almacen
 * @author Alberto Miguel Martinez Jimenez
 *
 */
 class Almacen {
	ArrayList<Articulo> almacen = new ArrayList<Articulo>();
	private Scanner Teclado = new Scanner(System.in);//instancia el objeto Scanner
	private String[] ivas = {iva.GENERAL.toString(),iva.REDUCIDO.toString(),iva.SUPER_REDUCIDO.toString()};
	private String[] campos; //= new String[5];
	
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
		Double precioCompra = Teclado.nextDouble();
		//Campo precioVenta
		System.out.println("Introduce campo precioVenta> ");
		Double precioVenta = Teclado.nextDouble();
		//Campo stock
		System.out.println("Introduce campo stock> ");
		int stock = Teclado.nextInt();
		//menu tipo de iva
		
		
		int opcionIva = 0;
		
		opcionIva = menu.crearMenu("Elige IVA", ivas);
		
		
		campos = new String[] {descripcion,precioCompra.toString(),precioVenta.toString(),Integer.toString(stock) ,ivas[opcionIva].toString()};
		return campos;
	}
/**
 * escribe por pantalla los campos de un articulo pasado por parametro	
 * @param articulo Articulo
 */
	public void imprimirArticulo(Articulo articulo) {
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
	public Articulo crearArticulo() {
		String[] campos = recogerDatos();
		
		Articulo articulo = new Articulo(campos[0],Double.parseDouble(campos[1]),Double.parseDouble(campos[2]),Integer.parseInt(campos[3]),campos[4]);
		
		imprimirArticulo(articulo);
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
		  articulo.setDescripcion(System.console().readLine());
		  
		  
		  System.out.println("Modifica de nuevo el precioCompra");
		  articulo.setPrecioCompra(Double.parseDouble(System.console().readLine()));
		 
		  
		  System.out.println("Modifica de nuevo la precioVenta");
		  articulo.setPrecioVenta(Double.parseDouble(System.console().readLine()));
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
	public void listarElementos(ArrayList<Articulo> arrayList) {
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(i+"."+arrayList.get(i));	
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
