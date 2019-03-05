package gestisimal;

import java.util.ArrayList;

public class Almacen {
	ArrayList<Articulo> almacen = new ArrayList<Articulo>();
/**
 * Annade elemento al arrayList	
 * @param articulo
 * @return boolean
 */
	public boolean annadir(Articulo articulo) {
		almacen.add(articulo);
		return true;
	}
/**
 * Obtiene elemento del almacen(ArrayList)	
 * @param indice
 * @return Articulo
 */
	public Articulo obtieneElemento(int indice) {
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
	public boolean borrarElemento(int indice) {
		if((indice<almacen.size()-1)&&(indice>-1)) {
			almacen.remove(indice);
			return true;
		}
		return false;
	}
	
	public int modificarElemento() {
		
	}
	
	public boolean entradaElemento(Articulo elemento,int cantidad) {
		if(almacen.contains(elemento)) {
			this.annadir(elemento);
			elemento.setStock(elemento.getStock()+cantidad);
		}else{
			this.annadir(elemento);
			elemento.setStock(elemento.getStock()+cantidad);
		}
	}
}
