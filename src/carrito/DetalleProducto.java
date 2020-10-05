
public class DetalleProducto {
	private int cantidad;
	private Producto prod;
	public DetalleProducto() {
	}
	public void setProducto(Producto p) {
		prod = p;
	}
	public void setCantidad(int c) {
		cantidad = c;
	}
	public Producto getProducto(){
		return prod;
	}
	public int getCantidad() {
		return cantidad;
	}
}
