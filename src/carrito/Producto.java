
public class Producto {
	private String nombre;
	private int precio;
	private String descripcion;
	private int stock;
	public Producto() {
	}
	public Producto(String nombre, int precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setDescripcion(String descrip) {
		descripcion=descrip;
	}
	public int getPrecio() {
		return precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int s) {
		stock=s;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
}
