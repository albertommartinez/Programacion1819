package coleccionDiscos;
/**
 * Software para gestionar coleccion de discos.
 * Con funcionamiento basado en un array, devuelve
 * error cuando el array esta lleno y da la posiblilidad 
 * de eliminar y crear elementos 
 * @author Alberto Miguel Martinez Jimenez
 * @version 1.0
 */
class Disco {
	private static int id = 0;
	private String titulo = "";
	private String autor = "";
	
	Disco(String titulo,String autor) {
		if(getId()!=0){incrementarId();}
	}
	
	public int getId() {
		return id;
	}
/**
 * setter de Id modificado para restringuir
 * el set a incrementar en una unidad	
 */
	public void incrementarId() {
		this.id = id++;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Disco [titulo=" + titulo + ", autor=" + autor + "]";
	}
	
	
	
}
