package gestisimal;
/**
 * Objeto Articulo
 * @author Alberto Miguel Martinez Jimenez
 *
 */
public class Articulo {
	private static int codigo;
	private String descripcion;
	private Double precioCompra;
	private Double precioVenta;
	private int stock;
	private String tipoIva;
	
	Articulo(String descripcion,Double precioCompra,Double precioVenta,int stock,String tipoIva) {
		setCodigo();
		setDescripcion(descripcion);
		setPrecioCompra(precioCompra);
		setPrecioVenta(precioVenta);
		setStock(stock);
		setIva(tipoIva);
	}
	
	private void setCodigo() {
		this.codigo++;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecioCompra() {
		return precioCompra;
	}

	void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return stock;
	}

	void setStock(int stock) {
		this.stock = stock;
	}
	
	

	public String getIva() {
		return tipoIva;
	}

	public void setIva(String tipoIva) {
		this.tipoIva = tipoIva;
	}

	@Override
	public String toString() {
		return "Descripcion: " + descripcion + "\n PrecioCompra: " + precioCompra + "\n PrecioVenta: "
				+ precioVenta + "\n Stock=" + stock;
	}
	
	
}
