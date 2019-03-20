package gestisimal;

public class Articulo {
	private static int codigo;
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;
	
	Articulo(String descripcion,double precioCompra,double precioVenta,int stock) {
		setCodigo();
		setDescripcion(descripcion);
		setPrecioCompra(precioCompra);
		setPrecioVenta(precioVenta);
		setStock(stock);
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

	public double getPrecioCompra() {
		return precioCompra;
	}

	void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return stock;
	}

	void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Descripcion: " + descripcion + "\n PrecioCompra: " + precioCompra + "\n PrecioVenta: "
				+ precioVenta + "\n Stock=" + stock;
	}
	
	
}